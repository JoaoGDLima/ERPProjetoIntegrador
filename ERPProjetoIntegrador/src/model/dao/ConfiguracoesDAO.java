package model.dao;

import model.Configuracoes;
import model.util.Log;
import org.hibernate.HibernateException;

public class ConfiguracoesDAO extends MasterDAO{
        public Configuracoes consultarID(String pID) {
        Configuracoes wConfig = null;
        try {
            wConfig = (Configuracoes) super.consultar("Configuracoes", "chave = '" + pID + "'");
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wConfig;
    }
}
