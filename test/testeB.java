/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Intro_classes.banco;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laisl
 */
public class testeB {
    banco n;
    public testeB() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        n = new banco();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testeSaque(){
        assertNotNull(n.sacar(2));
    }
    
    @Test
    public void testeDeposito(int valor){
               if (valor < 0){
                   assertTrue("valor errado", true);
    }

    }
}
