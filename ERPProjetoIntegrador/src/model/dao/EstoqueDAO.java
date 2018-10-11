package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Estoque;
import model.util.Log;
import org.hibernate.HibernateException;

public class EstoqueDAO extends MasterDAO {
    
    public Estoque consultarID(int pID) {
        Estoque wEstoque = null;
        try {
            wEstoque = (Estoque) super.consultar("Estoque", "id_produto_est = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wEstoque;
    }
    
    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "Produto";
        cabecalho[1] = "Descrição";
        cabecalho[2] = "Quantidade";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Estoque", pArgumento, "ORDER BY id_produto_est");

            dadosTabela = new Object[resultado.size()][3];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Estoque wEstoque = (Estoque) o;

                dadosTabela[lin][0] = wEstoque.getId_produto_est();
                dadosTabela[lin][1] = new ProdutoDAO().consultarID(wEstoque.getId_produto_est()).getDescricao();
                dadosTabela[lin][2] = wEstoque.getQuantidade() + "";

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
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
            }
        }
    }
}
