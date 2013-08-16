/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.veiculo;

import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author EduardoGreco
 */
@Entity
@Table(name = "Veiculo")
public class Veiculo implements Serializable {

    private int id;
    private String placa;
    private String modelo;
    private String cor;
    private String tipoVeiculo;
    private Cliente cliente;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(length = 10)
    public String getPlaca() {
        return placa;
    }

    @Column(length = 100)
    public String getModelo() {
        return modelo;
    }

    @Column(length = 50)
    public String getCor() {
        return cor;
    }

    @Column(length = 50)
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    @ManyToOne
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + ", tipoVeiculo=" + tipoVeiculo + '}';
    }
}
