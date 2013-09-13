/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author EduardoGreco
 */
public class Validacao {

    public boolean validaCpf(String numeroCPF) { // retorna true se CPF for válido. //se retorno = false tratar erro utilizando "erro"
        int[] CPF = new int[11];
        int soma = 0, dig1in, dig1out, dig2in, dig2out;
        numeroCPF = numeroCPF.replaceAll("[\\.,\\-, ]", "");
     
        for (int i = 0; i < 11; i++) {
            char num = numeroCPF.charAt(i);
            CPF[i] = Integer.parseInt(Character.toString(num));
        } //verifica se todos digitos são iguais (Exemplo 999.999.999-99) //se todos forem iguais o CPF é inválido. int contDig = 0; for (int i = 0; i < 10; i++) { if (CPF[i] == CPF[i + 1]) { contDig += 1; } } if (contDig == 10) { setErro("Número de CPF inválido!"); return false; }
        dig1in = CPF[9];
        dig2in = CPF[10];
        int cont = 0;
        for (int i = 10; i > 1; i--) {
            soma = soma + (CPF[cont] * i);
            cont += 1;
        }
        dig1out = 11 - (soma % 11);
        if (dig1out == 10 || dig1out == 11) {
            dig1out = 0;
        }
        CPF[9] = dig1out;
        cont = 0;
        soma = 0;
        for (int i = 11; i > 1; i--) {
            soma = soma + (CPF[cont] * i);
            cont += 1;
        }
        dig2out = 11 - (soma % 11);
        if (dig2out == 10 || dig2out == 11) {
            dig2out = 0;
        }
        if (dig1in != dig1out || dig2in != dig2out) {
            return false;
        }
        return true;
    }//validaCpf
    public boolean validarEmail(String email) {
        
        Pattern padrao   = Pattern.compile("^[a-z][a-z\\-_.0-9]+@.+\\.[a-z]+");
        Matcher pesquisa = padrao.matcher(email.toLowerCase());

        if (!pesquisa.matches()) {
            return false;
        }
        return true;
    }
}
