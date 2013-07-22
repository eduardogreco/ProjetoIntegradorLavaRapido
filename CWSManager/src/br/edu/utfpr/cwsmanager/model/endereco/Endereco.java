/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.endereco;

import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;

/**
 *
 * @author EduardoGreco
 */
public class Endereco {

    private int id;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade = new Cidade();

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEndereco() {
        return logradouro;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.logradouro = nomeEndereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", nomeEndereco=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + '}';
    }

}
