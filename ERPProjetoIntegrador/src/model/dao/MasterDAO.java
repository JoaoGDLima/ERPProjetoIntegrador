package model.dao;

import config.HibernateUtil;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.Auditoria;
import model.Usuario;
import model.secaoConexao;
import model.util.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MasterDAO extends DAO {

    private Session sessao = null;

    public String salvar(Object obj) {
        try {
            salvarAuditoria("INSERT", "Registro novo", obj.toString());
            super.salvar(obj);
            return null;
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return e.getMessage();
        }
    }

    public String atualizar(Object obj, Object objOld) {
        try {
            salvarAuditoria("UPDATE", objOld.toString(), obj.toString());
            super.atualizar(obj);
            return null;
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return e.getMessage();
        }
    }

    @Override
    public String excluir(Object obj) {
        try {
            
            salvarAuditoria("UPDATE - INATIVAR", "Inativo = 'F'", "Inativo = 'T'");
            super.excluir(obj);
            return null;
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
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
            Log.gravaLogException(this.getClass(), he);
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
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
            System.out.println("Erro ao consultar a tabela '" + pTabela + "': " + he.getMessage());
        }

        return null;
    }

    private String salvarAuditoria(String pAcao, String pRegistroOld, String pRegistroNew) throws ParseException {
        try {
            SimpleDateFormat sdData = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdHora = new SimpleDateFormat("HH:mm");
            Calendar cal = new GregorianCalendar();
            
            Date dataaux = new Date();
            Date data = sdHora.parse(sdHora.format(dataaux));
            Time time = new Time(data.getTime());
            
            Auditoria auditor = new Auditoria();
            
            auditor.setUsuario(secaoConexao.usuarioLogado);
            auditor.setAcao(pAcao);
            auditor.setDatahora(cal.getTime());
            auditor.setRegistro_old(pRegistroOld);
            auditor.setRegistro_new(pRegistroNew);
            
            super.salvar(auditor);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            return he.getMessage();
        }
        return null;
    }
}
