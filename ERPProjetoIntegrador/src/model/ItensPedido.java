package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ItensPedido generated by hbm2java
 */
@Entity
@Table(name="itens_pedido"
)
public class ItensPedido  implements java.io.Serializable {


     private ItensPedidoId id;
     private BigDecimal quantidade;
     private BigDecimal valorTotal;

    public ItensPedido() {
    }

    public ItensPedido(ItensPedidoId id, BigDecimal quantidade, BigDecimal valorTotal) {
       this.id = id;
       this.quantidade = quantidade;
       this.valorTotal = valorTotal;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idPedido", column=@Column(name="id_pedido", nullable=false) ), 
        @AttributeOverride(name="idProduto", column=@Column(name="id_produto", nullable=false) ) } )
    public ItensPedidoId getId() {
        return this.id;
    }
    
    public void setId(ItensPedidoId id) {
        this.id = id;
    }

    
    @Column(name="quantidade", nullable=false, precision=10)
    public BigDecimal getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    
    @Column(name="valor_total", nullable=false, precision=10)
    public BigDecimal getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }




}


