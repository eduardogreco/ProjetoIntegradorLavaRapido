/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

import br.edu.utfpr.cwsmanager.model.endereco.Endereco;
import java.io.Serializable;
//import br.edu.utfpr.cwsmanager.model.endereco.EnderecoFuncionario;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author RAFAEL
 */
@Entity
@Table(name="Funcionario")
public class Funcionario implements Serializable {

    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String telPessoal;
    private String email;
    private String login;
    private String senha;
    private int celular;
    private Endereco endereco = new Endereco();

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    private Date dataNascimento = Calendar.getInstance().getTime();

    @Temporal(javax.persistence.TemporalType.DATE)
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

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 100)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(length = 11, unique = true)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Column(length = 100)
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(length = 100)
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Column(length = 15)
    public String getTelPessoal() {
        return telPessoal;
    }

    public void setTelPessoal(String telPessoal) {
        this.telPessoal = telPessoal;
    }

    @Column(length = 15)
    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Column(length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return nome;
//        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", telPessoal=" + telPessoal + ", celular=" + celular + ", email=" + email + ", login=" + login + ", senha=" + senha + ",  dataNascimento=" + dataNascimento + '}';
    }
}
