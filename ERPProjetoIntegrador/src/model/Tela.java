/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author joao.lima
 */
@Entity
@Table(name = "tela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tela.findAll", query = "SELECT t FROM Tela t")
    , @NamedQuery(name = "Tela.findByIdTela", query = "SELECT t FROM Tela t WHERE t.idTela = :idTela")
    , @NamedQuery(name = "Tela.findByNome", query = "SELECT t FROM Tela t WHERE t.nome = :nome")})
public class Tela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tela")
    private Integer idTela;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;

    public Tela() {
    }

    public Tela(Integer idTela) {
        this.idTela = idTela;
    }

    public Tela(Integer idTela, String nome) {
        this.idTela = idTela;
        this.nome = nome;
    }

    public Integer getIdTela() {
        return idTela;
    }

    public void setIdTela(Integer idTela) {
        this.idTela = idTela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTela != null ? idTela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tela)) {
            return false;
        }
        Tela other = (Tela) object;
        if ((this.idTela == null && other.idTela != null) || (this.idTela != null && !this.idTela.equals(other.idTela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tela[ idTela=" + idTela + " ]";
    }
    
}
