/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jeferson
 */
public class Config {

    public String getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(String auditoria) {
        this.auditoria = auditoria;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   /* public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }*/
    String auditoria;
    String ip;
    String usuario;
    String senha;    
    
    
    
    public Config(String a, String i, String u, String s)//, String p)
    {
        this.auditoria = a;
        this.ip = i;
        this.usuario = u;
        this.senha = s;
        //this.path = p;
    }
    
    public Config()
    {
        
    }
}
