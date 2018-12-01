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
    
    public static void EscreverXML(String nome) throws ClassNotFoundException, InstantiationException, IllegalAccessException, FileNotFoundException, IOException, NoSuchFieldException
    {
        //Object obj = Class.forName(nome).newInstance();
        Document doc = new Document();
        List<Estado> li = new ArrayList<Estado>();;
        
        //Element root = new Element(obj.getClass().getName());
        
        
        switch(nome)
        {
            case "Estado":
                EstadoDAO temp = new EstadoDAO();                               
                li = (List<Estado>)temp.consultarRelatorio("nome like '%'");
                Element root = new Element("Estados");
                for(int i=0; i<li.size();i++)
                {
                    
                    Element UF = new Element("UF");
                    UF.setText(li.get(i).getUf());
                    Element Estado = new Element("Estado");
                    Estado.setText(li.get(i).getNome());
                    Estado.addContent(UF);
                    root.addContent(Estado);
                }                    
                doc.setRootElement(root);                
                break;
        }
        
        /*for(Field f : obj.getClass().getDeclaredFields()){
            root.addContent(new Element(f.getName()));            
        }*/
        
        
        XMLOutputter xout = new XMLOutputter();
        OutputStream out = new FileOutputStream( new File("D:\\exemplo.xml"));
        xout.output(doc , out);        
    }
    
    public static void LerXML() throws JDOMException, IOException
    {
        File f = new File("D:\\exemplo.xml");
             
        SAXBuilder builder = new SAXBuilder();
     
        Document doc = builder.build(f);
             
        Element root = (Element) doc.getRootElement();
        
        List Estados = root.getChildren();
        
        Iterator i = Estados.iterator();
        
        while(i.hasNext())
        {
            Element Estado = (Element)i.next();
            
        }
    }
}
