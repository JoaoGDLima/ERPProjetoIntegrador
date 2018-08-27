/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Estado;
import model.util.Log;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeferson
 */
public class EstadoDAO extends MasterDAO{
 
    
    public EstadoDAO() 
    {
        
    }
    
    public Estado consultarID(int pID)
    {
        Estado wEstado = null;
        try{
            wEstado = (Estado)super.consultar("Estado", "id_estado = " + pID);                        
        }
        catch(HibernateException he)
        {
            Log.gravaLogException(this.getClass(), he);
            he.printStackTrace();
        }
        
        return wEstado;
    }
    
    public void popularTabela(JTable pTable, String pArgumento)
    {
        List resultado = null;
        
        Object[][] dadosTabela = null;
        
        Object[] cabecalho = new Object[3];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "UF";
        
        try
        {
            resultado = super.consultarTodos("Estado", "inativo <> 'T' AND nome LIKE '%" + pArgumento + "%'", "ORDER BY id_estado");

            dadosTabela = new Object[resultado.size()][3];

            int lin = 0;
            // efetua consulta na tabela
            for (Object o : resultado) {
                Estado wEstado = (Estado) o;
                
                dadosTabela[lin][0] = wEstado.getIdEstado();
                dadosTabela[lin][1] = wEstado.getNome();
                dadosTabela[lin][2] = wEstado.getUf();
                               
                lin++;
            }
        }
        catch(Exception e)
        {
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
    }
}
