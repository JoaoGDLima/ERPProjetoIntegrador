/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
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
            he.printStackTrace();
        }

        return wCidade;
    }

    public void popularTabela(JTable pTable, String pArgumento) {
        List resultado = null;

        Object[][] dadosTabela = null;

        Object[] cabecalho = new Object[4];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "UF";
        cabecalho[3] = "Situação";

        try {
            resultado = super.consultarTodos("Cidade", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "ORDER BY id_cidade");

            dadosTabela = new Object[resultado.size()][4];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Cidade wCidade = (Cidade) o;

                dadosTabela[lin][0] = wCidade.getIdCidade() + "";
                dadosTabela[lin][1] = wCidade.getNome();
                dadosTabela[lin][2] = wCidade.getIdEstado();

                String wSituaçao = "Ativo";
                if (wCidade.getInativo() == 'T') {
                    wSituaçao = "Inativo";
                }

                dadosTabela[lin][3] = wSituaçao;
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
    }
}
