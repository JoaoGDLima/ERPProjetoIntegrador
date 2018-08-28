package model.dao;

import config.HibernateUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javassist.compiler.TokenId;
import javax.persistence.ParameterMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Produto;
import model.util.Log;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.procedure.ProcedureOutputs;
import org.hibernate.result.ResultSetOutput;

public class ProdutoDAO extends MasterDAO {
    public static String retorno; 
    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Descrição completa";
        cabecalho[2] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Produto", "inativo <> 'T'", ""); //  AND nome ILIKE'%" + pArgumento + "%'

            dadosTabela = new Object[resultado.size()][3];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Produto wProduto = (Produto) o;

                dadosTabela[lin][0] = wProduto.getIdProduto() + "";
                dadosTabela[lin][1] = descricaoCompleta(wProduto.getIdProduto());

                String wSituaçao = "Ativo";
                if (wProduto.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][2] = wSituaçao;
                lin++;
            }
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        pTable.setModel(
                new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column
            ) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column
            ) {

                if (column == 2) {
                    //return ImageIcon.class;
                }
                return Object.class;
            }
        }
        );

        // permite seleção de apenas uma linha da tabela
        pTable.setSelectionMode(
                0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0;
                i < pTable.getColumnCount();
                i++) {
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

    public Produto consultarID(int pID) {
        Produto wFormaPagamento = null;
        try {
            wFormaPagamento = (Produto) super.consultar("Produto", "id_produto = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wFormaPagamento;
    }

    public String descricaoCompleta(int pCodigo) {
        /* try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.doWork(new Work() 
              {
                public void execute(Connection connection) throws SQLException 
                {
                    CallableStatement call = connection.prepareCall("{ call retorna_descricaocompleta_produto(?) }");
                    call.setInt(1, pCodigo); // 1 é o 1º parametro, 10 é o valor
                    call.execute();
                }
            });

            sessao.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("erro da função: " + e);
        }
        
        
         */
        String resultado = null;
        Session sessao = null;

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.doWork(new Work() {
                public void execute(Connection connection) throws SQLException {
                    CallableStatement call = connection.prepareCall("{call retorna_descricaocompleta_produto(?)}");
                    call.setInt(1, pCodigo); // 1 é o 1º parametro, 10 é o valor
                    ResultSet rs = call.executeQuery();
                    while (rs.next()) {
                        ProdutoDAO.retorno = rs.getString(1);
                    }
                }
            });

            /*sessao = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Query q = sessao.createSQLQuery("SELECT retorna_descricaocompleta_produto(" + pCodigo + ")");
            resultado = q.list();
            sessao.beginTransaction();
            
            for (Object o : resultado) {
                return (String) o;
            }*/
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            return e.getMessage();
        }

        return ProdutoDAO.retorno;
    }

}
