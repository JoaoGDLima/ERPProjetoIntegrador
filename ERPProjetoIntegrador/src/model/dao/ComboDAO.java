package model.dao;

import config.HibernateUtil;
import java.util.List;
import javax.swing.JComboBox;
import model.Cargos;
import model.Cidade;
import model.Estado;
import model.util.ComboItens;
import org.hibernate.Session;

public class ComboDAO extends MasterDAO {

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

    public void popularComboCargos(JComboBox combo) {
        List resultado = null;
        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        try {
            resultado = super.consultarTodos("Cargos", "inativo <> 'T'", "ORDER BY nome");

            for (Object object : resultado) {
                Cargos wCargos = (Cargos) object;
                item = new ComboItens();
                item.setCodigo(wCargos.getIdCargos());
                item.setDescricao(wCargos.getNome());

                combo.addItem(item);
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboCidades(JComboBox combo) {
        List resultado = null;
        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione");
        combo.addItem(item);

        try {
            resultado = super.consultarTodos("Cidade", "inativo <> 'T'", "ORDER BY nome");

            for (Object object : resultado) {
                Cidade wCidade = (Cidade) object;
                item = new ComboItens();
                item.setCodigo(wCidade.getIdCidade());
                item.setDescricao(wCidade.getNome() + " - " + wCidade.getEstado().getUf());

                combo.addItem(item);
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }
}
