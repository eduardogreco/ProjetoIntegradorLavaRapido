/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.movimentacao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author EduardoGreco
 */
@Entity
@Table(name = "OrdemServico")
public class OrdemServico implements Serializable {

    private int id;
    private String status;
    private Date data;
    private String horaInicio;
    private String horaFinal;
    private SolicitacaoServico solicitacaoServico;
    private String descricao;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(length = 20)
    public String getStatus() {
        return status;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getData() {
        return data;
    }

    @Column(length = 20)
    public String getHoraInicio() {
        return horaInicio;
    }

    @Column(length = 20)
    public String getHoraFinal() {
        return horaFinal;
    }

    @OneToOne
    public SolicitacaoServico getSolicitacaoServico() {
        return solicitacaoServico;
    }

    @Column(length = 200)
    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setSolicitacaoServico(SolicitacaoServico solicitacaoServico) {
        this.solicitacaoServico = solicitacaoServico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

 //   public void setData(String trim) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }
}
