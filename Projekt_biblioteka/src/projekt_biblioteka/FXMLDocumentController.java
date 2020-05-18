/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


import utils.connection;

/**
 *
 * @author Kamil
 */
public class FXMLDocumentController implements Initializable {


         
 
  
  
  
  
    @FXML
    private Menu wyp;
    
    
    @FXML
    private ComboBox<String> wybor;
    ObservableList<String> list=FXCollections.observableArrayList(
        "Wybierz książkę"
       
    );
   
    
    
    
    
    
    @FXML
    private Button wypozysz;
    
    @FXML
    private TextField surname_field;
    @FXML
    private TextField login_field;
    @FXML
    private TextField number_field;
    @FXML
    private TextField name_field;
    @FXML
    private Button loginSingInButton;
    @FXML
    private Label first_lable;
    @FXML
    private Button registerSingUpButton;
    @FXML
    private PasswordField password_field;
    @FXML
    private Button registerSingUpButton1;
    @FXML
    private Button loginSingInButton1;
    @FXML
    private PasswordField password_field1;
    @FXML
    private TextField login_field1;
    
    @FXML
    private TextField name_field1;
    @FXML
    private TextField number_field1;
    @FXML
    private Label utw_konta;
    @FXML
    private Label wypo_ks;
    @FXML
    private MenuItem menu_zwrot;
    @FXML
    private Button zwrot_wyslij;
    @FXML
    private Button wyczysc_zwrot;
    @FXML
    private TextField zwrot_ksiazka;
    @FXML
    private TextField zwrot_login;
    @FXML
    private Label zwrot_ksiazki;
    @FXML
    private TextField logowanie;
    @FXML
    private PasswordField haslo_login;
    @FXML
    private Label log;
    @FXML
    private MenuItem menu_zwrot1;
    @FXML
    private Label witaj;
    @FXML
    private Text log_po;

    @FXML
    private Button zal;
    @FXML
    private MenuItem logow;
    @FXML
    private MenuItem wyl;
    @FXML
    private MenuItem rej;
    @FXML
    private Button wroc;
    @FXML
    private Button baza;
    @FXML
    private Button laduj;
    @FXML
    private TextField pod_data_zwt;
    
    @FXML
    private Text log_po1;
    @FXML
    private Label witaj1;
    @FXML
    private MenuItem tab;
    @FXML private javafx.scene.control.TableView<Person> tab_ksiazka;
    @FXML
    public TableColumn<Person,String > tytul;
    
    @FXML
    public TableColumn<Person,String> autor;
    @FXML
    public TableColumn<Person,String> rok;
    @FXML
    public TableColumn<Person,String> gatunek;
    @FXML
    private ImageView regal;
    @FXML
    private Label ks_ta;
    @FXML
    private ComboBox<String> wybor_zwrot;
    
    
     ObservableList<Person>getKsiazki(){
         ObservableList<Person> ksiazki=FXCollections.observableArrayList();
         //ksiazki.add(new Person("John", "Doe",0,""));
         return ksiazki;
     }
    int tm;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        regal.setFitWidth(568.0);
        wybor_zwrot.setVisible(false);
        menu_zwrot1.setDisable(true);
        tab_ksiazka.setVisible(false);
        wyl.setVisible(false);
        menu_zwrot.setDisable(true);
        tab.setVisible(true);
        tab.setVisible(true);
        ks_ta.setVisible(false);
        tytul.setCellValueFactory(new PropertyValueFactory<>("Tytuł"));
          autor.setCellValueFactory(new PropertyValueFactory<>("Autor"));
            rok.setCellValueFactory(new PropertyValueFactory<>("Rok wydansia"));
              gatunek.setCellValueFactory(new PropertyValueFactory<>("Gatdunek"));
              tab_ksiazka.setItems(getKsiazki());
//tab_ksiazka.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
 
        //
        witaj.setVisible(false);
      
       witaj1.setVisible(false);
        pod_data_zwt.setVisible(false);
                log_po.setVisible(false);
                logowanie.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        haslo_login.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        wypo_ks.setVisible(false);
        zwrot_ksiazki.setVisible(false);
        utw_konta.setVisible(false);
        wroc.setVisible(false);
        log_po1.setVisible(false);
        logowanie.setVisible(true);
                haslo_login.setVisible(true);
                        log.setVisible(true);
                        zal.setVisible(true);
        
        //wybor.setItems(list);
        wybor.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        wybor.setVisible(false);
      wypozysz.setVisible(false);
      
      
      
      
     
      
      
      
      
      
      
      
      
      
     
      pod_data_zwt.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");;
      
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      password_field.setVisible(false);
      surname_field.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      login_field.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      number_field.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      name_field.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      password_field.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      
      
     
      login_field1.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
       
      login_field1.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      number_field1.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      name_field1.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      password_field1.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      
      zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
         zwrot_login.setVisible(false);
         zwrot_ksiazka.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
         zwrot_login.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
         
         
         
         
       
        try {
            addUsers();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
 
    
    
    
    
public void clickAddUser() throws Exception{

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
    Parent root =  fxmlLoader.load();
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
}
public void addUsers() throws SQLException {
    
}


    public FXMLDocumentController (){
       con=connection.conDB();
    }
    int id_woj1=0;
                            int id_woj2=0;
                            int licznik_wierszy=0, licznik_log=0;
    @FXML
    private void wypozycz1(ActionEvent event) {
        menu_zwrot1.setDisable(false);
        regal.setFitWidth(568.0);
        menu_zwrot.setDisable(false);
        rej.setDisable(true);
        tm=0;
        wybor_zwrot.setVisible(false);
         witaj.setVisible(false);
         log_po1.setVisible(false);
         ks_ta.setVisible(false);
         tab_ksiazka.setVisible(false);
                log_po.setVisible(false);
                logow.setVisible(false);
                log_po1.setVisible(true);
                wroc.setVisible(false);
        pod_data_zwt.setVisible(true);
         
      login_field1.setVisible(false);
      wybor.setVisible(true);
     
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(true);
      first_lable.setVisible(true);
      registerSingUpButton1.setVisible(true);
      password_field1.setVisible(true);
      witaj1.setVisible(false);
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      password_field.setVisible(false);
       
      wypo_ks.setVisible(true);
      utw_konta.setVisible(false);
      zwrot_ksiazki.setVisible(false);
      log.setVisible(false);
      
      logowanie.setVisible(false);
                haslo_login.setVisible(false);
                zal.setVisible(false);
      
       zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
        
          String ksiazka="SELECT * FROM ksiazki;";
      try {  
                   preparedStatement=con.prepareStatement(ksiazka);
            
            resultSet=preparedStatement.executeQuery();
                   
                   
                   
                   while(resultSet.next()){
                   
                   String nazwa=resultSet.getString("tytul");
                 // list=FXCollections.observableArrayList(nazwa);
                   wybor.getItems().add(nazwa);
                   }
            } catch (SQLException ex) {
       
    JOptionPane.showMessageDialog(null,"Nie można wyświetlić województwa!", "Uwaga", JOptionPane.WARNING_MESSAGE);
    
       // System.err.println(ex.getMessage());
       
       
    }
         zwrot_login.setVisible(false);
    }

    @FXML
    private void skw(ActionEvent event) {
    }


    @FXML
    private void konto(ActionEvent event) {
        menu_zwrot1.setDisable(true);
         menu_zwrot.setDisable(true);
         tab_ksiazka.setVisible(false);
         wyl.setVisible(true);
         regal.setFitWidth(568.0);
         ks_ta.setVisible(false);
         log_po1.setVisible(false);
         pod_data_zwt.setVisible(false);
         wybor_zwrot.setVisible(false);
          witaj.setVisible(false);
                log_po.setVisible(false);
                wyl.setVisible(false);
                logow.setVisible(true);
                
                wroc.setVisible(false);
        
         surname_field.setVisible(true);
      login_field.setVisible(true);
      number_field.setVisible(true);
      name_field.setVisible(true);
      loginSingInButton.setVisible(true);
      first_lable.setVisible(true);
      registerSingUpButton.setVisible(true);
      password_field.setVisible(true);
      
      
      login_field1.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
      
      utw_konta.setVisible(true);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(false);
      log.setVisible(false);
      
       logowanie.setVisible(false);
                haslo_login.setVisible(false);
                 zal.setVisible(false);
      
      zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
         zwrot_login.setVisible(false);
    }
    
    
    @FXML
    private void log(ActionEvent event) {
        regal.setFitWidth(568.0);
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        wybor_zwrot.setVisible(false);
         if("kifa".equals(logowanie.getText()) && ("haslo".equals(haslo_login.getText())))
        {
        
        if("kifa".equals(logowanie.getText()) && ("haslo".equals(haslo_login.getText())))
        {  String login1=logowanie.getText();
        System.out.println(login1);
        if(tym==0) {
            witaj .setVisible(true);
            log_po.setVisible(true);
            tym=1;
            wroc.setVisible(false);
        }
        
            logow.setVisible(false);
            zal.setVisible(false);
            wyl.setVisible(true);
            rej.setDisable(true);
            wroc.setVisible(false);
            
            menu_zwrot1.setDisable(false);
         menu_zwrot.setDisable(false);
         //logg.setVisible(true);
         log_po1.setText("Jesteś zalogowany jako "+login1);
         logowanie.setVisible(false);
                haslo_login.setVisible(false);
                log.setVisible(false);
                
                utw_konta.setVisible(false);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(false);
      
      zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
         zwrot_login.setVisible(false);
         pod_data_zwt.setVisible(false);
         login_field1.setVisible(false);
      wybor.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
      
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      password_field.setVisible(false);
      
      
       // wybor.setItems(list);
       if(tm==0) {
     int id_woj1=0;
                            int id_woj2=0;
                            int licznik_wierszy=0, licznik_log=0;
        String c=name_field1.getText().toString();
         b=( String) wybor.getValue();
         String d=pod_data_zwt.getText();
         
                  LocalDate myObj = LocalDate.now(); 
                   String sql="SELECT * FROM klienci WHERE login= ?;";
                  
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,login1);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                   int id_klienta=resultSet.getInt("id_klienta");
                   String login=resultSet.getString("login");
                   
                   if(!login1.equals(login)) {    licznik_log++;  }
                   else id_woj2=id_klienta;
                   licznik_wierszy++;
                   
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                   String sql2="SELECT * FROM ksiazki where tytul= ? ;";
                   
                   try {
            preparedStatement=con.prepareStatement(sql2);
            preparedStatement.setString(1,b);
            resultSet=preparedStatement.executeQuery();
           while(resultSet.next()){
                   int id_gry=resultSet.getInt("id_ksiazki");
                   String nazwa_gry=resultSet.getString("tytul");
                  
                   pom=1;
                   
                   if(b.equals(nazwa_gry)) {  id_woj1=id_gry;   break; }
                   else { 
                       break;
                   
                   }}
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
              if(id_woj1!=0 && !b.equals(""))    { 
        if(licznik_log!=licznik_wierszy && id_woj1!=0 && pom==1 && !b.equals(""))
               {
                   
            ///
                String sql1="INSERT INTO wypozyczenia VALUES (null,'"+id_woj2+"','"+id_woj1+"','"+myObj+"','"+d+"')";
                try {
            preparedStatement=con.prepareStatement(sql1);
           preparedStatement.executeUpdate();
            //wroc.setVisible(true);
            tym=2;
            JOptionPane.showMessageDialog(null,"Wypożyczyłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);
           b="";
           System.out.println("b"+b);
           wybor.getItems().clear();
           pod_data_zwt.setText("");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE); 
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
     //////////////////////////////           
                
         
///////////////////////////////////
    }
else {    
            wroc.setVisible(true); 
            
               } } else if((b.equals(""))) { wroc.setVisible(true); 
             // witaj .setVisible(true);
          //  log_po.setVisible(true); 
               System.out.println("Wybierz książkę");
    
                //JOptionPane.showMessageDialog(null,"Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE);  
        } //else {wroc.setVisible(true);} 
              
        }
        
        
        if(tm==1) {
     int id_woj1=0;
                            int id_woj2=0;
                            int licznik_wierszy=0, licznik_log=0;
        String c=name_field1.getText().toString();
         b=( String) wybor.getValue();
         String d=pod_data_zwt.getText();
         
                  LocalDate myObj = LocalDate.now(); 
                   String sql="SELECT * FROM klienci WHERE login= ?;";
                  
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,login1);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                   int id_klienta=resultSet.getInt("id_klienta");
                   String login=resultSet.getString("login");
                   
                   if(!login1.equals(login)) {    licznik_log++;  }
                   else id_woj2=id_klienta;
                   licznik_wierszy++;
                   
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                   String sql2="select ksiazki.tytul from wypozyczenia inner join ksiazki on wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta='"+id_woj2+"'";
                   
                   try {
            preparedStatement=con.prepareStatement(sql2);
            preparedStatement.setString(1,b);
            resultSet=preparedStatement.executeQuery();
           while(resultSet.next()){
                   int id_gry=resultSet.getInt("id_ksiazki");
                   String nazwa_gry=resultSet.getString("tytul");
                  
                   pom=1;
                   
                   if(b.equals(nazwa_gry)) {  id_woj1=id_gry;   break; }
                   else { 
                       break;
                   
                   }}
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
              if(id_woj1!=0 && !b.equals(""))    { 
        if(licznik_log!=licznik_wierszy && id_woj1!=0 && pom==1 && !b.equals(""))
               {
                   
            ///
                String sql1="INSERT INTO wypozyczenia VALUES (null,'"+id_woj2+"','"+id_woj1+"','"+myObj+"','"+d+"')";
                try {
            preparedStatement=con.prepareStatement(sql1);
           preparedStatement.executeUpdate();
            //wroc.setVisible(true);
            tym=2;
            JOptionPane.showMessageDialog(null,"Wypożyczyłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);
           b="";
           System.out.println("b"+b);
           wybor.getItems().clear();
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE); 
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
     //////////////////////////////           
                
         
///////////////////////////////////
    }
else {    
            wroc.setVisible(true); 
            
               } } else if((b.equals(""))) { wroc.setVisible(true); 
             // witaj .setVisible(true);
          //  log_po.setVisible(true); 
               System.out.println("Wybierz książkę");
    
                //JOptionPane.showMessageDialog(null,"Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE);  
        } //else {wroc.setVisible(true);} 
              
        }
        
        
        
        }}else{ JOptionPane.showMessageDialog(null,"Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE); }
      
       
    
        
    }
    

    @FXML
    private void zwrot(ActionEvent event) {
       wybor_zwrot.getItems().clear();
        menu_zwrot1.setDisable(false);
         menu_zwrot.setDisable(false);
         regal.setFitWidth(568.0);
         ks_ta.setVisible(false);
         log_po1.setVisible(false);
         zwrot_ksiazki.setVisible(false);
         rej.setDisable(true);
         wybor_zwrot.setVisible(true);
         name_field.setVisible(false);
         name_field1.setVisible(false);
         tm=1;
         pod_data_zwt.setVisible(false);
         tab_ksiazka.setVisible(false);
         pod_data_zwt.setVisible(true);
          witaj.setVisible(false);
                log_po.setVisible(false);
                logow.setVisible(false);
                wyl.setVisible(true);
                zwrot_login.setVisible(true);
        
        utw_konta.setVisible(false);
        zwrot_login.setVisible(false);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(true);
      
      wroc.setVisible(false);
      
       logowanie.setVisible(false);
                haslo_login.setVisible(false);
                log.setVisible(false);
                 zal.setVisible(false);
      
        zwrot_wyslij.setVisible(true);
       wyczysc_zwrot.setVisible(true);
        zwrot_ksiazka.setVisible(true);
         
         
         login_field1.setVisible(false);
      wybor.setVisible(false);
      number_field1.setVisible(false);
     
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
      
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      password_field.setVisible(false);
      log_po1.setVisible(true);
      log_po1.setText("Jesteś zalogowany jako "+logowanie.getText());
    id_woj1=0;
                           id_woj2=0;
                          licznik_wierszy=0; licznik_log=0;
    
      String login1=logowanie.getText();
      System.out.print("LOG"+login1);
            String sql="SELECT * FROM klienci WHERE login= ?;";
                  
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,login1);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                   int id_klienta=resultSet.getInt("id_klienta");
                   String login=resultSet.getString("login");
                   
                   if(!login1.equals(login)) {    licznik_log++;  }
                   else id_woj2=id_klienta;
                   licznik_wierszy++;
                   
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        String ksiazka="SELECT ksiazki.tytul FROM wypozyczenia INNER JOIN ksiazki ON wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta="+id_woj2+";";
      try {  
                   preparedStatement=con.prepareStatement(ksiazka);
            
            resultSet=preparedStatement.executeQuery();
                   
                  System.out.print("wwww "+id_woj2);
                   
                   while(resultSet.next()){
                   
                   String nazwa=resultSet.getString("tytul");
                 // list=FXCollections.observableArrayList(nazwa);
                   wybor_zwrot.getItems().add(nazwa);
                   }
            } catch (SQLException ex) {
       
    JOptionPane.showMessageDialog(null,ex, "Uwaga", JOptionPane.WARNING_MESSAGE);
    
       // System.err.println(ex.getMessage());
       
       
    }   
      
      
    }
int tym=0;
String b="";
String bz="";
int pom=0;
    @FXML
    private void wyloguj(ActionEvent event) {
        regal.setFitWidth(568.0);
        logowanie.setVisible(true);
        wybor_zwrot.setVisible(false);
        ks_ta.setVisible(false);
        log_po1.setVisible(false);
                haslo_login.setVisible(true);
                log.setVisible(true);
                zal.setVisible(true);
                tab_ksiazka.setVisible(false);
                wroc.setVisible(false);
                wyl.setVisible(false);
                pod_data_zwt.setVisible(false);
                logow.setDisable(false);
                logow.setVisible(true);
                logowanie.setText("");
                haslo_login.setText("");
                wroc.setVisible(false);
                b="";
                
                
                //wybor.getSelectionModel().getSelectedItem().toString();
                rej.setDisable(false);
                
                menu_zwrot1.setDisable(true);
         menu_zwrot.setDisable(true);
         
          witaj.setVisible(false);
                log_po.setVisible(false);
         
         utw_konta.setVisible(false);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(false);
      
      zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
         zwrot_login.setVisible(false);
         
         login_field1.setVisible(false);
      wybor.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
      
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      ks_ta.setVisible(false);
      password_field.setVisible(false);
      tym=0;
    }

Connection con=null;
 PreparedStatement preparedStatement = null;
 ResultSet resultSet=null;
 

 
    

    /////

    @FXML
    private void log1(ActionEvent event) {
        regal.setFitWidth(568.0);
            witaj .setVisible(false);
            log_po.setVisible(false);
            tab_ksiazka.setVisible(false);
            zal.setVisible(true);
            pod_data_zwt.setVisible(false);
            wyl.setVisible(false);
            ks_ta.setVisible(false);
            wybor_zwrot.setVisible(false);
            rej.setDisable(false);
            log_po1.setVisible(false);
            wroc.setVisible(false);
            
            logowanie.setText("");
                haslo_login.setText("");
            
            menu_zwrot1.setDisable(true);
         menu_zwrot.setDisable(true);
         
         logowanie.setVisible(true);
                haslo_login.setVisible(true);
                log.setVisible(true);
                
                utw_konta.setVisible(false);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(false);
      
      zwrot_wyslij.setVisible(false);
       wyczysc_zwrot.setVisible(false);
        zwrot_ksiazka.setVisible(false);
         zwrot_login.setVisible(false);
         
         login_field1.setVisible(false);
      wybor.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
      
      surname_field.setVisible(false);
      login_field.setVisible(false);
      number_field.setVisible(false);
      name_field.setVisible(false);
      loginSingInButton.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton.setVisible(false);
      password_field.setVisible(false);
        
        
                
        
        
    }

    @FXML
    private void wyczysc(ActionEvent event) {
        regal.setFitWidth(568.0);
        
        login_field1.setText("");
    wybor.setPromptText("Wybierz książkę");
      number_field1.setText("");
      name_field1.setText("");
      tab_ksiazka.setVisible(false);
      pod_data_zwt.setText("");
      first_lable.setText("");
      ks_ta.setVisible(false);
      log_po1.setVisible(false);
      password_field1.setText("");
      log_po1.setText("");
      wybor_zwrot.setVisible(false);
      surname_field.setText("");
      login_field.setText("");
      number_field.setText("");
      name_field.setText("");
      
      first_lable.setText("");
      
      password_field.setText("");;
      
      
        zwrot_ksiazka.setText("");
         zwrot_login.setText("");
    }

    @FXML
    private void czysc(ActionEvent event) {
        regal.setFitWidth(568.0);
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        log_po1.setVisible(false);
          String sql="TRUNCATE TABLE klienci";
          String sql1="TRUNCATE TABLE ksiazki";
          String sql2="TRUNCATE TABLE wypozyczenia";
                  
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement=con.prepareStatement(sql1);
            preparedStatement.executeUpdate();
            preparedStatement=con.prepareStatement(sql2);
            preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void lad(ActionEvent event) {
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        regal.setFitWidth(568.0);
        log_po1.setVisible(false);
        String pol=""
                    + "SET NAMES 'utf8' COLLATE 'utf8_polish_ci'";
        try {
                    preparedStatement=con.prepareStatement(pol);
           preparedStatement.executeUpdate();
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      try {
   // Uworzenie obiektu FileReader
   FileReader fileReader = new FileReader("C:\\Users\\Kamil\\Desktop\\programowanie\\programowanie zespołowe\\biblioteka\\Dokumentacja\\wymagania.sql");
   
   // Utworzenie obiektu bufferReader
   BufferedReader bufferReader = new BufferedReader(fileReader);
   
   String linia;
   
   while((linia = bufferReader.readLine()) != null) {
       
       
       String [] tmpTStr = linia.split(("\\r?\\n"));
    System.out.println(linia);
    for(int j=0; j<tmpTStr.length; j++) {
        String [] tmpTStr1 = linia.split(",");
    for(int i=0; i<tmpTStr1.length; i++){
            System.out.println(tmpTStr1[i]);
           
        } //if(!login1.equals(login))
    if((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("kl")) ) {
     String sql5="INSERT INTO klienci VALUES (NULL, '"+tmpTStr1[1]+"', '"+tmpTStr1[2]+"', '"+tmpTStr1[3]+"', '"+tmpTStr1[4]+"', '"+tmpTStr1[5]+"');";
                try {
            preparedStatement=con.prepareStatement(sql5);
           preparedStatement.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }} else if ((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("kw")) ) {
            
                   
     String sql5="INSERT INTO ksiazki VALUES (NULL, '"+tmpTStr1[1]+"', '"+tmpTStr1[2]+"', '"+tmpTStr1[3]+"', '"+tmpTStr1[4]+"');";
                try {
                    preparedStatement=con.prepareStatement(pol);
           preparedStatement.executeUpdate();
            preparedStatement=con.prepareStatement(sql5);
           preparedStatement.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }}
    else if ((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("w")) ) {
     String sql5="INSERT INTO wypozyczenia VALUES (NULL, '"+tmpTStr1[1]+"', '"+tmpTStr1[2]+"', '"+tmpTStr1[3]+"', '"+tmpTStr1[4]+"');";
                try {
            preparedStatement=con.prepareStatement(sql5);
           preparedStatement.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }}
   }  System.out.println(linia); }
   fileReader.close();
  }
  catch (FileNotFoundException e) {
   e.printStackTrace();
  } 
  catch (IOException e) {
   e.printStackTrace();
  }
 
    }
//surname_field.setVisible(true); nazwisko
      //login_field.setVisible(true); login
      //number_field.setVisible(true); telefon
      //name_field.setVisible(true); imię
      //loginSingInButton.setVisible(true);
      //first_lable.setVisible(true);
      //registerSingUpButton.setVisible(true);
      //password_field.setVisible(true); hasło
    @FXML
    private void zal_konto(ActionEvent event) {
        regal.setFitWidth(568.0);
        int licznik_wierszy=0, licznik_log=0;
        tab_ksiazka.setVisible(false);
        log_po1.setVisible(false);
        String imie=name_field.getText();
        ks_ta.setVisible(false);
        String nazwisko=surname_field.getText();
        String d=login_field.getText();
        wybor_zwrot.setVisible(false);
        String haslo=password_field.getText();
        Integer number=-1;
        byte num[]=new byte[9];
         String sql="SELECT * FROM klienci;";
         try {
             
             
             
             
            preparedStatement=con.prepareStatement(sql);
            //preparedStatement.setString(1,login1);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                   int id_klienta=resultSet.getInt("id_klienta");
                   String login=resultSet.getString("login");
                   
                   if(!d.equals(login)) {   licznik_log++; }
                   licznik_wierszy++;
                
                   
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
         if("".equals(imie)|| "".equals(nazwisko) || "".equals(d) || "".equals(haslo) || "".equals(number)) JOptionPane.showMessageDialog(null,"Brak wszystkich danych!", "Uwaga", JOptionPane.WARNING_MESSAGE);
         else {
             
             try{
                 number = Integer.parseInt(number_field.getText());
                 
             } catch (NumberFormatException ex)
             {
                 
                 
                 JOptionPane.showMessageDialog(null,"Nieprawidłowy numer telefonu!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                 number_field.setText("");
             }
             
             if(number>=0)
             {
                 if(licznik_wierszy==licznik_log)
                 {
                     String sql1="INSERT INTO klienci VALUES (null,'"+imie+"','"+nazwisko+"','"+d+"','"+haslo+"','"+number+"')";
                     try {
                         preparedStatement=con.prepareStatement(sql1);
                         preparedStatement.executeUpdate();
                       
                         name_field.setText("");
                         
        surname_field.setText("");
        login_field.setText("");
        password_field.setText("");
        number_field.setText("");
        login_field.setText("");
        wroc.setVisible(false);
        JOptionPane.showMessageDialog(null,"Konto założone poprawnie!","Brawo!",JOptionPane.INFORMATION_MESSAGE);
                     } catch (SQLException ex) {
                         Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                 else { JOptionPane.showMessageDialog(null,"Ten login jest już zajęty!", "Uwaga", JOptionPane.WARNING_MESSAGE); login_field.setText("");  }
                 
             }}
 
 

}

    @FXML
    private void tabela(ActionEvent event) {
        
        tab_ksiazka.setVisible(true);
        regal.setFitWidth(568);
        ks_ta.setVisible(true);
        log_po.setVisible(false);
        wybor_zwrot.setVisible(false);
        utw_konta.setVisible(false);
        log_po1.setVisible(false);
        surname_field.setVisible(false);
        wypo_ks.setVisible(false);
        zwrot_ksiazki.setVisible(false);
        witaj1.setVisible(false);
        name_field.setVisible(false);
        zwrot_login.setVisible(false);
        witaj.setVisible(false);
        log.setVisible(false);
        ObservableList<Person> data = FXCollections.observableArrayList();
String sql1="select * from ksiazki";
                     try {
                         preparedStatement=con.prepareStatement(sql1);
                        resultSet=preparedStatement.executeQuery();
                       
            
                         while(resultSet.next()){
                   int id_gry=resultSet.getInt("id_ksiazki");
                   String nazwa=resultSet.getString("tytul");
                   String rok_wydania=resultSet.getString("autor");
                   String gatunek=resultSet.getString("rok_wydania");
                   String producent=resultSet.getString("gatunek");
                  
                  data.add(new Person(producent, nazwa,rok_wydania ,gatunek));
                   }                       
                        
                     } catch (SQLException ex) {
                         Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                     }
    
    tytul.setMinWidth(94);
    tytul.setCellValueFactory(new PropertyValueFactory<Person, String>("isActiveCol"){
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
            return new ReadOnlyObjectWrapper(param.getValue().getLastName());
        }
    });
    autor.setMinWidth(94);
    autor.setCellValueFactory(new PropertyValueFactory<Person, String>("userNameCol"){
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
            return new ReadOnlyObjectWrapper(param.getValue().getRok());
        }
    });
    rok.setMinWidth(94);
    rok.setCellValueFactory(new PropertyValueFactory<Person, String>("taskCol"){
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
            return new ReadOnlyObjectWrapper(param.getValue().getgat());
        }
    });
    gatunek.setMinWidth(94);
    gatunek.setCellValueFactory(new PropertyValueFactory<Person, String>("firstNameCol"){
        @Override
        public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
            return new ReadOnlyObjectWrapper(param.getValue().getFirstName());
        }
    });
    tab_ksiazka.setItems(data);
    
    
    
    
        Person ks=new Person();
                   /*  String sql1="select * from ksiazki";
                     try {
                         preparedStatement=con.prepareStatement(sql1);
                        resultSet=preparedStatement.executeQuery();
                       
            
                         while(resultSet.next()){
                   int id_gry=resultSet.getInt("id_ksiazki");
                   String nazwa=resultSet.getString("tytul");
                   String rok_wydania=resultSet.getString("autor");
                   int gatunek=resultSet.getInt("rok_wydania");
                   String producent=resultSet.getString("gatunek");
                  ks.setFirstName(nazwa);
                  ks.setLastName(rok_wydania);
                  tab_ksiazka.getItems().add(ks);
                   }
                        
                     } catch (SQLException ex) {
                         Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                     }
  */  }

    @FXML
    private void zwrot1ks11(ActionEvent event) {
        
        
        System.out.print(id_woj1+" " +id_woj2+" " +licznik_wierszy+" " +licznik_log+" ");
        bz=( String) wybor_zwrot.getValue();
           String sql2="SELECT * FROM ksiazki where tytul= ? ;";
           System.out.print("Ksiazka "+bz);
                   
                   try {
            preparedStatement=con.prepareStatement(sql2);
            preparedStatement.setString(1,bz);
            resultSet=preparedStatement.executeQuery();
           while(resultSet.next()){
                   int id_gry=resultSet.getInt("id_ksiazki");
                   String nazwa_gry=resultSet.getString("tytul");
                  
                   pom=1;
                   
                   if(bz.equals(nazwa_gry)) {  id_woj1=id_gry;   break; }
                   else { 
                       break;
                   
                   }}
           
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
      if(pom==1)    { 
        if(pom==1)
               {
                   
            ///  String
                  
                String sql1="delete from wypozyczenia where id_klienta="+id_woj2+" and id_ksiazki="+id_woj1+"";
                try { 
            preparedStatement=con.prepareStatement(sql1);
           preparedStatement.executeUpdate();
            //wroc.setVisible(true);
            tym=2;
            JOptionPane.showMessageDialog(null,"Zwróciłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);
           
           
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE); 
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                id_woj1=0;
                           id_woj2=0;
                          licznik_wierszy=0; licznik_log=0;
                          wybor_zwrot.getItems().clear();
                         
                         String login1=logowanie.getText();
      System.out.print("LOG"+login1);
            String sql="SELECT * FROM klienci WHERE login= ?;";
                  
        try {
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,login1);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                   int id_klienta=resultSet.getInt("id_klienta");
                   String login=resultSet.getString("login");
                   
                   if(!login1.equals(login)) {    licznik_log++;  }
                   else id_woj2=id_klienta;
                   licznik_wierszy++;
                   
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
                         
                         
                         
               String ksiazka="SELECT ksiazki.tytul FROM wypozyczenia INNER JOIN ksiazki ON wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta="+id_woj2+";";
      try {  
                   preparedStatement=con.prepareStatement(ksiazka);
            
            resultSet=preparedStatement.executeQuery();
                   
                  System.out.print("wwww "+id_woj2);
                   
                   while(resultSet.next()){
                   
                   String nazwa=resultSet.getString("tytul");
                 // list=FXCollections.observableArrayList(nazwa);
                   wybor_zwrot.getItems().add(nazwa);
                   }
            } catch (SQLException ex) {
       
    JOptionPane.showMessageDialog(null,ex, "Uwaga", JOptionPane.WARNING_MESSAGE);
    
       // System.err.println(ex.getMessage());
       
       
    }       
                
                
                
     //////////////////////////////           
                
         
///////////////////////////////////
    }
else {    
            System.out.print("if1");
            
               } } else {    
            System.out.print("if2");
            
               }
      
      
}}