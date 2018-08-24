package model.dao;

import config.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO implements IDAO_T<Object> {

    private Session sessao = null;

    @Override
    public String salvar(Object obj) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();
            sessao.save(obj);
            t.commit();
            sessao.close();
            return null;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String atualizar(Object obj) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();
            sessao.update(obj);
            t.commit();
            sessao.close();
            return null;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String excluir(Object obj) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();
            sessao.update(obj);
            t.commit();
            sessao.close();
            return null;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public Object consultar(String pTabela, String pWhere) {
        List resultado = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("FROM " + pTabela + " "
                    + "WHERE " + pWhere);
            resultado = q.list();
            sessao.close();
            for (Object o : resultado) {
                return o;
            }
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        return null;
    }

    @Override
    public List consultarTodos(String pTabela, String pWhere, String pAux) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("FROM " + pTabela + " "
                    + "WHERE " + pWhere + " "
                    + pAux);
            return q.list();

        } catch (HibernateException he) {
            he.printStackTrace();
            System.out.println("Erro ao consultar a tabela '" + pTabela + "': " + he.getMessage());
        }

        return null;
    }

}
