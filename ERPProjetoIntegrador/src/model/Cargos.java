package model;
// Generated 07/08/2018 09:35:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cargos generated by hbm2java
 */
@Entity
@Table(name="cargos"
    ,schema="public"
)
public class Cargos  implements java.io.Serializable {


     private int idCargos;
     private String nome;
     private char inativo;
     private Set funcionarios = new HashSet(0);

    public Cargos() {
    }

	
    public Cargos(int idCargos, String nome, char inativo) {
        this.idCargos = idCargos;
        this.nome = nome;
        this.inativo = inativo;
    }
    public Cargos(int idCargos, String nome, char inativo, Set funcionarios) {
       this.idCargos = idCargos;
       this.nome = nome;
       this.inativo = inativo;
       this.funcionarios = funcionarios;
    }
   
     @Id 

    
    @Column(name="id_cargos", unique=true, nullable=false)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="cargos")
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


