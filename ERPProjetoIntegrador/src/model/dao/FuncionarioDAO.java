package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Funcionario;
import model.util.Log;
import org.hibernate.HibernateException;

public class FuncionarioDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CPF";
        cabecalho[3] = "Situação";

        try {
            resultado = super.consultarTodos("Funcionario", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Funcionario wFunc = (Funcionario) o;

                dadosTabela[lin][0] = wFunc.getIdPessoa() + "";
                dadosTabela[lin][1] = wFunc.getNome();
                dadosTabela[lin][2] = wFunc.getCpf() + "";

                String wSituaçao = "Ativo";
                if (wFunc.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][3] = wSituaçao;
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

        // permite seleção de apenas uma linha da tabela
        pTable.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < pTable.getColumnCount(); i++) {
            column = pTable.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(10);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;
            }
        }
    }

    public Funcionario consultarID(int pID) {
        Funcionario wFunc = null;
        try {
            wFunc = (Funcionario) super.consultar("Funcionario", "id_pessoa_func = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wFunc;
    }

}
