/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.pessoa;

/**
 *
 * @author EduardoGreco
 */
public enum Sexo {
    M("Masculino"),
    F("Feminino");
    
    private String descricao;
    private Sexo(String desc){
    this.descricao = desc;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
    
}
