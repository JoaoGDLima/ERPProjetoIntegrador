package model.dao;

import java.util.ArrayList;

public interface IDAO_T <T> {

    public String salvar(T o);

    public String atualizar(T o);

    public String excluir(T o);
}
