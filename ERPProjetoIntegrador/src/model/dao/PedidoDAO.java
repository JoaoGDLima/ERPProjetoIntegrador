package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Pedido;
import model.util.Formatacao;
import model.util.Log;
import org.hibernate.HibernateException;


public class PedidoDAO extends MasterDAO{
    
    public Pedido consultarID(int pID) {
        Pedido wPedido = null;
        try {
            wPedido = (Pedido) super.consultar("Pedido", "id_pedido = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wPedido;
    }

    public void popularTabela(JTable pTable, String pArgumento, int pCliente, char pTipo) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[7];
        cabecalho[0] = "ID";
        cabecalho[1] = "Tipo";
        cabecalho[2] = "Situação"; 
        cabecalho[3] = "Vendedor";
        cabecalho[4] = "Forma pagamento";
        cabecalho[5] = "Data pedido";
        cabecalho[6] = "Valor total"; 
        
        try {
            resultado = super.consultarTodos("Pedido", "id_cliente = " + pCliente + " and tipo = '" + pTipo + "'", "ORDER BY id_pedido");

            dadosTabela = new Object[resultado.size()][7];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Pedido wPedido = (Pedido) o;

                dadosTabela[lin][0] = wPedido.getIdPedido() + "";
                
                String wTipo = "";
                if (wPedido.getTipo() == 'C') {
                    wTipo = "Compra";
                }
                else{
                    wTipo = "Venda";
                }
                
                String wSituaçao = "Realizado";
                if (wPedido.getSituacao() == 'C') {
                    wSituaçao = "Cancelado";
                }
                
                dadosTabela[lin][1] = wTipo;
                dadosTabela[lin][2] = wSituaçao;
                dadosTabela[lin][3] = wPedido.getIdVendedor() + " " + new FuncionarioDAO().consultarID(wPedido.getIdVendedor()).getNome();
                dadosTabela[lin][4] = wPedido.getIdFormaPagamento() + " " + new FormaPagamentoDAO().consultarID(wPedido.getIdFormaPagamento()).getNome();
                dadosTabela[lin][5] = Formatacao.ajustaDataDMA(wPedido.getDataPedido().toString());
                dadosTabela[lin][6] = wPedido.getValorTotal() + "";         

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
