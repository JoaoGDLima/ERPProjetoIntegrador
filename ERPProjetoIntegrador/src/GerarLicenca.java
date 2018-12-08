
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
import model.Licenciamento;
import model.secaoConexao;
import view.CadastroEstadoF;


public class GerarLicenca {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd_MM_yyyy");
        try {
            data = formatador.parse("08_12_2019");
        } catch (ParseException ex) {
            Logger.getLogger(CadastroEstadoF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SecretKey wKey = Licenciamento.CriaLicenca(formatador.format(data));
        
        java.io.File file = new java.io.File(secaoConexao.path+"chave.lic");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        obj.writeObject(wKey);
         JOptionPane.showMessageDialog(null, "Arquivo de licença gerado com sucesso. Disponivel no diretorio atualmente configurado no programa.");

    }
 
}
