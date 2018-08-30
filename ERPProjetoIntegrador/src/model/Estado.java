package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name="estado"
)
public class Estado  implements java.io.Serializable {


     private int idEstado;
     private String nome;
     private String uf;
     private char inativo;
     private int usuarioLock;
     //private Set<Cidade> cidade;

    @Transient
    public int getUsuarioLock() {
        return usuarioLock;
    }

    /*@OneToMany(mappedBy="estado")
    public Set<Cidade> getCidade() {
    return cidade;
    }
    public void setCidade(Set<Cidade> cidade) {
    this.cidade = cidade;
    }*/
    public void setUsuarioLock(int usuarioLock) {
        this.usuarioLock = usuarioLock;
    }

    public Estado() {
    }

    public Estado(int idEstado, String nome, String uf, char inativo) {
       this.idEstado = idEstado;
       this.nome = nome;
       this.uf = uf;
       this.inativo = inativo;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estado", nullable=false)
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    
    @Column(name="nome", nullable=false, length=50)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="uf", nullable=false, length=2)
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }

    @Override
    public String toString() {
        return "Estado{" + "idEstado=" + idEstado + ", nome=" + nome + ", uf=" + uf + ", inativo=" + inativo + '}';
    }

}


