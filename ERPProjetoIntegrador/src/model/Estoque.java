package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estoque")
public class Estoque  implements java.io.Serializable {

     private int id_produto_est;
     private long quantidade;
     private char inativo;

    public Estoque(int id_produto_est, char inativo) {
        this.id_produto_est = id_produto_est;
        this.inativo = inativo;
    }

    public Estoque() {
    }

    @Id 
    @Column(name="id_produto_est", nullable=false)
    public int getId_produto_est() {
        return id_produto_est;
    }

    public void setId_produto_est(int id_produto_est) {
        this.id_produto_est = id_produto_est;
    }
    
    @Column(name="quantidade", nullable=false, precision=10, scale=0)
    public long getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }
}


