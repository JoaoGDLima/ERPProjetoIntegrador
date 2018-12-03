package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="versao")
public class Versao {
     private int idVersao;
     private String versao;
     private String descricao;
     private char lido;

         
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_versao", nullable=false)
    public int getIdVersao() {
        return idVersao;
    }

    public void setIdVersao(int idVersao) {
        this.idVersao = idVersao;
    }
    
    @Column(name="versao", nullable=false, length=10)
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Column(name="descricao", nullable=false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Column(name="lido", nullable=false, length=1)
    public char getLido() {
        return lido;
    }

    public void setLido(char lido) {
        this.lido = lido;
    }
}
