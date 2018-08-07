package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItensPedidoId generated by hbm2java
 */
@Embeddable
public class ItensPedidoId  implements java.io.Serializable {


     private int idPedido;
     private int idProduto;

    public ItensPedidoId() {
    }

    public ItensPedidoId(int idPedido, int idProduto) {
       this.idPedido = idPedido;
       this.idProduto = idProduto;
    }
   


    @Column(name="id_pedido", nullable=false)
    public int getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }


    @Column(name="id_produto", nullable=false)
    public int getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItensPedidoId) ) return false;
		 ItensPedidoId castOther = ( ItensPedidoId ) other; 
         
		 return (this.getIdPedido()==castOther.getIdPedido())
 && (this.getIdProduto()==castOther.getIdProduto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPedido();
         result = 37 * result + this.getIdProduto();
         return result;
   }   


}


