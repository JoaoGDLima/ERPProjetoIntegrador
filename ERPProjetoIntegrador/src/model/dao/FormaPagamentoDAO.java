package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FormaPagamentoDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome de usuário";
        cabecalho[2] = "Funcionário";
        cabecalho[3] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Usuario", "inativo <> 'T' AND username ILIKE '%" + pArgumento + "%'", "");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                FormaPagamentoDAO wForma = (FormaPagamentoDAO) o;

                /*dadosTabela[lin][0] = wUsuario.getIdUsuario();
                dadosTabela[lin][1] = wUsuario.getUsername();
                dadosTabela[lin][2] = wUsuario.getIdPessoa();**/

 /*String wSituaçao = "Ativo";
                if (wUsuario.getInativo() == 'T') {
                    wSituaçao = "Inativo";*/
            //}

            //dadosTabela[lin][3] = wSituaçao;
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
