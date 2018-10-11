package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.ItensPedido;

public class ItensPedidoDAO extends MasterDAO {

    public List<ItensPedido> caarregaItensPedido(Integer pPedido) {
        List<ItensPedido> wItensPedido = new ArrayList();

        List resultado = super.consultarTodos("ItensPedido", "id_pedido = " + pPedido, "order by id_produto");

        for (Object o : resultado) {
            ItensPedido wItemPedido = (ItensPedido) o;
            wItensPedido.add(wItemPedido);
        }

        return wItensPedido;
    }
}
