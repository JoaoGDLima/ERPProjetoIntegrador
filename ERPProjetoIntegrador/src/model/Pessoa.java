package model;
// Generated 06/08/2018 21:15:53 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name="pessoa"
    ,schema="public"
    , uniqueConstraints = {@UniqueConstraint(columnNames="celular"), @UniqueConstraint(columnNames="email")} 
)
public class Pessoa  implements java.io.Serializable {


     private int idPessoa;
     private Cidade cidade;
     private String nome;
     private String endereco;
     private String bairro;
     private String numero;
     private String cep;
     private String telefone;
     private String celular;
     private String email;
     private char inativo;
     private PessoaJuridica pessoaJuridica;
     private Funcionario funcionario;

    public Pessoa() {
    }

	
    public Pessoa(int idPessoa, Cidade cidade, String nome, String endereco, String bairro, String numero, String celular, char inativo) {
        this.idPessoa = idPessoa;
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.celular = celular;
        this.inativo = inativo;
    }
    public Pessoa(int idPessoa, Cidade cidade, String nome, String endereco, String bairro, String numero, String cep, String telefone, String celular, String email, char inativo, PessoaJuridica pessoaJuridica, Funcionario funcionario) {
       this.idPessoa = idPessoa;
       this.cidade = cidade;
       this.nome = nome;
       this.endereco = endereco;
       this.bairro = bairro;
       this.numero = numero;
       this.cep = cep;
       this.telefone = telefone;
       this.celular = celular;
       this.email = email;
       this.inativo = inativo;
       this.pessoaJuridica = pessoaJuridica;
       this.funcionario = funcionario;
    }
   
     @Id 

    
    @Column(name="id_pessoa", unique=true, nullable=false)
    public int getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cidade", nullable=false)
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    
    @Column(name="nome", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="endereco", nullable=false, length=100)
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="bairro", nullable=false, length=50)
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name="numero", nullable=false, length=4)
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    @Column(name="cep", length=8)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name="telefone", length=11)
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    @Column(name="celular", unique=true, nullable=false, length=11)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    @Column(name="email", unique=true, length=60)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="inativo", nullable=false, length=1)
    public char getInativo() {
        return this.inativo;
    }
    
    public void setInativo(char inativo) {
        this.inativo = inativo;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="pessoa")
    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }
    
    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }




}


