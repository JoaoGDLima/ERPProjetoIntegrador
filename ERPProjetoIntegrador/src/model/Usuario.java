package model;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import model.util.Criptografia;


@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {
    
    public static String senhaDefault = "********";

    private int idUsuario;
    private Integer idPessoa;
    private int nivelAcesso;
    private String senha;
    private String username;
    private Character inativo;

    public Usuario() {
    }

    public Usuario(int idUsuario, int nivelAcesso, String senha, String username, char inativo) {
        this.idUsuario = idUsuario;
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
        this.username = username;
        this.inativo = inativo;
    }

    public Usuario(int idUsuario, Integer idPessoa, int nivelAcesso, String senha, String username, char inativo) {
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
        this.username = username;
        this.inativo = inativo;
    }

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Column(name = "id_pessoa")
    public Integer getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Column(name = "nivel_acesso", nullable = false)
    public int getNivelAcesso() {
        return this.nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Column(name = "senha", nullable = false, length = 300)
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        if (senha != senhaDefault) 
        {
            this.senha = Criptografia.criptografar(senha);
        }
    }

    @Column(name = "username", nullable = false, length = 60)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    @Column(name="inativo", nullable=false, length=1)
    public Character getInativo() {
        return inativo;
    }

    public void setInativo(Character inativo) {
        this.inativo = inativo;
    }


    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idPessoa=" + idPessoa + ", nivelAcesso=" + nivelAcesso + ", senha=" + senha + ", username=" + username + ", inativo=" + inativo + '}';
    }

}
