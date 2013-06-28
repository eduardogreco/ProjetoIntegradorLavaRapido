/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.samansys.model.pessoa;

import java.util.Calendar;
import java.util.Date;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author EduardoGreco
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private boolean sexoCliente;
    private Date dataNascimentoCliente = Calendar.getInstance().getTime();
    private String telPessoalCliente;
    private String celPessoalCliente;
    private String telComercialCliente;
    private String emailCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public boolean isSexoCliente() {
        return sexoCliente;
    }

    public Date getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public String getTelPessoalCliente() {
        return telPessoalCliente;
    }

    public String getCelPessoalCliente() {
        return celPessoalCliente;
    }

    public String getTelComercialCliente() {
        return telComercialCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setSexoCliente(boolean sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public void setTelPessoalCliente(String telPessoalCliente) {
        this.telPessoalCliente = telPessoalCliente;
    }

    public void setCelPessoalCliente(String celPessoalCliente) {
        this.celPessoalCliente = celPessoalCliente;
    }

    public void setTelComercialCliente(String telComercialCliente) {
        this.telComercialCliente = telComercialCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", sexoCliente=" + sexoCliente + ", dataNascimentoCliente=" + dataNascimentoCliente + ", telPessoalCliente=" + telPessoalCliente + ", celPessoalCliente=" + celPessoalCliente + ", telComercialCliente=" + telComercialCliente + ", emailCliente=" + emailCliente + '}';
    }
    
    
}
