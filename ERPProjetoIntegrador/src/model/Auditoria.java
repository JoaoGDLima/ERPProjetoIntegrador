package model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "auditoria")
public class Auditoria {

    public Auditoria() {
    }

    private int idAuditoria;
    private Usuario usuario;
    private Date datahora;
    private String acao;
    private String registro_old;
    private String registro_new;

    public Auditoria(int idAuditoria, Usuario usuario, Date datahora, String acao, String registro_old, String registro_new) {
        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.datahora = datahora;
        this.acao = acao;
        this.registro_old = registro_old;
        this.registro_new = registro_new;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auditoria", nullable = false)
    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    @ManyToOne
    @JoinColumn(name = "id_usuario_aud", nullable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datahora", nullable=false)
    public Date getDatahora() {
        return datahora;
    }
    
    public void setDatahora(Date data_acao) 
    {
        this.datahora = data_acao;
    }


    @Column(name="acao", nullable=false, length=10)
    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    @Column(name="registro_old", nullable=false)
    public String getRegistro_old() {
        return registro_old;
    }

    public void setRegistro_old(String registro_old) {
        this.registro_old = registro_old;
    }
    
    @Column(name="registro_new", nullable=false)
    public String getRegistro_new() {
        return registro_new;
    }

    public void setRegistro_new(String registro_new) {
        this.registro_new = registro_new;
    }

}
