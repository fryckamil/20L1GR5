/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamil
 */
public class Projekt_bibliotekaTest {
    
    public Projekt_bibliotekaTest() {
        
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of start method, of class Projekt_biblioteka.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = null;
        Projekt_biblioteka instance = new Projekt_biblioteka();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Projekt_biblioteka.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Projekt_biblioteka.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
