package model.dao;

import config.HibernateUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import org.hibernate.jdbc.Work;

public class MasterDAO extends DAO {
    
    public static int retorno;
    private Session sessao = null;

    public String salvar(Object obj) {
        try {
            salvarAuditoria("INSERT", "Registro novo", obj.toString());
            return super.salvar(obj);
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return e.getMessage();
        }
    }

    public String atualizar(Object obj, Object objOld) {
        try {
            salvarAuditoria("UPDATE", objOld.toString(), obj.toString());
            return super.atualizar(obj);
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return e.getMessage();
        }
    }

    @Override
    public String excluir(Object obj) {
        try {
            salvarAuditoria("INATIVAR", obj.toString() +  "/ {INATIVAR = 'F'}", obj.toString() + "/ {INATIVAR = 'T'}");
            return super.excluir(obj);
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
        if (secaoConexao.Auditoria) {
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
        }
        return null;
    }
    
    public int fazLock(String pTabela, String pChave) {
        String resultado = null;
        Session sessao = null;
        MasterDAO.retorno = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.doWork(new Work() {
                public void execute(Connection connection) throws SQLException {
                    CallableStatement call = connection.prepareCall("{call verifica_lock(?, ?, ?)}");
                    call.setString(1, pTabela); // 1 é o 1º parametro, 10 é o valor
                    call.setString(2, pChave);
                    call.setInt(3, secaoConexao.usuarioLogado.getIdUsuario());
                    ResultSet rs = call.executeQuery();
                    while (rs.next()) {
                        MasterDAO.retorno = rs.getInt(1);
                    }
                }
            });
            
            sessao.getTransaction().commit();
            
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return 0;
        }

        return MasterDAO.retorno;
    }
    
    public int liberaLock(String pTabela, String pChave) {
        String resultado = null;
        Session sessao = null;
        MasterDAO.retorno = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.doWork(new Work() {
                public void execute(Connection connection) throws SQLException {
                    CallableStatement call = connection.prepareCall("{call libera_lock(?, ?)}");
                    call.setString(1, pTabela); // 1 é o 1º parametro, 10 é o valor
                    call.setString(2, pChave);
                    ResultSet rs = call.executeQuery();
                    while (rs.next()) {
                        MasterDAO.retorno = rs.getInt(1);
                    }
                }
            });
            sessao.getTransaction().commit();
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return 0;
        }

        return MasterDAO.retorno;
    }
    
    
    public void liberaLockUsuario() 
    {
        String resultado = null;
        Session sessao = null;
        MasterDAO.retorno = 0;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.doWork(new Work() {
                public void execute(Connection connection) throws SQLException {
                    CallableStatement call = connection.prepareCall("{call libera_lock_usuario(?)}");
                    call.setInt(1, secaoConexao.usuarioLogado.getIdUsuario()); // 1 é o 1º parametro, 10 é o valor
                    call.execute();
                }
            });
            sessao.getTransaction().commit();
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
        }
    }
}
