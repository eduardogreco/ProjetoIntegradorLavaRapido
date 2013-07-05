/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

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
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", telPessoal=" + telPessoal + ", celular=" + celular + ", email=" + email + '}';
    }
    
    
}

