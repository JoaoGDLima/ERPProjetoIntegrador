/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.dao.EstadoDAO;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Jeferson
 */
public class XmlTools {
    
    //Object obj;
    
    
    public XmlTools()
    {
        
    }
    
    public static void EscreverXML(String Auditoria, String IP, String User, String Senha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException, IOException, NoSuchFieldException
    {
        //Object obj = Class.forName(nome).newInstance();
        Document doc = new Document();       
        
        //Element root = new Element(obj.getClass().getName());
        
                                                                              
                Element root = new Element("Propriedades");
                
                    Element Audit = new Element("Auditoria");
                    Audit.setText(Auditoria);
                    Element Address = new Element("IP");
                    Address.setText(IP);                    
                    Element Usuario = new Element("Usuario");
                    Usuario.setText(User);
                    Element Pass = new Element("Senha");
                    Pass.setText(Senha);
                    
                    root.addContent(Audit);                    
                    root.addContent(Address);
                    root.addContent(Usuario);                                    
                    root.addContent(Pass);
                    
                    doc.setRootElement(root);                
        
        
        
        
        XMLOutputter xout = new XMLOutputter();
        OutputStream out = new FileOutputStream( new File(secaoConexao.path+"config.xml"));
        xout.output(doc , out);        
    }
    
    public static Config LerXML() throws JDOMException, IOException
    {
        
        File f = new File(secaoConexao.path+"config.xml");
             
        SAXBuilder builder = new SAXBuilder();
     
        Document doc = builder.build(f);
             
        Element root = (Element) doc.getRootElement();
        
        Config conf = new Config(root.getChildText("Auditoria"), 
                                 root.getChildText("IP"),
                                 root.getChildText("Usuario"),
                                 root.getChildText("Senha"));
                                 //root.getChildText("Path"));                                      
        return conf;
    }
    
}

