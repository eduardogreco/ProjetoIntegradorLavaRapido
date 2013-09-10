/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.movimentacao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author EduardoGreco
 */
@Entity
@Table(name = "TipoServico")
public class TipoServico implements Serializable {

    private int id;
    private String nome;
    private String valor;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(length = 150, nullable = false)
    public String getNome() {
        return nome;
    }

    @Column(length = 50, nullable = false)
    public String getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
