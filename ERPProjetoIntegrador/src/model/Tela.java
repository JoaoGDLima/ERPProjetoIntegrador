
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tela")
public class Tela {
    private int idTela;
    private String nome;

    @Id 
    @Column(name="id_tela", nullable=false)
    public int getIdTela() {
        return idTela;
    }

    public void setIdTela(int idTela) {
        this.idTela = idTela;
    }

    @Column(name="nome", nullable=false, length=50)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
