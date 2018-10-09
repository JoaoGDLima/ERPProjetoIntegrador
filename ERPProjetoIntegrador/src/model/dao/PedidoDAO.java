package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Pedido;
import model.util.Log;


public class PedidoDAO extends MasterDAO{

    public void popularTabela(JTable pTable, String pArgumento, int pCliente) {
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
            resultado = super.consultarTodos("Pedido", "id_cliente = " + pCliente, "ORDER BY id_pedido");

            dadosTabela = new Object[resultado.size()][7];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Pedido wPedido = (Pedido) o;

                /*dadosTabela[lin][0] = wPedido.getIdCidade() + "";
                dadosTabela[lin][1] = wPedido.getNome();
                dadosTabela[lin][2] = wPedido.getEstado().getNome() + " - " + wPedido.getEstado().getUf();
                */          
                
                String wSituaçao = "Realizado";
                if (wPedido.getSituacao() == 'C') {
                    wSituaçao = "Cancelado";
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
    
}
