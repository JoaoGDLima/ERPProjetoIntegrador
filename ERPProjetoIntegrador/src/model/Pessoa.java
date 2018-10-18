package model;
// Generated 07/08/2018 13:28:03 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa")
public class Pessoa implements java.io.Serializable {

    private int idPessoa;
    private String nome;
    private String endereco;
    private String bairro;
    private String numero;
    private String cep;
    private String telefone;
    private String celular;
    private String email;    
    //private int idCidade;
    private Cidade cidade;
    private char inativo;
    private Cargos cargo;
    private char fisico;
    private String latitude;
    private String longitude;
    
    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, String endereco, String bairro, String numero, String celular, int idCidade, char inativo) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.celular = celular;
        //this.idCidade = idCidade;
        this.inativo = inativo;
    }

    public Pessoa(int idPessoa, String nome, String endereco, String bairro, String numero, String cep, String telefone, String celular, String email, int idCidade, char inativo) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        //this.idCidade = idCidade;
        this.inativo = inativo;
    }
    
    @ManyToOne
    @JoinColumn(name="id_cargos", nullable=false)
    public Cargos getCargo() 
    {
        return cargo;
    }

    public void setCargo(Cargos cargo) 
    {
        this.cargo = cargo;
    }
   
       
    @ManyToOne
    @JoinColumn(name="id_cidade", nullable=false)
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@OneToOne
    //@JoinColumn(name="id_pessoa_func", nullable=false)
    @Column(name = "id_pessoa", nullable = false)
    public int getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Column(name = "nome", nullable = false, length = 100)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "endereco", nullable = false, length = 100)
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Column(name = "bairro", nullable = false, length = 50)
    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Column(name = "numero", nullable = false, length = 4)
    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Column(name = "cep", length = 8)
    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Column(name = "telefone", length = 11)
    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Column(name = "celular", nullable = false, length = 11)
    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "email", length = 60)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*@Column(name = "id_cidade", nullable = false)
    public int getIdCidade() {
        return this.idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }*/

    @Column(name = "inativo", nullable = false, length = 1)
    public char getInativo() {
        return this.inativo;
    }

    @Column(name = "latitude", length = 11)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "longitude", length = 11)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setInativo(char inativo) {
        this.inativo = inativo;
    }
    
    @Column(name = "fisico", nullable = false)
    public char getFisico() {
        return this.fisico;        
    }
    
    public void setFisico(char fisico) {
        this.fisico = fisico;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", numero=" + numero + ", cep=" + cep + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", cidade=" + cidade + ", inativo=" + inativo + ", cargo=" + cargo + ", fisico=" + fisico + '}';
    }

}
