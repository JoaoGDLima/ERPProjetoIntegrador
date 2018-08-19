package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.FormaPagamento;

public class FormaPagamentoDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;
        
        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Forma de Pagamento";
        cabecalho[2] = "Parcelas";
        cabecalho[3] = "F";
        cabecalho[4] = "Desconto";
        cabecalho[5] = "Acrescimo";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("FormaPagamento", "inativo <> 'T'" + pArgumento + "%'", "ORDER BY nome");

            dadosTabela = new Object[resultado.size()][6];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                FormaPagamento wForma = (FormaPagamento) o;

                dadosTabela[lin][0] = wForma.getIdFormaPagamento();
                dadosTabela[lin][1] = wForma.getNome();
                dadosTabela[lin][2] = wForma.getParcelas();
                dadosTabela[lin][3] = wForma.getInativo();                
                dadosTabela[lin][4] = wForma.getPercDesconto();
                dadosTabela[lin][5] = wForma.getPercAcrescimo();

                String wSituaçao = "Ativo";
                if (wForma.getInativo() == 'T') {
                    wSituaçao = "Inativo";
            }

            dadosTabela[lin][3] = wSituaçao;
            lin++;
        }
    }
    catch (Exception e

    
        ) {
            System.out.println("problemas para popular tabela...");
        System.out.println(e);
    }

    // configuracoes adicionais no componente tabela
    pTable.setModel ( 
        new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
        // quando retorno for FALSE, a tabela nao é editavel
        public boolean isCellEditable
        (int row, int column
        
            ) {
                return false;
        }

        // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
        @Override
        public Class getColumnClass
        (int column
        
            ) {

                if (column == 2) {
                //return ImageIcon.class;
            }
            return Object.class;
        }
    }

    );

        // permite seleção de apenas uma linha da tabela
    pTable.setSelectionMode (
    0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
    for (int i = 0;

    i< pTable.getColumnCount ();
    i

    
        ++) {
            column = pTable.getColumnModel().getColumn(i);
        switch (i) {
            case 0:
                column.setPreferredWidth(17);
                break;
            case 1:
                column.setPreferredWidth(140);
                break;
        }
    }
}

}
