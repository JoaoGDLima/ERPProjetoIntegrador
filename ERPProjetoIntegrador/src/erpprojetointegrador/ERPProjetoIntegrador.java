package erpprojetointegrador;

import config.HibernateUtil;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.dao.ConexaoBD;
import view.LoginF;
import view.SplashF;

public class ERPProjetoIntegrador {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        SplashF wSplash = new SplashF();
        wSplash.setVisible(true);

        try {
            if (ConexaoBD.getInstance().getConnection() != null) {
                System.out.println("Conexao relatorio OK"); 
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao acessar o sistema!");
            }

            if (HibernateUtil.getSessionFactory().openSession() != null) {
                wSplash.dispose();
                new LoginF().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao acessar o sistema!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao acessar o sistema: " + e.getMessage());
        }

    }

}
