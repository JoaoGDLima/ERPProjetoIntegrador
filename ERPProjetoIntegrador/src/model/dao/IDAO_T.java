package model.dao;

import static java.util.Collections.list;
import java.util.List;

public interface IDAO_T <T> {

    public String salvar(T o);

    public String atualizar(T o);

    public String excluir(T o);
    
    public Object consultar(String pTabela, String pWhere);
    
    public List consultarTodos(String pTabela, String pWhere, String pAux);
}
