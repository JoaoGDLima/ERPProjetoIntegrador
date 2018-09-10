package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Tela;
import model.util.Log;


public class TelaDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Permissão";

        try {
            resultado = super.consultarTodos("Tela", "nome LIKE '%" + pArgumento + "%'", "ORDER BY id_tela");

            dadosTabela = new Object[resultado.size()][3];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Tela wTela = (Tela) o;

                dadosTabela[lin][0] = wTela.getIdTela();
                dadosTabela[lin][1] = wTela.getNome();
                dadosTabela[lin][2] = "";
                
                lin++;
            }
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        pTable.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //return ImageIcon.class;
                }
                return Object.class;
            }
        });
    }
    
}
