/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

import br.edu.utfpr.cwsmanager.model.endereco.Endereco;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author EduardoGreco
 */
@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private Date dataNascimento = Calendar.getInstance().getTime();
    private String telPessoal;
    private String celular;
    private String telComercial;
    private String email;
    private String login;
    private String senha;
    private List<Veiculo> veiculos;
    private Endereco endereco = new Endereco();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(length = 200, nullable = false)
    public String getNome() {
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

    @Column(length = 20, nullable = false)
    public String getTelPessoal() {
        return telPessoal;
    }

    @Column(length = 20)
    public String getCelular() {
        return celular;
    }

    @Column(length = 20)
    public String getTelComercial() {
        return telComercial;
    }

    @Column(length = 100)
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

    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.ALL, CascadeType.REMOVE})
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    @OneToOne(cascade = {CascadeType.ALL, CascadeType.REMOVE})
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

    public void setSenha(String senha) {
        this.senha = senha;
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

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
        for (Veiculo v : veiculos) {
            v.setCliente(this);
        }
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return nome;
    }
}
