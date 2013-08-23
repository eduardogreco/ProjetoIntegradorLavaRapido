/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.samansys.model.util;

import br.edu.utfpr.cwsmanager.model.util.Validacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo Greco
 */
public class UtilTest {

    Validacao Util = new Validacao();
    
    public UtilTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        testIsValidCpf();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidCpf() {
        System.out.println("isValidCpf");
        String str = "07555222906";
        boolean expResult = true;
        boolean result = Util.validaCpf(str);

        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");
        String email = "eduardo@hotmail.com";
        boolean expResult = true;
        boolean result = Util.validarEmail(email);
        assertEquals(expResult, result);
    }



}
