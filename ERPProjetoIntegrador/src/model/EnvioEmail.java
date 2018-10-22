package model;

import static com.oracle.jrockit.jfr.ContentType.Address;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnvioEmail {

    private static String emailRemetente = "projetointegrador1790@gmail.com";
    private static String senhaRemetente = "ProjetoIntegrador123";
    private Session session;

    public EnvioEmail() {
        /**
         * Parâmetros de conexão com servidor Gmail
         */
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        this.session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EnvioEmail.emailRemetente, EnvioEmail.senhaRemetente);
                    }
                });

        /**
         * Ativa Debug para sessão
         */
        this.session.setDebug(true);
    }

    public String enviaEmail(String pDestinatario, String pAssunto, String pMensagem, String pCaminhoAnexo) {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EnvioEmail.emailRemetente)); //Remetente

            Address[] toUser = InternetAddress.parse(pDestinatario);

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(pAssunto);//Assunto

            /*message.setText(pMensagem);
            
             if ((pCaminhoAnexo != "") && (pCaminhoAnexo != null) ) {
             FileDataSource fds = new FileDataSource(pCaminhoAnexo);
             message.setDataHandler(new DataHandler(fds));
             message.setFileName(fds.getName());
             }*/
            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText(pMensagem);

            Multipart multiPart = new MimeMultipart();
            multiPart.addBodyPart(bodyPart);

            File file;
            MimeBodyPart anexo;

            file = new File(pCaminhoAnexo);
            anexo = new MimeBodyPart();
            anexo.setDataHandler(new DataHandler(new FileDataSource(file)));
            anexo.setFileName(file.getName());
            multiPart.addBodyPart(anexo);

            message.setContent(multiPart);

            Transport.send(message);
        } catch (MessagingException e) {
            return e.getMessage();
        }

        return null;
    }

}
