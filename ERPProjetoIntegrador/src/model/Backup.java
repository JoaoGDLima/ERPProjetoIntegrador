/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jeferson
 */
public class Backup {
           
    
    
        public static void realizaRestore(String arquivo) throws IOException, InterruptedException{      
           final List<String> comandos = new ArrayList<String>(); 
          
            
                
           comandos.add("C:\\Arquivos de programas\\PostgreSQL\\10\\bin\\pg_restore.exe"); //testado no windows xp
           //comandos.add("-i");      
           comandos.add("-h");      
           comandos.add("localhost");    //ou   comandos.add("192.168.0.1"); 
           comandos.add("-p");      
           comandos.add("5432");      
           comandos.add("-U");      
           comandos.add("postgres");      
           comandos.add("-d");      
           comandos.add("ProjetoIntegrador");     
           comandos.add("-v");      
           comandos.add(""+arquivo);   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  
           ProcessBuilder pb = new ProcessBuilder(comandos);      
           pb.environment().put("PGPASSWORD", "postgres");     //Somente coloque sua senha         
           try {      
               final Process process = pb.start();      
               final BufferedReader r = new BufferedReader(      
                   new InputStreamReader(process.getErrorStream()));      
               String line = r.readLine();      
               while (line != null) {      
               System.err.println(line);      
               line = r.readLine();      
               }      
               r.close();      
               process.waitFor();    
               process.destroy(); 
               JOptionPane.showMessageDialog(null,"Restore realizado com sucesso.");  
           } catch (IOException e) {      
               e.printStackTrace();      
           } catch (InterruptedException ie) {      
               ie.printStackTrace();      
           }         
       }    
        
        
        public static void realizaBackup() throws IOException, InterruptedException{      
           final List<String> comandos = new ArrayList<String>();      
           Date d = new Date();
           SimpleDateFormat formatador = new SimpleDateFormat("dd_MM_yyyy_hh_mm");
           comandos.add("C:\\Arquivos de programas\\PostgreSQL\\10\\bin\\pg_dump.exe");    // esse é meu caminho  
           //comandos.add("-i");      
           comandos.add("-h");      
           comandos.add("127.0.0.1");     //ou  comandos.add("192.168.0.1"); 
           comandos.add("-p");      
           comandos.add("5432");      
           comandos.add("-U");      
           comandos.add("postgres");      
           comandos.add("-F");      
           comandos.add("c");      
           comandos.add("-b");      
           comandos.add("-v");      
           comandos.add("-f");      
           comandos.add("D:\\"+formatador.format( d )+".backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  
           comandos.add("ProjetoIntegrador");      
           ProcessBuilder pb = new ProcessBuilder(comandos);      
           pb.environment().put("PGPASSWORD", "postgres");               
           try {      
               final Process process = pb.start();      
               final BufferedReader r = new BufferedReader(      
                   new InputStreamReader(process.getErrorStream()));      
               String line = r.readLine();      
               while (line != null) {      
               System.err.println(line);      
               line = r.readLine();      
               }      
               r.close();      
               process.waitFor();    
               process.destroy(); 
               JOptionPane.showMessageDialog(null,"backup realizado com sucesso.");  
           } catch (IOException e) {      
               e.printStackTrace();      
           } catch (InterruptedException ie) {      
               ie.printStackTrace();      
           }         
       }      
        
}

