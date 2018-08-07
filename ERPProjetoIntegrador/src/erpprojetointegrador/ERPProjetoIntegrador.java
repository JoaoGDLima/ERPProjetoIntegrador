package erpprojetointegrador;

import config.HibernateUtil;
import javax.swing.JOptionPane;
import view.LoginF;
import view.SplashF;

public class ERPProjetoIntegrador {

    public static void main(String[] args) {
        SplashF wSplash = new SplashF();
        wSplash.setVisible(true);
        
        try {
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
