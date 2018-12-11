package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.MovimentacaoFinanc;
import model.Pedido;
import model.util.Formatacao;
import model.util.Log;
import org.hibernate.HibernateException;

public class MovimentacaoFinancDAO extends MasterDAO {

    public MovimentacaoFinanc consultarID(int pPedido, int pSeq) {
        MovimentacaoFinanc wParcela = null;
        try {
            wParcela = (MovimentacaoFinanc) super.consultar("MovimentacaoFinanc", "id_pedido = " + pPedido + " AND seq = " + pSeq);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wParcela;
    }

    public void popularTabela(JTable pTable, String pArgumento, int pPedido) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Seq";
        cabecalho[1] = "Valor";
        cabecalho[2] = "Vencimento";
        cabecalho[3] = "Quitação";
        cabecalho[4] = "Cancelamento";

        try {
            resultado = super.consultarTodos("MovimentacaoFinanc", "id_pedido = " + pPedido, "ORDER BY seq");

            dadosTabela = new Object[resultado.size()][5];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                MovimentacaoFinanc wMovFinanc = (MovimentacaoFinanc) o;

                dadosTabela[lin][0] = wMovFinanc.getId().getSeq() + "";
                dadosTabela[lin][1] = wMovFinanc.getValor() + "";
                dadosTabela[lin][2] = Formatacao.ajustaDataDMA(wMovFinanc.getDataVencimento().toString());

                if (wMovFinanc.getDataQuitacao() != null) {
                    dadosTabela[lin][3] = Formatacao.ajustaDataDMA(wMovFinanc.getDataQuitacao().toString());
                } else {
                    dadosTabela[lin][3] = "-";
                }

                if (wMovFinanc.getDataCancelamento() != null) {
                    dadosTabela[lin][4] = Formatacao.ajustaDataDMA(wMovFinanc.getDataCancelamento().toString());
                } else {
                    dadosTabela[lin][4] = "-";
                }

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
}
