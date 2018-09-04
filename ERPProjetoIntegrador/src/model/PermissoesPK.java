/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author joao.lima
 */
@Embeddable
public class PermissoesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_tela_perm")
    private int idTelaPerm;
    @Basic(optional = false)
    @Column(name = "id_usuario_perm")
    private int idUsuarioPerm;

    public PermissoesPK() {
    }

    public PermissoesPK(int idTelaPerm, int idUsuarioPerm) {
        this.idTelaPerm = idTelaPerm;
        this.idUsuarioPerm = idUsuarioPerm;
    }

    public int getIdTelaPerm() {
        return idTelaPerm;
    }

    public void setIdTelaPerm(int idTelaPerm) {
        this.idTelaPerm = idTelaPerm;
    }

    public int getIdUsuarioPerm() {
        return idUsuarioPerm;
    }

    public void setIdUsuarioPerm(int idUsuarioPerm) {
        this.idUsuarioPerm = idUsuarioPerm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTelaPerm;
        hash += (int) idUsuarioPerm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermissoesPK)) {
            return false;
        }
        PermissoesPK other = (PermissoesPK) object;
        if (this.idTelaPerm != other.idTelaPerm) {
            return false;
        }
        if (this.idUsuarioPerm != other.idUsuarioPerm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PermissoesPK[ idTelaPerm=" + idTelaPerm + ", idUsuarioPerm=" + idUsuarioPerm + " ]";
    }
    
}
