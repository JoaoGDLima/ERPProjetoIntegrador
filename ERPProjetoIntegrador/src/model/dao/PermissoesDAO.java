package model.dao;

import model.Permissoes;
import model.util.Log;
import org.hibernate.HibernateException;


public class PermissoesDAO extends MasterDAO
{
    public Permissoes consultarID(int pTela, int pUsuario) 
    {
        Permissoes wPermissoes = null;
        try {
            wPermissoes = (Permissoes) super.consultar("Permissoes", "id_tela_perm = " + pTela + " AND id_usuario_perm = " + pUsuario);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wPermissoes;
    }
}
