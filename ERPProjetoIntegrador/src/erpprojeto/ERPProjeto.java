package erpprojeto;

import config.HibernateUtil;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginF;
import view.SplashF;

public class ERPProjeto {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
