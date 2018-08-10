package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Funcionario generated by hbm2java
 */
@Entity
@Table(name="funcionario"
)
public class Funcionario  implements java.io.Serializable {


     private int idPessoa;
     private int cpf;
     private Date nascimento;
     private int idCargos;

    public Funcionario() {
    }

    public Funcionario(int idPessoa, int cpf, Date nascimento, int idCargos) {
       this.idPessoa = idPessoa;
       this.cpf = cpf;
       this.nascimento = nascimento;
       this.idCargos = idCargos;
    }
   
     @Id 

    
    @Column(name="id_pessoa", nullable=false)
    public int getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    
    @Column(name="cpf", nullable=false)
    public int getCpf() {
        return this.cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="nascimento", nullable=false, length=13)
    public Date getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    
    @Column(name="id_cargos", nullable=false)
    public int getIdCargos() {
        return this.idCargos;
    }
    
    public void setIdCargos(int idCargos) {
        this.idCargos = idCargos;
    }




}

