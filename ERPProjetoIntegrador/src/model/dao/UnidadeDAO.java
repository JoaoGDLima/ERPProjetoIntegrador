package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Unidade;
import org.hibernate.HibernateException;

public class UnidadeDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Sigla";
        cabecalho[3] = "Situação";
        
        try {
            resultado = super.consultarTodos("Unidade", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "ORDER BY id_unidade");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Unidade wUnidade = (Unidade) o;

                dadosTabela[lin][0] = wUnidade.getIdUnidade();
                dadosTabela[lin][1] = wUnidade.getNome();
                dadosTabela[lin][2] = wUnidade.getSigla();

                String wSituaçao = "Ativo";
                if (wUnidade.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }
                
                dadosTabela[lin][3] = wSituaçao;
                
                lin++;
            }
        } catch (Exception e) {
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

    public Unidade consultarID(int pID) {
        Unidade wUnidade = null;
        try {
            wUnidade = (Unidade) super.consultar("Unidade", "id_unidade = " + pID);
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        return wUnidade;
    }

}
