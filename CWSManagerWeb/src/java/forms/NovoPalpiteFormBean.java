/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NovoPalpiteFormBean {
    private String nome, email, telefone, dataDeNascimento, campeao, vice;

    public List<String> validar() {
        List<String> mensagens = new ArrayList<String>();
        if(nome.trim().length() == 0) {
            mensagens.add("Nome não pode ser vazio!");
        }
        if(!email.contains("@")) {
            mensagens.add("E-mail está em formato incorreto!");
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.parse(dataDeNascimento);
        }
        catch(ParseException pe) {
            mensagens.add("Data de nascimento deve estar no formato dd/mm/aaaa!");
        }
        if(campeao.equalsIgnoreCase(vice))
            mensagens.add("Campeão e vice devem ser diferentes!");
        return (mensagens.isEmpty()?null:mensagens);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dataDeNascimento
     */
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * @return the campeao
     */
    public String getCampeao() {
        return campeao;
    }

    /**
     * @param campeao the campeao to set
     */
    public void setCampeao(String campeao) {
        this.campeao = campeao;
    }

    /**
     * @return the vice
     */
    public String getVice() {
        return vice;
    }

    /**
     * @param vice the vice to set
     */
    public void setVice(String vice) {
        this.vice = vice;
    }
}