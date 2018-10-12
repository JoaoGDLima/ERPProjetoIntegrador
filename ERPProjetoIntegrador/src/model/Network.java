/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Network {
    
    public String FILE_TO_SEND;
    public String FILE_TO_RECEIVE;
   
    Socket cliente;
    MulticastSocket cliente_m;
    int porta = 5001;
    String Address = "127.0.0.1";
    DataInputStream in;
    DataOutputStream out;
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    
    public Network(String modo) throws IOException
    {
        if(modo.equals("File"))
        {
            cliente = new Socket(Address, porta);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
        }
        
        if(modo.equals("Multicast"))
        {
                cliente_m = new MulticastSocket(porta);
                InetAddress ia = InetAddress.getByName(Address);
                cliente_m.joinGroup(ia);
        }
        
    }
    
    public void SendMessage(String message) throws IOException
    {
        out.writeUTF(message);
    }
    
    public void SendInt(int a) throws IOException
    {
        out.writeInt(a);
    }
    
    public String Close() 
    {
        try
        {
            if (cliente!=null)
            {
                cliente.close();
                // cliente_m.close();
                in.close();
                out.close();
                return "Conexão encerrada";
            }            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return "Falha ao encerrar conexão";
    }

     public String getFILE_TO_RECEIVE() {
        return FILE_TO_RECEIVE;
    }

    public void setFILE_TO_RECEIVE(String FILE_TO_RECEIVE) {
        this.FILE_TO_RECEIVE = FILE_TO_RECEIVE;
    }
    
    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
   

    public String getFILE_TO_SEND() {
        return FILE_TO_SEND;
    }

    public void setFILE_TO_SEND(String FILE_TO_SEND) {
        this.FILE_TO_SEND = FILE_TO_SEND;
    }        
    
    public synchronized void EnviaArquivo() throws FileNotFoundException, IOException
    {
        File myFile = new File (FILE_TO_SEND);
        byte [] mybytearray  = new byte [4096];
        fis = new FileInputStream(myFile);                    
        bis = new BufferedInputStream(fis);                    
                           
       
        out.writeInt((int)myFile.length());
        while(bis.read(mybytearray,0,mybytearray.length)!=-1)
        {
            System.out.println("Enviando " + FILE_TO_SEND + "(" + mybytearray.length + " bytes)");                     
        
            out.write(mybytearray,0,mybytearray.length);              
        }
        fis.close();
        bis.close();
    }
    public synchronized String CopiaArquivo(String pFile) throws FileNotFoundException, IOException
        {
            String FILE_TO_RECEIVE = pFile;
            int FILE_SIZE = in.readInt();
            int bytesRead;
            int current = 0;
            FileOutputStream fos;
            BufferedOutputStream bos;            
            JOptionPane.showMessageDialog(null, "Recebendo Arquivo");
            byte [] mybytearray  = new byte [FILE_SIZE];
            fos = new FileOutputStream(FILE_TO_RECEIVE);
            bos = new BufferedOutputStream(fos);
           
                        while(( current < FILE_SIZE))                             
                        {
                            bytesRead =
                            in.read(mybytearray, current, (mybytearray.length-current));
                            if(bytesRead >= 0) current += bytesRead;  
                            System.out.println("Arquivo " + FILE_TO_RECEIVE
                         + " baixado (" + current + " bytes )");
                        }                        
                       
                        bos.write(mybytearray, 0 , current);
                        bos.flush();                        
                        fos.close();
                        bos.close();                        
            return "Arquivo Copiado";
        }
}
