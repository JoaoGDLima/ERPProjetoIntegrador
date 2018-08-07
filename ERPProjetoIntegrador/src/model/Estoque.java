package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Estoque generated by hbm2java
 */
@Entity
@Table(name="estoque"
)
public class Estoque  implements java.io.Serializable {


     private EstoqueId id;
     private long quantidade;
     private BigDecimal valorCompra;
     private Date dataValidade;
     private char inativo;

    public Estoque() {
    }

    public Estoque(EstoqueId id, long quantidade, BigDecimal valorCompra, Date dataValidade, char inativo) {
       this.id = id;
       this.quantidade = quantidade;
       this.valorCompra = valorCompra;
       this.dataValidade = dataValidade;
       this.inativo = inativo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idEstoque", column=@Column(name="id_estoque", nullable=false) ), 
        @AttributeOverride(name="idPedido", column=@Column(name="id_pedido", nullable=false) ), 
        @AttributeOverride(name="idProduto", column=@Column(name="id_produto", nullable=false) ) } )
    public EstoqueId getId() {
        return this.id;
    }
    
    public void setId(EstoqueId id) {
        this.id = id;
    }

    
    @Column(name="quantidade", nullable=false, precision=10, scale=0)
    public long getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="valor_compra", nullable=false, precision=10)
    public BigDecimal getValorCompra() {
        return this.valorCompra;
    }
    
    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_validade", nullable=false, length=13)
    public Date getDataValidade() {
        return this.dataValidade;
    }
    
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }




}


