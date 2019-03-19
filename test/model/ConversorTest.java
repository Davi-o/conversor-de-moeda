/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Davi Alves
 * @since 19/03 - 11:28
 * @version 1.0
 */
public class ConversorTest {
    private static final Conversor conv = new Conversor();
    
    public ConversorTest() { }
    
    @BeforeClass
    public static void setUpClass() { }
    
    @AfterClass
    public static void tearDownClass() { }
    
    @Before
    public void setUp() { }
    
    @After
    public void tearDown() { }
    
    /**
     * Test of convertToDolar method, of class Conversor.
     */
    @Test
    public void testConvertToDolar() { 
        System.out.println("Teste Dolar");
        assertEquals(0.26, conv.convertToDolar(), 0.0);
    }

    /**
     * Test of convertToEuro method, of class Conversor.
     */
    @Test
    public void testConvertToEuro() {
        System.out.println("Teste Euro");
        assertEquals(0.23, conv.convertToEuro(), 0.0);
    }

    /**
     * Test of convertToPeso method, of class Conversor.
     */
    @Test
    public void testConvertToPeso() {
        System.out.println("Teste Peso");
        assertEquals(10.59, conv.convertToPeso(), 0.0);   
    }

    /**
     * Test of convertToBitcoin method, of class Conversor.
     */
    @Test
    public void testConvertToBitcoin() {
        System.out.println("Teste Bitcoin");
        assertEquals(0.000066, conv.convertToBitcoin(), 0.0);
    }
}
