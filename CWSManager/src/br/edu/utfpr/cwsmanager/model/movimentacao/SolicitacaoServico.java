/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.movimentacao;

import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import br.edu.utfpr.cwsmanager.model.pessoa.Funcionario;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author EduardoGreco
 */
@Entity
@Table(name = "SolicitacaoServico")
public class SolicitacaoServico implements Serializable {

    private int id;
    private Date data;
    private String horario;
    private String status;
    private Funcionario funcionario;
    private TipoServico tipoServico;
    private Cliente cliente;
    private Veiculo veiculo;
    private String obs;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getData() {
        return data;
    }

    @Column(length = 50)
    public String getHorario() {
        return horario;
    }

    @Column(length = 50)
    public String getStatus() {
        return status;
    }

    @ManyToOne
    public Funcionario getFuncionario() {
        return funcionario;
    }

    @ManyToOne
    public TipoServico getTipoServico() {
        return tipoServico;
    }

    @ManyToOne
    public Cliente getCliente() {
        return cliente;
    }

    @OneToOne
    public Veiculo getVeiculo() {
        return veiculo;
    }
    

    @Column(length = 200)
    public String getObs() {
        return obs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    

    public void setObs(String obs) {
        this.obs = obs;
    }
}
