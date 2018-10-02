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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Auditoria;
import model.Usuario;
import model.secaoConexao;
import model.util.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;

public class AuditoriaDAO extends MasterDAO {

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Usuário";
        cabecalho[2] = "Data e hora";
        cabecalho[3] = "Ação";
        cabecalho[4] = "Registro antigo";
        cabecalho[5] = "Registro novo";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Auditoria", pArgumento, "ORDER BY datahora");

            dadosTabela = new Object[resultado.size()][6];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Auditoria wAuditoria = (Auditoria) o;

                dadosTabela[lin][0] = wAuditoria.getIdAuditoria();
                dadosTabela[lin][1] = wAuditoria.getUsuario().getIdUsuario() + "";
                dadosTabela[lin][2] = wAuditoria.getDatahora();
                dadosTabela[lin][3] = wAuditoria.getAcao();
                dadosTabela[lin][4] = wAuditoria.getRegistro_old();
                dadosTabela[lin][5] = wAuditoria.getRegistro_new();

                lin++;
            }
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        pTable.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        pTable.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < pTable.getColumnCount(); i++) {
            column = pTable.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
            }
        }
    }

    public void arquivarAuditoria(String pNome, String pDataIni, String pDataFim) 
    {
        String resultado = null;
        Session sessao = null;
        
        try 
        {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            sessao.doWork(new Work() {
                public void execute(Connection connection) throws SQLException {
                    CallableStatement call = connection.prepareCall("{call arquivar_auditoria(?, ?, ?)}");
                    call.setString(1, pNome + "_" + pDataIni + "_" + pDataFim); 
                    call.setString(2, pDataIni); 
                    call.setString(3, pDataFim);
                    call.execute();
                }
            });
            
            
            sessao.getTransaction().commit();
        } catch (Exception e) 
        {
            Log.gravaLogException(this.getClass(), e);
        }
    }

}
