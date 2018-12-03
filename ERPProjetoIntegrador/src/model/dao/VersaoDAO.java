package model.dao;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Cidade;
import model.Versao;
import model.util.Log;
import org.hibernate.HibernateException;

public class VersaoDAO extends MasterDAO {
    public Versao consultarPendentes(Integer pID) {
        Versao wVersao = null;
        try {
            wVersao = (Versao) super.consultar("Versao", "id_versao = " + pID + " AND lido <> 'T'");
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wVersao;
    }
    
     public Versao consultarID(int pID) {
        Versao wVersao = null;
        try {
            wVersao = (Versao) super.consultar("Versao", "id_versao = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wVersao;
    }
    
    public void popularTabela(JList pLista) {
        List resultado = null;

        try {
            DefaultListModel modelo = new DefaultListModel();
        
            resultado = super.consultarTodos("Versao", "", "ORDER BY versao");

            for (Object o : resultado) {
                Versao wVersao = (Versao) o;
                modelo.addElement(wVersao.getIdVersao() + " - " + wVersao.getVersao());
            }
            pLista.setModel(modelo);
            
        } catch (Exception e) 
        {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }
    }
}
