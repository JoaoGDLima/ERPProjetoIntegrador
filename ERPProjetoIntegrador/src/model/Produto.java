package model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto implements java.io.Serializable {

    private int idProduto;
    private String nome;
    private String descricao;
    private BigDecimal percentualLucro;
    private char inativo;
    private Unidade unidade;

    public Produto() {
    }

    public Produto(int idProduto, String nome, BigDecimal percentualLucro, char inativo, Unidade idUnidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.percentualLucro = percentualLucro;
        this.inativo = inativo;
        this.unidade = idUnidade;
    }

    public Produto(int idProduto, String nome, String descricao, BigDecimal percentualLucro, char inativo, Unidade idUnidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.percentualLucro = percentualLucro;
        this.inativo = inativo;
        this.unidade = idUnidade;
    }

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto", nullable = false)
    public int getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    @Column(name = "nome", nullable = false, length = 45)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "descricao", length = 45)
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "percentual_lucro", nullable = false, precision = 3)
    public BigDecimal getPercentualLucro() {
        return this.percentualLucro;
    }

    public void setPercentualLucro(BigDecimal percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    @Column(name = "inativo", nullable = false, length = 1)
    public char getInativo() {
        return this.inativo;
    }

    public void setInativo(char inativo) {
        this.inativo = inativo;
    }

    @ManyToOne
    @JoinColumn(name="id_unidade", nullable=false)
    public Unidade getIdUnidade() 
    {
        return this.unidade;
    }

    public void setIdUnidade(Unidade idUnidade) 
    {
        this.unidade = idUnidade;
    }

}
