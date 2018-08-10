package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FormaPagamento generated by hbm2java
 */
@Entity
@Table(name="forma_pagamento"
)
public class FormaPagamento  implements java.io.Serializable {


     private int idFormaPagamento;
     private String nome;
     private int parcelas;
     private char inativo;
     private BigDecimal percDesconto;
     private BigDecimal percAcrescimo;

    public FormaPagamento() {
    }

	
    public FormaPagamento(int idFormaPagamento, String nome, int parcelas, char inativo) {
        this.idFormaPagamento = idFormaPagamento;
        this.nome = nome;
        this.parcelas = parcelas;
        this.inativo = inativo;
    }
    public FormaPagamento(int idFormaPagamento, String nome, int parcelas, char inativo, BigDecimal percDesconto, BigDecimal percAcrescimo) {
       this.idFormaPagamento = idFormaPagamento;
       this.nome = nome;
       this.parcelas = parcelas;
       this.inativo = inativo;
       this.percDesconto = percDesconto;
       this.percAcrescimo = percAcrescimo;
    }
   
     @Id 

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_forma_pagamento", nullable=false)
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




}


