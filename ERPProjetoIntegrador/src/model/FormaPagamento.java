package model;
// Generated 07/08/2018 09:35:59 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FormaPagamento generated by hbm2java
 */
@Entity
@Table(name="forma_pagamento"
    ,schema="public"
)
public class FormaPagamento  implements java.io.Serializable {


     private int idFormaPagamento;
     private String nome;
     private int parcelas;
     private char inativo;
     private BigDecimal percDesconto;
     private BigDecimal percAcrescimo;
     private Set pedidos = new HashSet(0);

    public FormaPagamento() {
    }

	
    public FormaPagamento(int idFormaPagamento, String nome, int parcelas, char inativo) {
        this.idFormaPagamento = idFormaPagamento;
        this.nome = nome;
        this.parcelas = parcelas;
        this.inativo = inativo;
    }
    public FormaPagamento(int idFormaPagamento, String nome, int parcelas, char inativo, BigDecimal percDesconto, BigDecimal percAcrescimo, Set pedidos) {
       this.idFormaPagamento = idFormaPagamento;
       this.nome = nome;
       this.parcelas = parcelas;
       this.inativo = inativo;
       this.percDesconto = percDesconto;
       this.percAcrescimo = percAcrescimo;
       this.pedidos = pedidos;
    }
   
     @Id 

    
    @Column(name="id_forma_pagamento", unique=true, nullable=false)
    public int getIdFormaPagamento() {
        return this.idFormaPagamento;
    }
    
    public void setIdFormaPagamento(int idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    
    @Column(name="nome", nullable=false, length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="parcelas", nullable=false)
    public int getParcelas() {
        return this.parcelas;
    }
    
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }

    
    @Column(name="perc_desconto", precision=5)
    public BigDecimal getPercDesconto() {
        return this.percDesconto;
    }
    
    public void setPercDesconto(BigDecimal percDesconto) {
        this.percDesconto = percDesconto;
    }

    
    @Column(name="perc_acrescimo", precision=5)
    public BigDecimal getPercAcrescimo() {
        return this.percAcrescimo;
    }
    
    public void setPercAcrescimo(BigDecimal percAcrescimo) {
        this.percAcrescimo = percAcrescimo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="formaPagamento")
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


