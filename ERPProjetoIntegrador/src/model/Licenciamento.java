/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import org.jdom2.JDOMException;

/**
 *
 * @author Jeferson
 */
public class Licenciamento {
    static KeyGenerator keygenerator;    
    static Cipher cifraDES = null;
    static SecretKey chaveDES = null;
        
    
    public static SecretKey CriaLicenca(String usuario, String validade)//Digitar dd_MM_yyyy na validade
    {                
        try
        {                            
            keygenerator = KeyGenerator.getInstance("DES");            
            Licenciamento.chaveDES = keygenerator.generateKey();
            cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cifraDES.init(Cipher.ENCRYPT_MODE, chaveDES); 
            secaoConexao.configs = XmlTools.LerXML();            
            java.io.File file = new java.io.File(secaoConexao.configs.path+"/licenca_" + usuario + "_" + validade + ".lic");
            FileOutputStream in = new FileOutputStream(file) ;
            
            
            byte[] TextoPuro = (usuario+"=\r\n"+validade.toString()).getBytes("UTF8");
            byte[] TextoEncriptado = cifraDES.doFinal(TextoPuro);
            in.write(TextoEncriptado);
            in.close();
            
            
        }
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        } 
        catch (InvalidKeyException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
             e.printStackTrace();
        } 
        catch (IllegalBlockSizeException e) 
        {
            e.printStackTrace();
        }
        catch (BadPaddingException e) 
        {
            e.printStackTrace();
        } 
        catch (NoSuchPaddingException e) 
        {
            e.printStackTrace();
        } catch (JDOMException ex) {
            Logger.getLogger(Licenciamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chaveDES;    
    }

    public static boolean LerLicenca(String arquivo, String usuario)//retorna verdadeiro se expirou
    {
        try 
        {
            cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cifraDES.init(Cipher.DECRYPT_MODE, chaveDES);
            //FileReader arq = new FileReader(arquivo);
            FileInputStream in = new FileInputStream(arquivo);
            //BufferedReader lerArq = new BufferedReader(arq);
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            //String TextoCriptografado = lerArq.readLine();                        
            int bytesread = 0;
			byte[] tbuff = new byte[512];
			while (true) {
				bytesread = in.read(tbuff);
				if (bytesread == -1) // if EOF
					break;
				buffer.write(tbuff, 0, bytesread);
			}
            byte[] textoDecriptografado = cifraDES.doFinal(buffer.toByteArray());            
            String temp = new String(textoDecriptografado,"UTF8");
            String dados[] = new String[3];
            dados = temp.split("=");
            System.out.println(dados[0] + "...."+dados[1]);
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd_MM_yyyy"); 
            System.out.println(formatador.format( data ));
            if(dados[0].equals(usuario))
                    {
                        if(Licenciamento.ComparaData(dados[1],formatador.format( data ))) return true;
                    }                                                    
        } 
        catch (InvalidKeyException e) 
        {
            e.printStackTrace();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IllegalBlockSizeException e) 
        {
            e.printStackTrace();
        }
        catch (BadPaddingException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        } 
        catch (NoSuchPaddingException e) 
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ComparaData(String data1, String data2) //returna verdadeiro se data1(cliente) 
                                                           //é maior que data2(licenca), expirou                                        
    {
        String cliente[] = data1.split("_");
        String licenca[] = data2.split("_");
        if(Integer.parseInt(cliente[2])<Integer.parseInt(licenca[2])) return false;
        if(Integer.parseInt(cliente[2])==Integer.parseInt(licenca[2]))
        {                
            if(Integer.parseInt(cliente[1])<Integer.parseInt(licenca[1])) return false;
            if(Integer.parseInt(cliente[1])==Integer.parseInt(licenca[1]))
            {
                if(Integer.parseInt(cliente[0])<=Integer.parseInt(licenca[0]))
                {
                    return false;
                }
            }
        }
        return true;
    }
            
}
