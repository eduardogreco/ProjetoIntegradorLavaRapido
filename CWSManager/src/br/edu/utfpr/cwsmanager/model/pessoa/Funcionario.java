/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author RAFAEL
 */
public class Funcionario {
    
    
    
    private int idFuncionario;
    private String nome;
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String telPessoal;
    private String celular;
    private String email;
    private String login;
    private String senha;
    
    private Date dataNascimento = Calendar.getInstance().getTime();

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelPessoal() {
        return telPessoal;
    }

    public void setTelPessoal(String telPessoal) {
        this.telPessoal = telPessoal;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", telPessoal=" + telPessoal + ", celular=" + celular + ", email=" + email + ", login=" + login + ", senha=" + senha + ", dataNascimento=" + dataNascimento + '}';
    }

    
   

   
    
}

