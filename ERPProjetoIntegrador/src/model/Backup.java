/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ResourceBundle;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Jeferson
 */
public class Backup {

    
    public static void realizaFullRestore(String arquivo)
    {
        //Fazer drop do banco de dados
        //Realizar restore da base de dados
        //A partir daqui executa o programa externo para restaurar os diretorios
        final List<String> comandos = new ArrayList<String>();
        comandos.add("java");
        comandos.add("-jar");
        comandos.add("..\\extrairZip.jar");
        comandos.add(arquivo);
        //comandos.add(secaoConexao.path + "ERPProjetoIntegrador");
        comandos.add("d:\\ZipTeste\\ERPProjetoIntegrador");
        ProcessBuilder pb = new ProcessBuilder(comandos);
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
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    
    public static void realizaRestore(String arquivo) throws IOException, InterruptedException {
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
        comandos.add("" + arquivo);   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  
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
            JOptionPane.showMessageDialog(null, "Restore realizado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void realizaBackup() throws IOException, InterruptedException {
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
        comandos.add(secaoConexao.path + formatador.format(d) + ".backup");   // eu utilizei meu C:\ e D:\ para os testes e gravei o backup com sucesso.  
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
            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static boolean zipar(String endEntrada, String endSaida) {
        String dirInterno = "";
        boolean retorno = true;
        try {
            File file = new File(endEntrada);
            //Verifica se o arquivo ou diretório existe
            if (!file.exists()) {
                return false;
            }
            ZipOutputStream zipDestino = new ZipOutputStream(new FileOutputStream(endSaida));
            //se é um arquivo a ser zipado
            //zipa e retorna
            if (file.isFile()) {
                ziparFile(file, dirInterno, zipDestino);
            } //senão lista o que tem no diretório e zipa
            else {
                dirInterno = file.getName();
                //Verifica se é diretório ou
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    ziparFile(files[i], dirInterno, zipDestino);
                }
            }
            zipDestino.close();
        } catch (IOException ex) {
            retorno = false;
        }
        return retorno;
    }

    /**
     * Zipa o arquivo ou diretório passado Verifica se é diretório executa
     * recursão para adicionar os arquivos contidos dentro do mesmo no zip senão
     * somente adiciona o arquivo no zip criado
     *
     * @param file arquivo ou diretório a ser adicionado no zip
     * @param dirInterno diretório interno do zip
     * @param zipDestino zip em que está sendo adicionado os arquivos e
     * diretórios
     * @throws java.io.IOException exeção que pode ser gerada na adição de
     * arquivos no zip
     */
    private static void ziparFile(File file, String dirInterno, ZipOutputStream zipDestino) throws IOException {
        byte data[] = new byte[1024];
        //Verifica se a file é um diretório, então faz a recursão
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                ziparFile(files[i], dirInterno + File.separator + file.getName(), zipDestino);
            }
            return;
        }
        FileInputStream fi = new FileInputStream(file.getAbsolutePath());
        ZipEntry entry = new ZipEntry(dirInterno + File.separator + file.getName());
        zipDestino.putNextEntry(entry);
        int count;
        while ((count = fi.read(data)) > 0) {
            zipDestino.write(data, 0, count);
        }
        zipDestino.closeEntry();
        fi.close();
    }

    public static void extrairZip(String source, String output) throws ZipException, IOException {
        //Source é o arquivo zip e output é o destino para extrair
        File arquivoZip = new File(source);
        File diretorio = new File(output);
        ZipFile zip = null;
        File arquivo = null;
        InputStream is = null;
        OutputStream os = null;
        byte[] buffer = new byte[4096];
        try {
            //cria diretório informado, caso não exista
            if (!diretorio.exists()) {
                diretorio.mkdirs();
            }
            if (!diretorio.exists() || !diretorio.isDirectory()) {
                throw new IOException("Informe um diretório válido");
            }
            zip = new ZipFile(arquivoZip);
            Enumeration e = zip.entries();
            while (e.hasMoreElements()) {
                ZipEntry entrada = (ZipEntry) e.nextElement();
                arquivo = new File(diretorio, entrada.getName());
                //se for diretório inexistente, cria a estrutura 
                //e pula pra próxima entrada
                if (entrada.isDirectory() && !arquivo.exists()) {
                    arquivo.mkdirs();
                    continue;
                }
                //se a estrutura de diretórios não existe, cria
                if (!arquivo.getParentFile().exists()) {
                    arquivo.getParentFile().mkdirs();
                }
                try {
                    //lê o arquivo do zip e grava em disco
                    is = zip.getInputStream(entrada);
                    os = new FileOutputStream(arquivo);
                    int bytesLidos = 0;
                    if (is == null) {
                        throw new ZipException("Erro ao ler a entrada do zip: " + entrada.getName());
                    }
                    while ((bytesLidos = is.read(buffer)) > 0) {
                        os.write(buffer, 0, bytesLidos);
                    }
                } finally {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (Exception ex) {
                        }
                    }
                    if (os != null) {
                        try {
                            os.close();
                        } catch (Exception ex) {
                        }
                    }
                }
            }
        } finally {
            if (zip != null) {
                try {
                    zip.close();
                } catch (Exception e) {
                }
            }
        }
    }

   /* public static void main(String arg[]) throws IOException {
        Backup.zipar("C:\\Users\\Jeferson\\Documents\\ERPProjetoIntegrador", "d:/projeto.zip");
        Backup.extrairZip("d:/projeto.zip", "d:\\ZipTeste\\");
    }*/
}
