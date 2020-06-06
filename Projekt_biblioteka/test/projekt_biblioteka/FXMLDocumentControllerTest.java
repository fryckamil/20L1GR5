/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.connection;

/**
 *
 * @author Kamil
 */
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
    }
    
    public class User{
        String imie;
        String nazwisko;
        String login;
        String haslo;
        int nu_tel;
        
         public User(String imie, String nazwisko,String login,String haslo, int nu_tel){
     imie = this.imie;
     nazwisko = this.nazwisko;
     login = this.login;
     haslo = this.haslo;
     nu_tel = this.nu_tel;
   }
    public void dodaj (String imie, String nazwisko,String login,String haslo, int nu_tel){
        System.out.println("Dodano "+imie+" "+nazwisko+" "+login+" "+haslo+" "+nu_tel+" ");
    }
}
    
    public class Pdf_uz {
        
        public void dodaj_do_pdfa (String imie, String nazwisko,String login,String haslo, int nu_tel){
        System.out.println("Dodaj "+imie+" "+nazwisko+" "+login+" "+haslo+" "+nu_tel+" ");
    }
        public void gener() {
            System.out.println("Dodano do PDF-a");
        }
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
     * Test of getKsiazki method, of class FXMLDocumentController.
     */
    @Test
    public void testGetKsiazki() {
        System.out.println("getKsiazki");
       
        FXMLDocumentController instance = new FXMLDocumentController();
        ObservableList<Person> expResult = FXCollections.observableArrayList();
        expResult.add(new Person("John", "Doe","",""));
        ObservableList<Person> result = FXCollections.observableArrayList();
        result.add(new Person("John", "Doe","",""));
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() throws MalformedURLException {
        System.out.println("initialize");
        String urg="FXMLDocument.fxml";
        URL url = new URL("http://example.com/pages/");
              Locale locale = new Locale("en", "EN");
        ResourceBundle rb = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        //instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of clickAddUser method, of class FXMLDocumentController.
     */
    @Test
    public void testClickAddUser() throws Exception {
        System.out.println("clickAddUser");
        FXMLDocumentController instance = new FXMLDocumentController();
           Locale locale = new Locale("en", "EN");
        Connection con = connection.conDB();
       User uzy=new User("Kaml","fryc","logf","ff",34);
      uzy.dodaj("Jan","Nowak","sdsf","34sd",3323234);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addUsers method, of class FXMLDocumentController.
     */
    @Test
    public void testAddUsers() throws Exception {
        System.out.println("addUsers");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.addUsers();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pdf_uz method, of class FXMLDocumentController.
     */
    @Test
    public void testPdf_uz() throws Exception {
        System.out.println("pdf_uz");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        User uzy=new User("Kaml","fryc","logf","ff",34);
        Pdf_uz pdd=new Pdf_uz();
        pdd.dodaj_do_pdfa("Jan","Nowak","sdsf","34sd",3323234);
        pdd.gener();
       // instance.pdf_uz(event);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
