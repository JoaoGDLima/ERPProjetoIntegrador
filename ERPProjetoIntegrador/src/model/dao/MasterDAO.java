package model.dao;

//import config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MasterDAO implements IDAO_T<Object> {

    private Session sessao = null;

    @Override
    public String salvar(Object obj) {
        //sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.save(obj);
        t.commit();
        return "";
    }

    @Override
    public String atualizar(Object obj) {
        //sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.update(obj);
        t.commit();
        return "";
    }

    @Override
    public String excluir(Object obj) {
        //sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.delete(obj);
        t.commit();
        return "";
    }

}
