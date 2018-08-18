package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Cargos;
import org.hibernate.HibernateException;

public class CargosDAO extends MasterDAO {

    public Cargos consultarID(int pID) 
    {
        Cargos wCargos = null;
        try {
            wCargos = (Cargos) super.consultar("Cargos", "id_cargos = " + pID);
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        return wCargos;
    }
        
    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Cargos", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "ORDER BY id_cargos");

            dadosTabela = new Object[resultado.size()][3];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Cargos wCargos = (Cargos) o;

                dadosTabela[lin][0] = wCargos.getIdCargos();
                dadosTabela[lin][1] = wCargos.getNome();

                String wSituaçao = "Ativo";
                if (wCargos.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][2] = wSituaçao;
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

        // permite seleção de apenas uma linha da tabela
        pTable.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < pTable.getColumnCount(); i++) {
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
