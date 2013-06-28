/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author EduardoGreco
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private Date dataNascimento = Calendar.getInstance().getTime();
    private String telPessoal;
    private String celular;
    private String telComercial;
    private String email;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getTelPessoal() {
        return telPessoal;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelPessoal(String telPessoal) {
        this.telPessoal = telPessoal;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", telPessoal=" + telPessoal + ", celular=" + celular + ", telComercial=" + telComercial + ", email=" + email + '}';
    }
    
    
}
