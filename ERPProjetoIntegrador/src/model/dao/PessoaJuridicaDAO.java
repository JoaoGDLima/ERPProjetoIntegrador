package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.PessoaJuridica;
import org.hibernate.HibernateException;

class PessoaJuridicaDAO extends MasterDAO{
        public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[5];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "CPF";
        cabecalho[3] = "Situação";

        try {
            resultado = super.consultarTodos("Funcionario", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "");

            dadosTabela = new Object[resultado.size()][5];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                PessoaJuridica wFunc = (PessoaJuridica) o;

                dadosTabela[lin][0] = wFunc.getIdPessoa() + "";
                dadosTabela[lin][1] = wFunc.getNome();
                dadosTabela[lin][2] = wFunc.getCnpj() + "";
                dadosTabela[lin][3] = wFunc.getIe()+ "";
                
                String wSituaçao = "Ativo";
                if (wFunc.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][4] = wSituaçao;
                lin++;
            }
        } catch (Exception e) {
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
                    column.setPreferredWidth(10);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;
            }
        }
    }

    public PessoaJuridica consultarID(int pID) {
        PessoaJuridica wJuridica = null;
        try {
            wJuridica = (PessoaJuridica) super.consultar("Funcionario", "id_pessoa_juridica = " + pID);
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        return wJuridica;
    }
}
