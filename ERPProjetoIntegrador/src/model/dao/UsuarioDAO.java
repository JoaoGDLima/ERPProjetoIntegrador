package model.dao;

import config.HibernateUtil;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Usuario;
import model.util.Criptografia;
import model.util.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UsuarioDAO extends MasterDAO {

    public UsuarioDAO() {
    }

    public Usuario consultarID(int pID) {
        Usuario wUsuario = null;
        try {
            wUsuario = (Usuario) super.consultar("Usuario", "id_usuario = " + pID);
            wUsuario.setSenha(Usuario.senhaDefault);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wUsuario;
    }

    public Usuario validarusuario(String pUser, String pSenha) {
        List resultado = null;

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery(
                    "FROM Usuario " + 
                    "WHERE username = '" + pUser + "' " + 
                    "AND senha = '" + Criptografia.criptografar(pSenha)  + "'");
            
            resultado = q.list();

            for (Object o : resultado) {
                Usuario wUsuario = (Usuario) o;
                System.out.print("id: " + wUsuario.getIdUsuario() + " ");
                System.out.println("nome: " + wUsuario.getUsername());
                return wUsuario;
            }
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return null;
    }

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome de usuário";
        cabecalho[2] = "Funcionário";
        cabecalho[3] = "Situação";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultado = super.consultarTodos("Usuario", "inativo <> 'T' AND username LIKE '%" + pArgumento + "%'", "ORDER BY id_usuario");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Usuario wUsuario = (Usuario) o;

                dadosTabela[lin][0] = wUsuario.getIdUsuario();
                dadosTabela[lin][1] = wUsuario.getUsername();
                dadosTabela[lin][2] = wUsuario.getIdPessoa();

                String wSituaçao = "Ativo";
                if (wUsuario.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][3] = wSituaçao;
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

}
