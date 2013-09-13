/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.endereco;

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
@Table(name = "Endereco")
public class Endereco implements Serializable {

    private int id;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(length = 220)
    public String getNomeEndereco() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    @Column(length = 150)
    public String getComplemento() {
        return complemento;
    }

    @Column(length = 150)
    public String getBairro() {
        return bairro;
    }

    @Column(length = 20)
    public String getCep() {
        return cep;
    }

    @ManyToOne
    public Cidade getCidade() {
        return cidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.logradouro = nomeEndereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", nomeEndereco=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + '}';
    }
}
