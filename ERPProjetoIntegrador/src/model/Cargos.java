package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cargos generated by hbm2java
 */
@Entity
@Table(name="cargos"
)
public class Cargos  implements java.io.Serializable {


     private int idCargos;
     private String nome;
     private char inativo;

    public Cargos() {
    }

    public Cargos(int idCargos, String nome, char inativo) {
       this.idCargos = idCargos;
       this.nome = nome;
       this.inativo = inativo;
    }
   
     @Id 

    
    @Column(name="id_cargos", nullable=false)
    public int getIdCargos() {
        return this.idCargos;
    }
    
    public void setIdCargos(int idCargos) {
        this.idCargos = idCargos;
    }

    
    @Column(name="nome", nullable=false, length=50)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }




}

