
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joao.lima
 */
@Entity
@Table(name = "permissoes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissoes.findAll", query = "SELECT p FROM Permissoes p")
    , @NamedQuery(name = "Permissoes.findByIdTelaPerm", query = "SELECT p FROM Permissoes p WHERE p.permissoesPK.idTelaPerm = :idTelaPerm")
    , @NamedQuery(name = "Permissoes.findByIdUsuarioPerm", query = "SELECT p FROM Permissoes p WHERE p.permissoesPK.idUsuarioPerm = :idUsuarioPerm")
    , @NamedQuery(name = "Permissoes.findByNivel", query = "SELECT p FROM Permissoes p WHERE p.nivel = :nivel")})
public class Permissoes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermissoesPK permissoesPK;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @JoinColumn(name = "id_tela_perm", referencedColumnName = "id_tela", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tela tela;
    @JoinColumn(name = "id_usuario_perm", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Permissoes() {
    }

    public Permissoes(PermissoesPK permissoesPK) {
        this.permissoesPK = permissoesPK;
    }

    public Permissoes(PermissoesPK permissoesPK, int nivel) {
        this.permissoesPK = permissoesPK;
        this.nivel = nivel;
    }

    public Permissoes(int idTelaPerm, int idUsuarioPerm) {
        this.permissoesPK = new PermissoesPK(idTelaPerm, idUsuarioPerm);
    }

    public PermissoesPK getPermissoesPK() {
        return permissoesPK;
    }

    public void setPermissoesPK(PermissoesPK permissoesPK) {
        this.permissoesPK = permissoesPK;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissoesPK != null ? permissoesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissoes)) {
            return false;
        }
        Permissoes other = (Permissoes) object;
        if ((this.permissoesPK == null && other.permissoesPK != null) || (this.permissoesPK != null && !this.permissoesPK.equals(other.permissoesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Permissoes[ permissoesPK=" + permissoesPK + " ]";
    }
    
}
