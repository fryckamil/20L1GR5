/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Kamil
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Menu wyp;
    @FXML
    private Label lagin;
    @FXML
    private TextField login_pod;
    @FXML
    private ComboBox<String> wybor;
    ObservableList<String> list=FXCollections.observableArrayList("Gothic","FIFA 13","Age of Empires");
    @FXML
    private Label data_wyp;
    @FXML
    private TextField data_wyp_podaj;
    @FXML
    private Label data_zwr;
    @FXML
    private TextField data_zwr_podaj;
    @FXML
    private Button wyczysc;
    @FXML
    private Button wypozysz;
    @FXML
    private Label wyb_ks;
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
    private TextField surname_field1;
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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        menu_zwrot1.setDisable(true);
        wyl.setVisible(false);
        menu_zwrot.setDisable(true);
        witaj.setVisible(false);
                log_po.setVisible(false);
                logowanie.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        haslo_login.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        wypo_ks.setVisible(false);
        zwrot_ksiazki.setVisible(false);
        utw_konta.setVisible(false);
        
        logowanie.setVisible(true);
                haslo_login.setVisible(true);
                        log.setVisible(true);
                        zal.setVisible(true);
        
        wybor.setItems(list);
        wybor.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        wybor.setVisible(false);
      wypozysz.setVisible(false);
      wyczysc.setVisible(false);
      data_zwr_podaj.setVisible(false);
      data_zwr.setVisible(false);
      data_wyp_podaj.setVisible(false);
      data_wyp.setVisible(false);
      lagin.setVisible(false);
      login_pod.setVisible(false);
      wyb_ks.setVisible(false);
      
      data_zwr_podaj.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      data_zwr.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      data_wyp_podaj.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      data_wyp.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      lagin.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      login_pod.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
      
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
      
      
       surname_field1.setVisible(false);
      login_field1.setVisible(false);
      number_field1.setVisible(false);
      name_field1.setVisible(false);
      loginSingInButton1.setVisible(false);
      first_lable.setVisible(false);
      registerSingUpButton1.setVisible(false);
      password_field1.setVisible(false);
       surname_field1.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
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
    }    

    @FXML
    private void wypozycz1(ActionEvent event) {
        menu_zwrot1.setDisable(false);
        menu_zwrot.setDisable(false);
        rej.setDisable(true);
         witaj.setVisible(false);
                log_po.setVisible(false);
                logow.setVisible(false);
        
         surname_field1.setVisible(false);
      login_field1.setVisible(true);
      wybor.setVisible(true);
      number_field1.setVisible(false);
      name_field1.setVisible(true);
      loginSingInButton1.setVisible(true);
      first_lable.setVisible(true);
      registerSingUpButton1.setVisible(true);
      password_field1.setVisible(true);
      
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
         zwrot_login.setVisible(false);
    }

    @FXML
    private void skw(ActionEvent event) {
    }


    @FXML
    private void konto(ActionEvent event) {
        menu_zwrot1.setDisable(true);
         menu_zwrot.setDisable(true);
         wyl.setVisible(true);
         
          witaj.setVisible(false);
                log_po.setVisible(false);
                wyl.setVisible(false);
                logow.setVisible(true);
        
         surname_field.setVisible(true);
      login_field.setVisible(true);
      number_field.setVisible(true);
      name_field.setVisible(true);
      loginSingInButton.setVisible(true);
      first_lable.setVisible(true);
      registerSingUpButton.setVisible(true);
      password_field.setVisible(true);
      
      surname_field1.setVisible(false);
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
    private void zwrot(ActionEvent event) {
        menu_zwrot1.setDisable(false);
         menu_zwrot.setDisable(false);
         
         rej.setDisable(true);
         
          witaj.setVisible(false);
                log_po.setVisible(false);
                logow.setVisible(false);
                wyl.setVisible(true);
        
        utw_konta.setVisible(false);
      wypo_ks.setVisible(false);
      zwrot_ksiazki.setVisible(true);
      
       logowanie.setVisible(false);
                haslo_login.setVisible(false);
                log.setVisible(false);
                 zal.setVisible(false);
      
        zwrot_wyslij.setVisible(true);
       wyczysc_zwrot.setVisible(true);
        zwrot_ksiazka.setVisible(true);
         zwrot_login.setVisible(true);
         
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
    private void wyloguj(ActionEvent event) {
        logowanie.setVisible(true);
                haslo_login.setVisible(true);
                log.setVisible(true);
                zal.setVisible(true);
                wyl.setVisible(false);
                logow.setVisible(true);
                
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
      password_field.setVisible(false);
    }

    @FXML
    private void log(ActionEvent event) {
        if("Kamil".equals(logowanie.getText()) && ("haslo".equals(haslo_login.getText())))
        { 
            witaj .setVisible(true);
            log_po.setVisible(true);
            logow.setVisible(false);
            zal.setVisible(false);
            wyl.setVisible(true);
            rej.setDisable(true);
            
            menu_zwrot1.setDisable(false);
         menu_zwrot.setDisable(false);
         
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
        
                
        
        
    }

    

    @FXML
    private void log1(ActionEvent event) {
        
            witaj .setVisible(false);
            log_po.setVisible(false);
            
            zal.setVisible(true);
            wyl.setVisible(false);
            rej.setDisable(false);
            
            
            
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
        
        login_field1.setText("");
      wybor.setVisible(false);
      number_field1.setText("");
      name_field1.setText("");
      
      first_lable.setText("");
      
      password_field1.setText("");
      
      surname_field.setText("");
      login_field.setText("");
      number_field.setText("");
      name_field.setText("");
      
      first_lable.setText("");
      
      password_field.setText("");;
      
      
        zwrot_ksiazka.setText("");
         zwrot_login.setText("");
    }

    
}
