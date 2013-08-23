/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

import br.edu.utfpr.cwsmanager.model.endereco.Endereco;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
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
 * @author RAFAEL
 */
@Entity
@Table(name="Funcionario")
public class Funcionario implements Serializable {

    private int id;
    private String nome;
    private Date dataNascimento = Calendar.getInstance().getTime();
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String telPessoal;
    private String email;
    private String login;
    private String senha;
    private String celular;
    private Endereco endereco = new Endereco();

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
   public int getId() {
        return id;
    }
    
    
    
    @Column(length = 200, nullable = false)public String getNome() {
        return nome;
    }

    @Column(length = 16, nullable = false)
    public String getCpf() {
        return cpf;
    }

    @Column(length = 10)
    public String getSexo() {
        return sexo;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDataNascimento() {
        return dataNascimento;
    }
    @Column(length = 50)
    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Column(length = 20, nullable = false)
    public String getTelPessoal() {
        return telPessoal;
    }

    @Column(length = 200, nullable = false)
    public String getEmail() {
        return email;
    }

    @Column(length = 40)
    public String getLogin() {
        return login;
    }

    @Column(length = 40)
    public String getSenha() {
        return senha;
    }

    @Column(length = 40)
    public String getCelular() {
        return celular;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Endereco getEndereco() {
        return endereco;
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

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTelPessoal(String telPessoal) {
        this.telPessoal = telPessoal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    @Override
    public String toString() {
        return nome;
    }
}

