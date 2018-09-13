/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Cidade;
import model.util.Log;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeferson
 */
public class CidadeDAO extends MasterDAO {

    public CidadeDAO() {

    }

    public Cidade consultarID(int pID) {
        Cidade wCidade = null;
        try {
            wCidade = (Cidade) super.consultar("Cidade", "id_cidade = " + pID);
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }

        return wCidade;
    }

    
    public void liberaLock(int pID) {
        try {
            super.liberaLock("Cidade", pID + "");
        } catch (HibernateException he) {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }
    }
    
    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Estado";
        cabecalho[3] = "Situação";

        try {
            resultado = super.consultarTodos("Cidade", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%' AND estado.inativo <> 'T'", "ORDER BY id_cidade");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Cidade wCidade = (Cidade) o;

                dadosTabela[lin][0] = wCidade.getIdCidade() + "";
                dadosTabela[lin][1] = wCidade.getNome();
                dadosTabela[lin][2] = wCidade.getEstado().getNome() + " - " + wCidade.getEstado().getUf();

                String wSituaçao = "Ativo";
                if (wCidade.getInativo() == 'T') {
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
}
