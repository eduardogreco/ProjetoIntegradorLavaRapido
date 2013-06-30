/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.veiculo;

import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;


/**
 *
 * @author EduardoGreco
 */
public class Veiculo {
    private int id;
    private String placa;
    private String modelo;
    private String cor;
    private String tipoVeiculo;
    private Cliente cliente = new Cliente();

    public Veiculo() {
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
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
