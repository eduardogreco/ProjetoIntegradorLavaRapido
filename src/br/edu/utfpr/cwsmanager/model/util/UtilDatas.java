/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EduardoGreco
 */
public class UtilDatas {

    public UtilDatas() {
    }

    public Date toDate(String data) {
//recebe uma data String com formato "DD/MM/YYYY" e converte para Date;
        data.replace("/", "");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = sdf.parse(data);
        } catch (ParseException pex) {
            pex.printStackTrace();
            Logger.getLogger(UtilDatas.class.getName()).log(Level.SEVERE, null, pex);
        }

        return date;
    }
    
    public String toString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = null;

        data = sdf.format(date);

        return data;
    }
    
      public static String getDate() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }
}
