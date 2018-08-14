package model.dao;

import config.HibernateUtil;
import java.util.List;
import javax.swing.JComboBox;
import model.Estado;
import model.util.ComboItens;
import org.hibernate.Session;

public class ComboDAO extends MasterDAO{

    public void popularComboEstado(JComboBox combo) {
        List resultado = null;
        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        try {
            resultado = super.consultarTodos("Estado", "inativo <> 'T'", "ORDER BY nome");

            for (Object object : resultado) {
                Estado wEstado = (Estado) object;
                item = new ComboItens();
                item.setCodigo(wEstado.getIdEstado());
                item.setDescricao(wEstado.getNome() + " - " + wEstado.getUf());

                combo.addItem(item);
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }
    
    public void definirItemCombo(JComboBox combo, ComboItens item) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (((ComboItens) combo.getItemAt(i)).getCodigo() == (item.getCodigo())) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }
}
