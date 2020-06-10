/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;


import java.io.*;
import java.time.LocalDate;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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


import net.sf.jasperreports.engine.JRException;
import reports.Klient;
import reports.KlientRaport;
import reports.Wypozyczenia;
import reports.WypozyczeniaRaport;
import utils.connection;

/**
 *
 * @author Kamil
 * Klasa odpowiedzialna za obsługę obiektów FXML-owych wprowadzanych za pomocą myszy i klawiatury za pomocą 
 * narzedzia JavaFX i implemetnuje interfejs Initializable
 */
public class FXMLDocumentController implements Initializable {
/**
     * Wszysktie niżej wypisane zmienne służa do inicjalizacji obiektów FXML-owych  utworzonych za pomoą narzędzia JavaFX
     * @return 
     */

    @FXML
    private Menu wyp;
/**
 *  zmienna  który pozwala użytkownikom wybrać jedną z kilku opcji
 */
   

    @FXML
    private ComboBox<String> wybor;
     /**
     * zmienna która umożliwia wykonanie dowolnej akcji przy modyfikacji kolekcji czyli w tym przypadku za dodanie do listy  danyhc 
     * 
     */
    ObservableList<String> list = FXCollections.observableArrayList(
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
    private TextField pod_data_zwt;

    @FXML
    private Text log_po1;
    @FXML
    private Label witaj1;
    @FXML
    private MenuItem tab;
    @FXML
    private javafx.scene.control.TableView<Person> tab_ksiazka;
    @FXML
    public TableColumn<Person, String> tytul;

    @FXML
    public TableColumn<Person, String> autor;
    @FXML
    public TableColumn<Person, String> rok;
    @FXML
    public TableColumn<Person, String> gatunek;
    @FXML
    private ImageView regal;
    @FXML
    private Label ks_ta;
    @FXML
    private ComboBox<String> wybor_zwrot;
 

    @FXML
    private MenuItem ladujdane;
    @FXML
    private MenuItem czyscdane;
    @FXML
    private MenuItem rw;
    @FXML
    private MenuItem ru;
 
    /**
     * metoda umożliwia wykonanie dowolnej akcji przy modyfikacji kolekcji czyli w tym przypadku za dodanie do listy ksiazek danyhc wywolanych
     * w konstrukotrze person
     *zmienna spamrametryzowana(Person) to konstrukotor  klasy Person
     * @return zwraca listę książek
     */

    ObservableList<Person> getKsiazki() {
        ObservableList<Person> ksiazki = FXCollections.observableArrayList();
        ksiazki.add(new Person("John", "Doe","",""));
        return ksiazki;
    }

    int tm;
/**
     * metoda która wywołuje obiekty FXML-owe i może zmieniać ich stan. Metoda działa odrazu po uruchomieniu aplikacji
     * @param url Klasa URL reprezentuje jednolity lokalizator zasobów, wskaźnik do „zasobu” w sieci WWWZasób może być czymś tak prostym jak plik lub katalog albo może być odniesieniem do bardziej skomplikowanego obiektu, takiego jak zapytanie do bazy danych lub wyszukiwarki
     * @param rb  zawierają obiekty specyficzne dla ustawień regionalnych.Gdy Twój program potrzebuje zasobu specyficznego dla ustawień regionalnych, na przykład String, program może załadować go z pakietu zasobów odpowiedniego dla ustawień regionalnych bieżącego użytkownika
     
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /**
         * ustawia dla zmiennej dopasowaną szerokość
         */ 
        regal.setFitWidth(568.0);
          /**
         * zmienna.setVisible
          * ustawia dla zmiennej widoczność czyli czy jest widoczna czy nie
          */
        
         /**
         * zmienna.setDisable 
          * ustawia dla zmiennej dostępność czyli czy można ją kliknąć czy nie
          */
        wybor_zwrot.setVisible(false);
        menu_zwrot1.setDisable(true);
        tab_ksiazka.setVisible(false);
        wyl.setVisible(false);
        menu_zwrot.setDisable(true);
        tab.setVisible(true);
        tab.setVisible(true);
        ks_ta.setVisible(false);
        /**
         * zmienna.setCellValueFactory 
          * ustawia dla zmiennej  wartość właściwości cellValueFactory. w tych przypadkach ustawia tekst w komórkach
          */
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
          /**
         * zmienna.setStyle 
          * ustawia dla zmiennej  wartości stylów
          */
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


        pod_data_zwt.setStyle("-fx-text-fill: #dfdfdf; -fx-font-size: 14px; -fx-background-color:  #a80000");
        ;

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
        // ladujdane czyscdane rw ru
        ladujdane.setDisable(true);
        czyscdane.setDisable(true);
        rw.setDisable(true);
         ru.setDisable(true); 
    }
/**
    * metoda która inicjalizuje podstawowe obiekty dzięki ktorym będzie możliwe uruchomienie aplikacji
    * @throws Exception - wyjątek rzucajacy dowolny rodzaj wyjątku
    */

    public void clickAddUser() throws Exception {
/**
 * zmienna ktora pobiera zawartość pliku FXMLDocument.fxml
 */
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        /**
         * utworzenie obiektu klasy Parent która jest podstawą do wyswietlania dla wszystkuch pozostalch obiektów
         */
        Parent root = fxmlLoader.load();
        /**
         * zmienna inicjalizująca obiekt Stage
         */
        Stage stage = new Stage();
        /**
         * ustawienie do metody setScene zmiennej obiektu Stage(stage) obiektu typu Parent(root) zawierajaca obiekty w pliku FXMLDocument.fxml
         */ 
        stage.setScene(new Scene(root));
        /**
         * wyswietlenie zmiennej stage obiektu Stage
         */
        stage.show();
    }
/**
 * ta metoda nic nie robi
 * @throws SQLException - wyrzuca wyjątki obsługujące błędy SQL-owe
 */
    public void addUsers() throws SQLException {

    }

/**
 * metoda która pobiera niezbędne dane ktore są potrzebne aby poprawne połączyć się z odpowiednią bazą danych
 */
    public FXMLDocumentController() {
        /**
         * @see utils.connection
         */
        /**
         * zmienna która zawiera wynik działania metody conBD()
         */
        con = connection.conDB();
    }
/**
 * zmienne pomocnicze potrzebne przy pobieranou danych z bazy
 */
    int id_woj1 = 0;
    int id_woj2 = 0;
    int licznik_wierszy = 0, licznik_log = 0;
/**
 * metoda która wyświetla  formularz dzięki ktoremu mozliwe jest wypożyczenie książki
 * @param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wysświetlenie za pomocą kliku mysza formularza wypożyczenia książki
 */
    @FXML
    private void wypozycz1(ActionEvent event) {
        menu_zwrot1.setDisable(false);
        regal.setFitWidth(568.0);
        menu_zwrot.setDisable(false);
        rej.setDisable(true);
        tm = 0;
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
        
         ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);

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
/**
 * zmienna przechowująca wynik dzialania polecenia SQL-owego wyboru wszystkich rekordów z tabeli ksiazki
 */
        String ksiazka = "SELECT * FROM ksiazki;";
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(ksiazka);
/**
 * pobor danych z bazy i zapis do zmiennej
 */
            resultSet = preparedStatement.executeQuery();

/**
 * petla while która odczytuje kolejne rekordy z bazy
 */
            while (resultSet.next()) {
/**
 * zmienna która przechowuje zmnienną pobraną z bazy - tytuł książki
 */
                String nazwa = resultSet.getString("tytul");
                // list=FXCollections.observableArrayList(nazwa);
                /**
                 * dodanie do listy książek tytułu książki pobranego z bazy do zmiennej nazwa
                 */
                wybor.getItems().add(nazwa);
            }
        } catch (SQLException ex) {
/**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
            JOptionPane.showMessageDialog(null, "Nie można wyświetlić województwa!", "Uwaga", JOptionPane.WARNING_MESSAGE);

            // System.err.println(ex.getMessage());


        }
        zwrot_login.setVisible(false);
    }

    @FXML
    private void skw(ActionEvent event) {
    }

/**
 * metoda dzięki ktorej jest możliwe wyświetlenie formularza którego wypelnienie skutkue utworzeniem konta użytkownika
 * @param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wysświetlenie za pomocą kliku mysza formularza rejestracji konta
  
 */
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

        ladujdane.setDisable(true);
        czyscdane.setDisable(true);
        rw.setDisable(true);
         ru.setDisable(true);
        
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
/**
 * metoda dzięki której możliwe jest logowanie się użytkownika oraz wypożyczenie ksiażki (dodaniu do bazy) po poprzednim wypełneniu formularza wypożyczenia książki i kliknięciu w odpowiedni przycisk
 * @param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku obsługę procesu  wypożyczenia książki
   
 */

    @FXML
    private void log(ActionEvent event) {
        regal.setFitWidth(568.0);
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        wybor_zwrot.setVisible(false);
        if ("kifa".equals(logowanie.getText()) && ("haslo".equals(haslo_login.getText()))) {

            if ("kifa".equals(logowanie.getText()) && ("haslo".equals(haslo_login.getText()))) {
                String login1 = logowanie.getText();
                System.out.println(login1);
                if (tym == 0) {
                    witaj.setVisible(true);
                    log_po.setVisible(true);
                    tym = 1;
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
                /**
         * wyświetlenie informacji o zalogowanym użytkowniku
         */
                log_po1.setText("Jesteś zalogowany jako " + login1);
                logowanie.setVisible(false);
                haslo_login.setVisible(false);
                log.setVisible(false);

                utw_konta.setVisible(false);
                wypo_ks.setVisible(false);
                zwrot_ksiazki.setVisible(false);

                ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
                
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
                /**
                 * jeśli zmienna tm ==0
                 */
                if (tm == 0) {
                    /**
                     * inicjulizujemy zmienne pomocnicze potrzebne przy pobieranou danych z bazy
                     */
                    int id_woj1 = 0;
                    int id_woj2 = 0;
                    int licznik_wierszy = 0, licznik_log = 0;
                    /**
                     * przypisujemy pod zmienną b wybór uzytkownika z listy książek
                     */
                  //  String c = name_field1.getText().toString();
                    b = (String) wybor.getValue();
                    /**
                     * przypisujemy zmienną d wartość z pola pod_data_zwt
                     */
                    String d = pod_data_zwt.getText();
/**
 * przypisujemy pod zmienną myObj aktualną datę
 */
                    LocalDate myObj = LocalDate.now();
                    /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci w zalezności od pola kolumny login
                     */
                    String sql = "SELECT * FROM klienci WHERE login= ?;";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                    try {
                        /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                        preparedStatement = con.prepareStatement(sql);
                        /**
                         * podstawienie pod warunek polecenia SQL-owego (where) loginu zalogowanego użytkownika 
                         */
                        preparedStatement.setString(1, login1);
                        /**
 * pobor danych z bazy i zapis do zmiennej
 */
                        resultSet = preparedStatement.executeQuery();
                        /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                        while (resultSet.next()) {
                            /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                            int id_klienta = resultSet.getInt("id_klienta");
                            /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                            String login = resultSet.getString("login");
/**
 * instrukcja warunkowa jeśli login użytkownika nie jest równy loginowi pobranemu z bazy
 */
                            if (!login1.equals(login)) {
                                /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                                licznik_log++;
                            }/**
                             *  instrukcja warunkowa  jeśli login użytkownika jest równy loginowi pobranemu z bazy
                             */
                            
                            else 
                                /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_klienta czyli numer id klienta którego login to login zalogowanego użytkownika
                                 */
                                id_woj2 = id_klienta;
                            /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                            licznik_wierszy++;

                        }
                    } 
                    /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                    catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci w zalezności od pola kolumny tytul
                     */
                    String sql2 = "SELECT * FROM ksiazki where tytul= ? ;";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                    try {
                        /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                        preparedStatement = con.prepareStatement(sql2);
                         /**
                         * podstawienie pod warunek polecenia SQL-owego (where) tytułu książki wybranego przez użytkownika 
                         */
                        preparedStatement.setString(1, b);
                             /**
 * pobor danych z bazy i zapis do zmiennej
 */
                        resultSet = preparedStatement.executeQuery();
                        /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                        while (resultSet.next()) {
                             /**
 * zmienna która przechowuje zmnienną pobraną z bazy - id_ksiazki
 */
                            int id_gry = resultSet.getInt("id_ksiazki");
                              /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                            String nazwa_gry = resultSet.getString("tytul");
/**
 * przypisujemy pod zmienną pomocniczą wartość 1
 */
                            pom = 1;
                            /**
                             * instrukjca warunkowa jeśli wartość zmiennej b w której jest wybór książki z listy książek  dokonanego przez użytkownika jest równy pobranej wartosci książki z bazy
                             */

                            if (b.equals(nazwa_gry)) {
                                /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_gry czyli numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia 
                                 */
                                id_woj1 = id_gry;
                                /**
                                 * następną instrukcją jest przerwanie wykonujacej się pętli
                                 */
                               
                                break;
                            } 
                            /**
                             * instrukjca warunkowa jeśli wartość zmiennej b w której jest wybór książki z listy książek  dokonanego przez użytkownika niej est równy pobranej wartosci książki z bazy
                             */
                            else {
                                /**
                                 * przerwanie wykonujacej się pętli
                                 */
                                break;

                            }
                        }

                    } 
                    /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                    catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
/**
 * instrukcja warunkowa w której jeśli pod zmienną  id_woj1 (numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia jest inna wartośc niz 0
 * oraz jesli wartość zmiennej b (wybór uzytkownika z listy książek) jest różny nic brak wyboru
                     
 */
                    if (id_woj1 != 0 && !b.equals("")) 
                    /**
 * instrukcja warunkowa w której jeśli pod zmienną  id_woj1 (numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia jest inna wartośc niz 0
 * oraz jesli wartość zmiennej b (wybór uzytkownika z listy książek) jest różny nic brak wyboru
                     oraz jesli liczba wszystkich wierszy z tabeli klienci jest różna niż liczba pod którą są inkrementowane jeśli login jest różny niz login zalogowanego użytkownika
                     * oraz jeśli wartość zmiennej pom == 1 
 */
                    {
                        if (licznik_log != licznik_wierszy && id_woj1 != 0 && pom == 1 && !b.equals("")) {

                            /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli wypozyczenia informacje o wypożyczeniu czyli kto wybrał książkę jaką wybrał książkę czas rozpoczecia wypożyczcenia oraz czas zwrotu wypożyczonej książki
                     */
                            String sql1 = "INSERT INTO wypozyczenia VALUES (null,'" + id_woj2 + "','" + id_woj1 + "','" + myObj + "','" + d + "')";
                          /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                            try {
                                /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                                preparedStatement = con.prepareStatement(sql1);
                                /**
 *  dodanie danych do bazy
 */
                                preparedStatement.executeUpdate();
                                //wroc.setVisible(true);
                                /**
                                 * przypisanie do zmennej pomocniczej tym wartość 2
                                 */
                                tym = 2;
                                /**
                                 * W przypadku dodania wypozycenia do bazy wyświetlenie komunikatu o poprawnym dodaniu wypożyczenia
                                 */
                                        
                                JOptionPane.showMessageDialog(null, "Wypożyczyłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);
                               /**
                                * wyzerwanie zmiennej b przechowujacej ksiażkę wybraną przez użytkownika
                                */
                                b = "";
                                //System.out.println("b" + b);
                                /**
                                 * wyczyszczenie listy ksiażek
                                 */
                                wybor.getItems().clear();
                                /**
                                 * wyzerowamnie wartosci na zmiennej tesktowej przechowujacej datę zwrou
                                 */
                                pod_data_zwt.setText("");
                            } 
                            /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                            catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //////////////////////////////

/**
 * instrukcja warunkowa w której jeśli pod zmienną  id_woj1 (numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia jest  wartośc  0
 * oraz jesli wartość zmiennej b (wybór uzytkownika z listy książek) jest pusty
                     oraz jesli liczba wszystkich wierszy z tabeli klienci jest równa liczbie pod którą są inkrementowane jeśli login jest różny niz login zalogowanego użytkownika
                     * oraz jeśli wartość zmiennej pom != 1 
 */
                        } else {
                            wroc.setVisible(true);

                        }
                    }
                    /**
                     * instrukcja warunkowa w której wartość zmiennej b (wybór uzytkownika z listy książek) jest pusty
                     */
                    else if ((b.equals(""))) {
                        wroc.setVisible(true);
                        // witaj .setVisible(true);
                        //  log_po.setVisible(true);
                        System.out.println("Wybierz książkę");

                        //JOptionPane.showMessageDialog(null,"Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                    } //else {wroc.setVisible(true);}

                }
/**
 * instrukcja warunkowa jeśli tm ==1
 */

                if (tm == 1) {
                     /**
                     * inicjulizujemy zmienne pomocnicze potrzebne przy pobieranou danych z bazy
                     */
                    int id_woj1 = 0;
                    int id_woj2 = 0;
                    int licznik_wierszy = 0, licznik_log = 0;
                    //String c = name_field1.getText().toString();
                    /**
                     * przypisujemy pod zmienną b wybór uzytkownika z listy książek
                     */
                    b = (String) wybor.getValue();
                     /**
                     * przypisujemy zmienną d wartość z pola pod_data_zwt
                     */
                    String d = pod_data_zwt.getText();
/**
 * przypisujemy pod zmienną myObj aktualną datę
 */
                    LocalDate myObj = LocalDate.now();
                     /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci w zalezności od pola kolumny login
                     */
                    String sql = "SELECT * FROM klienci WHERE login= ?;";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                    try {
                         /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                        preparedStatement = con.prepareStatement(sql);
                        /**
                         * podstawienie pod warunek polecenia SQL-owego (where) loginu zalogowanego użytkownika 
                         */
                        preparedStatement.setString(1, login1);
                        /**
 * pobor danych z bazy i zapis do zmiennej
 */
                        resultSet = preparedStatement.executeQuery();
                        /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                        while (resultSet.next()) {
                            /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                            int id_klienta = resultSet.getInt("id_klienta");
                            /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                            String login = resultSet.getString("login");
/**
 * instrukcja warunkowa jeśli login użytkownika nie jest równy loginowi pobranemu z bazy
 */
                            if (!login1.equals(login)) {
                                /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                                licznik_log++;
                                /**
                             *  instrukcja warunkowa  jeśli login użytkownika jest równy loginowi pobranemu z bazy
                             */
                            } else 
                                /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_klienta czyli numer id klienta którego login to login zalogowanego użytkownika
                                 */
                                id_woj2 = id_klienta;
                            /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                            licznik_wierszy++;

                        }
                    }
                     /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                    catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór ksiażki z tabeli wypożczyczenia dzięki zastosowaniu mechanizmu inner join łączącą tę tabelę  z tabelą ksiazki. wybiera te ksiażkki ktorych id_woj2 to id zalogowanego aktialnie użytkownika
                     */
                    String sql2 = "select ksiazki.tytul from wypozyczenia inner join ksiazki on wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta='" + id_woj2 + "'";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                    try {
                        /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                        preparedStatement = con.prepareStatement(sql2);
                        /**
                         * podstawienie pod warunek polecenia SQL-owego (where) tytułu książki wybranego przez użytkownika 
                         */
                        preparedStatement.setString(1, b);
                        /**
 * pobor danych z bazy i zapis do zmiennej
 */
                        resultSet = preparedStatement.executeQuery();
                            /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                        while (resultSet.next()) {
                             /**
 * zmienna która przechowuje zmnienną pobraną z bazy - id_ksiazki
 */
                            int id_gry = resultSet.getInt("id_ksiazki");
                            /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                            String nazwa_gry = resultSet.getString("tytul");
/**
 * przypisujemy pod zmienną pomocniczą wartość 1
 */
                            pom = 1;
/**
                             * instrukjca warunkowa jeśli wartość zmiennej b w której jest wybór książki z listy książek  dokonanego przez użytkownika jest równy pobranej wartosci książki z bazy
                             */
                            if (b.equals(nazwa_gry)) {
                                /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_gry czyli numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia 
                                 */
                                id_woj1 = id_gry;
                                /**
                                 * następną instrukcją jest przerwanie wykonujacej się pętli
                                 */
                                break;
                            } 
                            /**
                             * instrukjca warunkowa jeśli wartość zmiennej b w której jest wybór książki z listy książek  dokonanego przez użytkownika nie  jest równy pobranej wartosci książki z bazy
                             */
                            else {
                                /**
                                 * przerwanie wykonujacej się pętli
                                 */
                                break;

                            }
                        }

                    } 
                    /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                    catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
/**
 * instrukcja warunkowa w której jeśli pod zmienną  id_woj1 (numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia jest inna wartośc niz 0
 * oraz jesli wartość zmiennej b (wybór uzytkownika z listy książek) jest różny nic brak wyboru
                     
 */
                    if (id_woj1 != 0 && !b.equals("")) {
                         /**
 * instrukcja warunkowa w której jeśli pod zmienną  id_woj1 (numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia jest inna wartośc niz 0
 * oraz jesli wartość zmiennej b (wybór uzytkownika z listy książek) jest różny nic brak wyboru
                     oraz jesli liczba wszystkich wierszy z tabeli klienci jest różna niż liczba pod którą są inkrementowane jeśli login jest różny niz login zalogowanego użytkownika
                     * oraz jeśli wartość zmiennej pom == 1 
 */
                        if (licznik_log != licznik_wierszy && id_woj1 != 0 && pom == 1 && !b.equals("")) {

                           /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli wypozyczenia informacje o wypożyczeniu czyli kto wybrał książkę jaką wybrał książkę czas rozpoczecia wypożyczcenia oraz czas zwrotu wypożyczonej książki
                     */
                            String sql1 = "INSERT INTO wypozyczenia VALUES (null,'" + id_woj2 + "','" + id_woj1 + "','" + myObj + "','" + d + "')";
                          /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                            try {
                                /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                                preparedStatement = con.prepareStatement(sql1);
                                /**
 *  dodanie danych do bazy
 */
                                preparedStatement.executeUpdate();
                                //wroc.setVisible(true);
                                /**
                                 * przypisanie do zmennej pomocniczej tym wartość 2
                                 */
                                tym = 2;
                                /**
                                 * W przypadku dodania wypozycenia do bazy wyświetlenie komunikatu o poprawnym dodaniu wypożyczenia
                                 */
                             
                                JOptionPane.showMessageDialog(null, "Wypożyczyłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);
                                /**
                                * wyzerwanie zmiennej b przechowujacej ksiażkę wybraną przez użytkownika
                                */
                                b = "";
                                System.out.println("b" + b);
                                /**
                                 * wyczyszczenie listy ksiażek
                                 */
                                wybor.getItems().clear();
                            } 
                            /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                            catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            //////////////////////////////


///////////////////////////////////
                        } else {
                            wroc.setVisible(true);

                        }
                    } 
                    /**
                     * instrukcja warunkowa w której wartość zmiennej b (wybór uzytkownika z listy książek) jest pusty
                     */
                    else if ((b.equals(""))) {
                        wroc.setVisible(true);
                        // witaj .setVisible(true);
                        //  log_po.setVisible(true);
                        System.out.println("Wybierz książkę");

                        //JOptionPane.showMessageDialog(null,"Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                    } //else {wroc.setVisible(true);}

                }


            }
        } 
        /**
         * instrukcja warunkowa jeśli nie powiodlo się logowanie i wyświetlające odpowiedni komunikat
         */
        else {
            JOptionPane.showMessageDialog(null, "Nieprawidłowy login i/lub hasło!", "Uwaga", JOptionPane.WARNING_MESSAGE);
        }


    }

/**
 * metoda która umożliwia wyswietlenie formularza dzięki któremu można zwrocić wypozyczonną ksiażke
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wysświetlenie za pomocą kliku mysza formularza zwrócenia książki  
 */
    @FXML
    private void zwrot(ActionEvent event) {
        wybor_zwrot.getItems().clear();
        menu_zwrot1.setDisable(false);
        menu_zwrot.setDisable(false);
        regal.setFitWidth(568.0);
        ks_ta.setVisible(false);
        
        ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        
        log_po1.setVisible(false);
        zwrot_ksiazki.setVisible(false);
        rej.setDisable(true);
        wybor_zwrot.setVisible(true);
        name_field.setVisible(false);
        name_field1.setVisible(false);
        tm = 1;
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
        /**
         * wyświetlenie informacji o zalogowanym użytkowniku
         */
        log_po1.setText("Jesteś zalogowany jako " + logowanie.getText());/**
                     * inicjulizujemy zmienne pomocnicze potrzebne przy pobieranou danych z bazy
                     */
        id_woj1 = 0;
        id_woj2 = 0;
        licznik_wierszy = 0;
        licznik_log = 0;
/**
 * przypisanie do zmiennej pola tekstowego ktróy przchowuje login zalgogowanogo uzytkownika 
 */
        String login1 = logowanie.getText();
        System.out.print("LOG" + login1);
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci w zalezności od pola kolumny login
                     */
        String sql = "SELECT * FROM klienci WHERE login= ?;";
        /**
         * utworzenie tablicy typu String o rozmiarze 10
         */
        String uzy[] = new String[10];
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql);
             /**
                         * podstawienie pod warunek polecenia SQL-owego (where) loginu zalogowanego użytkownika 
                         */
            preparedStatement.setString(1, login1);
            /**
 * pobor danych z bazy i zapis do zmiennej
 */
            resultSet = preparedStatement.executeQuery();
/**
 * petla while która odczytuje kolejne rekordy z bazy
 */
            while (resultSet.next()) {
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                int id_klienta = resultSet.getInt("id_klienta");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                String login = resultSet.getString("login");
/**
 * instrukcja warunkowa jeśli login użytkownika nie jest równy loginowi pobranemu z bazy
 */
                if (!login1.equals(login)) {
                    /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                    licznik_log++;
                } 
                /**
                             *  instrukcja warunkowa  jeśli login użytkownika jest równy loginowi pobranemu z bazy
                             */
                else
                    /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_klienta czyli numer id klienta którego login to login zalogowanego użytkownika
                                 */
                    id_woj2 = id_klienta;
                /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                licznik_wierszy++;

            }

        }/**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
/**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór ksiażki z tabeli wypożczyczenia dzięki zastosowaniu mechanizmu inner join łączącą tę tabelę  z tabelą ksiazki. wybiera te ksiażkki ktorych id_woj2 to id zalogowanego aktialnie użytkownika
                     */
        String ksiazka = "SELECT ksiazki.tytul FROM wypozyczenia INNER JOIN ksiazki ON wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta=" + id_woj2 + ";";
      /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try { /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(ksiazka);
             /**
 * pobor danych z bazy i zapis do zmiennej
 */

            resultSet = preparedStatement.executeQuery();

            System.out.print("wwww " + id_woj2);
 /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
            while (resultSet.next()) {
/**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                String nazwa = resultSet.getString("tytul");
                // list=FXCollections.observableArrayList(nazwa);
                /**
                 * dodanie do listy ksiazek ksiażki która wypożyczył użytkownik
                 */
                wybor_zwrot.getItems().add(nazwa);
            }
        } 
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Uwaga", JOptionPane.WARNING_MESSAGE);

            // System.err.println(ex.getMessage());


        }


    }
/**
 * wyzerownie zmiennych pomocniczych
 */
    int tym = 0;
    int pom = 0;
    /**
                                * wyzerwanie zmiennej b przechowujacej ksiażkę wybraną przez użytkownika
                                */
     String b = "";
     /**
      * zmienna typu String która będzie przechowywać książkę aktualnie wybraną przez użytownika
      */
    String bz = "";
/**
 * metoda która umozliwia wylogowanie się użytkownika z aplikacji
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wylogowanie się za pomocą myszy
   
 */
    @FXML
    private void wyloguj(ActionEvent event) {
        regal.setFitWidth(568.0);
        logowanie.setVisible(true);
        wybor_zwrot.setVisible(false);
        ks_ta.setVisible(false);
        log_po1.setVisible(false);
        
        ladujdane.setDisable(true);
        czyscdane.setDisable(true);
        rw.setDisable(true);
         ru.setDisable(true);
         
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
        /**
                                * wyzerwanie zmiennej b przechowujacej ksiażkę wybraną przez użytkownika
                                */
        b = "";


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
        tym = 0;
    }
/**
 * inicjalizacja zmiennej obiektu Connection która pobiera niezbędne dane ktore są potrzebne aby poprawne połączyć się z odpowiednią bazą danych
 */
    Connection con = null;
    /**
     * inicjalizacja zmiennej obiektu PreparedStatement który przygotowuje i wysyla polecenia SQL-we do bazy 
    */
    PreparedStatement preparedStatement = null;
    /**
    
 * inicjalizacja zmiennej obiektu ResultSet odpiwiedzialny z pobor danych z bazy i zapisuje do tej zmiennej

     */
    ResultSet resultSet = null;


    /////
/**
 * metoda która wyświetla formularz logowania się 
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wysświetlenie za pomocą kliku mysza formularza logowania się
    
 */
    @FXML
    private void log1(ActionEvent event) {
        regal.setFitWidth(568.0);
        witaj.setVisible(false);
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
        
         ladujdane.setDisable(true);
        czyscdane.setDisable(true);
        rw.setDisable(true);
         ru.setDisable(true);

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


        //String dest = "E:\\pdfy\\addingTable.pdf";

    }
/**
 * metoda dzięki której możliwe jest wyczyszczenie niektorych pól tekstowych z tesktu
 *@param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wyczyszczenie za pomocą kliku mysza odpowiednuch pól tesktowych
    
 */
    @FXML
    private void wyczysc(ActionEvent event) {
        regal.setFitWidth(568.0);
/**
 * zmienna.setText ustawia pusty tekst na tej zmiennej
 */
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

        password_field.setText("");
        ;


        zwrot_ksiazka.setText("");
        zwrot_login.setText("");
    }
    
    /**
     * metoda ktora odpowiada za skasowanie/wyczyszczenie danych z tabel klienci ksiazki i wypozyczenia
     * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wyczyszczenie  danych z tabel za pomocą kliku myszy
    
     */

    @FXML
    private void czysc(ActionEvent event) {
        regal.setFitWidth(568.0);
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        
         ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        
        log_po1.setVisible(false);
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli usuniecie danych z tabeli klienci 
                     */
        String sql = "TRUNCATE TABLE klienci";
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli usuniecie danych z tabeli ksiazki 
                     */
        String sql1 = "TRUNCATE TABLE ksiazki";
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli usuniecie danych z tabeli wypozyczenia 
                     */
        String sql2 = "TRUNCATE TABLE wypozyczenia";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższe polecenia SQL-owe 
         */
        try {
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql);
            /**
             * usuniecie danych z tabeli klienci
             */
            preparedStatement.executeUpdate();
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql1);
            /**
             * usuniecie danych z tabeli ksiazki
             */
            preparedStatement.executeUpdate();
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql2);
            /**
             * usuniecie danych z tabeli wypoczyzenia
             */
            preparedStatement.executeUpdate();

        }  /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * metoda która odpowiada za ładowanie/dodawanie do bazy przykładowych danych czyli do tabel klienci, ksiazki oraz wypozyczenia dodaje rekordy z danymi
 *@param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku dodanie  danych do tabel za pomocą kliku myszy
     
 */
    @FXML
    private void lad(ActionEvent event) {
        tab_ksiazka.setVisible(false);
        ks_ta.setVisible(false);
        
        ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        
        regal.setFitWidth(568.0);
        log_po1.setVisible(false);
       /**
        * zmienna pod którą jest wynik polecenia SQL-owego w tym przypadku kodowanie polskich znaków w bazie
        */
     
        String pol = ""
                + "SET NAMES 'utf8' COLLATE 'utf8_polish_ci'";
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {/**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(pol);
            /**
             * kodowanie polskich znaków
             */
            preparedStatement.executeUpdate();


        } 
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            /**Uworzenie obiektu FileReader  która pozwala programiście na tekstowy dostęp do pliku znak po znaku    który w tym przypadku to plik wymagania.sql
             * 
             */
            FileReader fileReader = new FileReader("C:\\Users\\Kamil\\Desktop\\programowanie\\programowanie zespołowe\\biblioteka\\Dokumentacja\\wymagania.sql");

           /** Utworzenie obiektu bufferReader która pozwala na dostęp do pliku linijka po linijce   który w tym przypadku to plik wymagania.sql
            * 
            */
            BufferedReader bufferReader = new BufferedReader(fileReader);
/**
 * utworzenie zmiennej typu String
 */
            String linia;
/**
 * pętla która się wykonuje dopóki nie dodarto  do końca pliku i do momentu gdzie to odczytania są jeszcze linie
 */
            while ((linia = bufferReader.readLine()) != null) {

/**
 * przypisane do zmiennej tablicowej typu String (tmpTStr) wyninków działania  metody split czyli zapisuje  jako odzdielne wartości obieky które są oddzielone znakime \\r?\\n
 */
                String[] tmpTStr = linia.split(("\\r?\\n"));
                System.out.println(linia);
                /**
                 * pętla for która działą az przejdzie przez wszysktie wartości umieszczone w tablicy tmpTStr
                 */
                
                for (int j = 0; j < tmpTStr.length; j++) {
                    /**
                     * 
                     przypisane do zmiennej tablicowej typu String (tmpTStr1) wyninków działania  metody split czyli zapisuje  jako odzdielne wartości obieky które są oddzielone znakime ","
 */
                    String[] tmpTStr1 = linia.split(",");
                    /**
                 * pętla for która działą az przejdzie przez wszysktie wartości umieszczone w tablicy tmpTStr1
                 */
                    for (int i = 0; i < tmpTStr1.length; i++) {
                        System.out.println(tmpTStr1[i]);

                    } //if(!login1.equals(login))
                    /**
                     * instrukcja warunkowa która się wykona jesli pierwszy element tablicy tmpTStr jest różny od znaku "_" oraz jesli pierwszy element tablicy tmpTStr jest różny od znaku "." oraz jesli pierwszy element tablicy tmpTStr1 jest równy  ciągwi znaków "kl"
                     */
                    if ((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("kl"))) {
                        /**
                         * * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli klienci odpowieduch danych których wartości pochodzą z odpowiednch elementów tablicy tmpTStr1
                     */
                         
                       
                        String sql5 = "INSERT INTO klienci VALUES (NULL, '" + tmpTStr1[1] + "', '" + tmpTStr1[2] + "', '" + tmpTStr1[3] + "', '" + tmpTStr1[4] + "', '" + tmpTStr1[5] + "');";
                        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                        try {
                             /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                            preparedStatement = con.prepareStatement(sql5);
                            /**
                             * dodanie danych do bazy
                             */
                            preparedStatement.executeUpdate();


                        } 
                         /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                        catch (SQLException ex) {
                            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        /**
                     * instrukcja warunkowa która się wykona jesli pierwszy element tablicy tmpTStr jest różny od znaku "_" oraz jesli pierwszy element tablicy tmpTStr jest różny od znaku "." oraz jesli pierwszy element tablicy tmpTStr1 jest równy  ciągwi znaków "kw"
                     */
                    } else if ((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("kw"))) {

 /**
                         * * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli ksiazki odpowieduch danych których wartości pochodzą z odpowiednch elementów tablicy tmpTStr1
                     */
                        String sql5 = "INSERT INTO ksiazki VALUES (NULL, '" + tmpTStr1[1] + "', '" + tmpTStr1[2] + "', '" + tmpTStr1[3] + "', '" + tmpTStr1[4] + "');";
                      /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                        try {/**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                            preparedStatement = con.prepareStatement(pol);
                            /**
                             * dodanie danych do bazy
                             */
                            preparedStatement.executeUpdate();
                            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                            preparedStatement = con.prepareStatement(sql5);
                            /**
                             * dodanie danych do bazy
                             */
                            preparedStatement.executeUpdate();


                        } 
                         /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                        catch (SQLException ex) {
                            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                    /**
                     * instrukcja warunkowa która się wykona jesli pierwszy element tablicy tmpTStr jest różny od znaku "_" oraz jesli pierwszy element tablicy tmpTStr jest różny od znaku "." oraz jesli pierwszy element tablicy tmpTStr1 jest równy  ciągwi znaków "w"
                     */
                    else if ((!tmpTStr[0].equals("_")) && (!tmpTStr[0].equals(".")) && (tmpTStr1[0].equals("w"))) {
                      /**
                         * * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli wypozyczenia odpowieduch danych których wartości pochodzą z odpowiednch elementów tablicy tmpTStr1
                     */

                        String sql5 = "INSERT INTO wypozyczenia VALUES (NULL, '" + tmpTStr1[1] + "', '" + tmpTStr1[2] + "', '" + tmpTStr1[3] + "', '" + tmpTStr1[4] + "');";
                       
                        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                        try {
                            
                            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                            preparedStatement = con.prepareStatement(sql5);
                              /**
                             * dodanie danych do bazy
                             */
                            preparedStatement.executeUpdate();


                        }
                         /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                        catch (SQLException ex) {
                            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
                System.out.println(linia);
            }
            /**zamkniecie dostepu do pliku i zwolenienie zasobów
             * 
             */
            fileReader.close();
        } 
        /**obsługa wyjątku jesli nie znaleziono takiego pliku
         * 
         */
        catch (FileNotFoundException e) {
            /**wypisanie stosu wywolań
             * 
             */
            e.printStackTrace();
        }
        /**
         * obsługa wyjątku w przypadku niemożności odczytania zawartosci pliku
         */
        catch (IOException e) {
            /**wypisanie stosu wywolań
             * 
             */
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
    /**
     * metoda odpowiada za dodanie do bazy a konktrenie do tabeli klienci danych użytkownika uprzednio wypełniając formularz
     * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku dodanie  danych do tabeli za pomocą kliku myszy
    
     */
    @FXML
    private void zal_konto(ActionEvent event) {
        regal.setFitWidth(568.0);
        
         ladujdane.setDisable(true);
        czyscdane.setDisable(true);
        rw.setDisable(true);
         ru.setDisable(true);
        /**
         * inicjalizacja zmiennych pomocniczych potrzebnych przy sprawddzaniu czy login jest już w użyciu czy nie. Porzebne przy dodawaniu konta do bazy
         */
        int licznik_wierszy = 0, licznik_log = 0;
        tab_ksiazka.setVisible(false);
        log_po1.setVisible(false);
        /**
         * przypisanie do zmiennej zawartość pola tesktowego w tym przypadku imienia
         */
        String imie = name_field.getText();
        ks_ta.setVisible(false);
        /**
         * przypisanie do zmiennej zawartość pola tesktowego w tym przypadku nazwiska
         */
        String nazwisko = surname_field.getText();
        /**
         * przypisanie do zmiennej zawartość pola tesktowego w tym przypadku loginu
         */
        String d = login_field.getText();
        wybor_zwrot.setVisible(false);
        /**
         * przypisanie do zmiennej zawartość pola tesktowego w tym przypadku hasła
         */
        String haslo = password_field.getText();
        /**
         * inicjalizacja zmiennej typu Integer potrzbna przy walidacji pola tekstowego numer telefonu
         */
        Integer number = -1;
        byte num[] = new byte[9];
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci 
                     */
        String sql = "SELECT * FROM klienci;";
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
 /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */

            preparedStatement = con.prepareStatement(sql);
            //preparedStatement.setString(1,login1);
            /**
 * pobor danych z bazy i zapis do zmiennej
 */
            
            resultSet = preparedStatement.executeQuery();
            /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
            while (resultSet.next()) {
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                int id_klienta = resultSet.getInt("id_klienta");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                String login = resultSet.getString("login");
/**
 * instrukcja warunkowa jeśli login użytkownika nie jest równy loginowi pobranemu z bazy
 */
                if (!d.equals(login)) {
                    /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                    licznik_log++;
                }
                /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                licznik_wierszy++;


            }
        } 
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
         * instrukcja warunkowa która się wykona jeśli jakkakolwiek wartość zmennych wystepujacych w instrukcji warunkowej jest pusta
         */
        if ("".equals(imie) || "".equals(nazwisko) || "".equals(d) || "".equals(haslo) || "".equals(number))
            /**
             * wyświetlenie odpowiedniej informacji czyli brak wszystkich danych w formularzu
             */
            JOptionPane.showMessageDialog(null, "Brak wszystkich danych!", "Uwaga", JOptionPane.WARNING_MESSAGE);
        /**
         * instrukcja warunkowa która się wykona jeśli  wartość wszystkich zmennych wystepujacych w instrukcji warunkowej nie jest pusta
         */
        else {
            /**
             * blok try-catch sprawdzajact poprawny format/typ pola tekstowego numer telefonu
             */

            try {
                /**
                 * przypisanie do zmiennej zawartośći pola tekstowego numer telefonu
                 */
                number = Integer.parseInt(number_field.getText());

            } 
            /**\
             * obsługa wyjątku jesli zawartość pola tekstowego nie jest liczbą
             */
            catch (NumberFormatException ex) {

/**
 * wyświetlenie odpowiedniej informacji w bloku catch jesli zawartość pola tekstowego nie jest liczbą
 */
                JOptionPane.showMessageDialog(null, "Nieprawidłowy numer telefonu!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                number_field.setText("");
            }
/**
 * instrukcja warunkowa która sie wykona jesli wartoć zmiennej number jest nie mniejsz niż zero
 */
            if (number >= 0) {
                /**
                 * instrukcja warunkowa która sie wykona jesli liczba wszystkich rekordów z tabeli klienci jest równa rekordom tabeli których wartość to liczba nie tych samych loginów 
                 */
                if (licznik_wierszy == licznik_log) {
                    /**
                         * * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli dodanie do tabeli klienci odpowieduch danych których wartości pochodzą ze zmienncyhh podanych w polach formularza rejestracji konta
                     */
                    String sql1 = "INSERT INTO klienci VALUES (null,'" + imie + "','" + nazwisko + "','" + d + "','" + haslo + "','" + number + "')";
                  /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                    try {
                           /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                        preparedStatement = con.prepareStatement(sql1);
                          /**
                             * dodanie danych do bazy
                             */
                        preparedStatement.executeUpdate();
/**
 * wyczyszczenie pól tekstowych z tekstu
 */
                        name_field.setText("");

                        surname_field.setText("");
                        login_field.setText("");
                        password_field.setText("");
                        number_field.setText("");
                        login_field.setText("");
                        wroc.setVisible(false);
                        /**
                         * wyswietlenie informacji o poprawnym założeniu konta
                         */
                        JOptionPane.showMessageDialog(null, "Konto założone poprawnie!", "Brawo!", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                    catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                /**
                 * insrtukcjia warunkowa która się wykona jeśli liczba wszystkich rekordów w tabeli klienci jest różna od wartości liczonych rekordów sprawdzjącyh liczbe różńych loginów. W tym przypadku login się powtarza i nie zwiekszono licznik_log o 1
                 */
                else {
                    /**
                     * wyświetenie odpowiedniej informaji w przypadku gdy login jest w uzyciu
                     */
                   
                    JOptionPane.showMessageDialog(null, "Ten login jest już zajęty!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                    
                    /**
                     * wyczyszczenie pola teksotwego loginu z tekstu
                     */
                    login_field.setText("");
                }

            }
        }


    }
/**
 * metoda która umożliwia wyświetlenie tabeli książek wystepujacych w bazie  za pomocą tabeli
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wyświetlenie tabeli za pomocą kliku myszą
     
 */
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
         /**
     * metoda umożliwia wykonanie dowolnej akcji przy modyfikacji kolekcji czyli w tym przypadku za dodanie do listy ksiazek danyhc wywolanych
     * w konstrukotrze person
     * zmienna spamrametryzowana(Person) to konstrukotor  klasy Person
     * 
     */
         
        ObservableList<Person> data = FXCollections.observableArrayList();
        /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli ksiazki
                     */
        String sql1 = "select * from ksiazki";
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {  /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql1);
            /**
 * pobor danych z bazy i zapis do zmiennej
 */
            resultSet = preparedStatement.executeQuery();
/**
 * petla while która odczytuje kolejne rekordy z bazy
 */

            while (resultSet.next()) {
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                int id_gry = resultSet.getInt("id_ksiazki");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                String nazwa = resultSet.getString("tytul");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  autor
 */
                String rok_wydania = resultSet.getString("autor");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  rok_wydania
 */
                String gatunek = resultSet.getString("rok_wydania");
                /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  gatunek
 */
                String producent = resultSet.getString("gatunek");
/**
 * dodanie danych za pomocą wyżej zmiennych za pomocą konstrukotra klasy Person do o listy ksiazek 
 */
                data.add(new Person(producent, nazwa, rok_wydania, gatunek));
            }

        }
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
/**
 * określenie dla kolumny minimalnej szerokości
 */
        tytul.setMinWidth(94);
        /**
         * zmienna.setCellValueFactory 
          * ustawia dla zmiennej  wartość właściwości PropertyValueFactory. w tych przypadkach ustawia tekst w komórkach oraz jakie obiekty mają w w nim sie znajdowac oraz jakiego typu
         */
        tytul.setCellValueFactory(new PropertyValueFactory<Person, String>("isActiveCol") {
            /**
             * metoda która pozwala na dodanie z listy ksiazek dodanie do tej kolumny konkretnej wartosci w typ przypadku tytulu ksiażki
             * @param param okresla typ oraz jakie obiekty mają w w nim sie znajdowac 
             * @return zwraca zawartośc kolumny
             */
           
            @Override      
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
                return new ReadOnlyObjectWrapper(param.getValue().getLastName());
            }
        });
        /**
 * określenie dla kolumny minimalnej szerokości
 */
        autor.setMinWidth(94);
        /**
         * zmienna.setCellValueFactory 
          * ustawia dla zmiennej  wartość właściwości PropertyValueFactory. w tych przypadkach ustawia tekst w komórkach oraz jakie obiekty mają w w nim sie znajdowac oraz jakiego typu
         */
        autor.setCellValueFactory(new PropertyValueFactory<Person, String>("userNameCol") {
            
             /**
             * metoda która pozwala na dodanie z listy ksiazek dodanie do tej kolumny konkretnej wartosci w tym przypadku autora ksiażki
             * @param param okresla typ oraz jakie obiekty mają w w nim sie znajdowac 
             * @return zwraca zawartośc kolumny
             */
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
                return new ReadOnlyObjectWrapper(param.getValue().getRok());
            }
        });
         /**
 * określenie dla kolumny minimalnej szerokości
 */
        rok.setMinWidth(94);
        /**
         * zmienna.setCellValueFactory 
          * ustawia dla zmiennej  wartość właściwości PropertyValueFactory. w tych przypadkach ustawia tekst w komórkach oraz jakie obiekty mają w w nim sie znajdowac oraz jakiego typu
         */
        rok.setCellValueFactory(new PropertyValueFactory<Person, String>("taskCol") {
             /**
             * metoda która pozwala na dodanie z listy ksiazek dodanie do tej kolumny konkretnej wartosci w tym przypadku rok wydania ksiażki
             * @param param okresla typ oraz jakie obiekty mają w w nim sie znajdowac 
             * @return zwraca zawartośc kolumny
             */
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
                return new ReadOnlyObjectWrapper(param.getValue().getgat());
            }
        });
           /**
 * określenie dla kolumny minimalnej szerokości
 */
        gatunek.setMinWidth(94);
        /**
         * zmienna.setCellValueFactory 
          * ustawia dla zmiennej  wartość właściwości PropertyValueFactory. w tych przypadkach ustawia tekst w komórkach oraz jakie obiekty mają w w nim sie znajdowac oraz jakiego typu
         */
        gatunek.setCellValueFactory(new PropertyValueFactory<Person, String>("firstNameCol") {
             /**
             * metoda która pozwala na dodanie z listy ksiazek dodanie do tej kolumny konkretnej wartosci w typ przypadku gatunku ksiażki
             * @param param okresla typ oraz jakie obiekty mają w w nim sie znajdowac 
             * @return zwraca zawartośc kolumny
             */
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> param) {
                return new ReadOnlyObjectWrapper(param.getValue().getFirstName());
            }
        });
        /**
         * dodanie do tabeli zawartosci list ksiażek w odpowiednich kolumnach
         */
        tab_ksiazka.setItems(data);


        //Person ks=new Person();
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
  */
    }
/**
 * ta metoda umozliwia zwrot książki wypożyczonej przez zalogowanego użytkwnika po uprzednim wypełnieniu formulalrza
  @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku usunięcie danych z bazy za pomocą kliku myszą w przycisk
     
 */
    @FXML
    private void zwrot1ks11(ActionEvent event) {

  ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        System.out.print(id_woj1 + " " + id_woj2 + " " + licznik_wierszy + " " + licznik_log + " ");
        /**
         * podstawienie pod zmienną, wyboru książki którą wybrał użytkownik z listy ksiazek
         */
        bz = (String) wybor_zwrot.getValue();
       /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow z tabeli ksiazki jeśli tytul jest rowny wyborowi z listy książek dokonanego przez użytkownika
                     */
        String sql2 = "SELECT * FROM ksiazki where tytul= ? ;";
        System.out.print("Ksiazka " + bz);
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
            /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql2);
           /**
                         * podstawienie pod warunek polecenia SQL-owego (where) tytułu książki wybranego przez użytkownika 
                         */
            preparedStatement.setString(1, bz);
             /**
 * pobor danych z bazy i zapis do zmiennej
 */
            resultSet = preparedStatement.executeQuery();
            /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
            while (resultSet.next()) {
                 /**
 * zmienna która przechowuje zmnienną pobraną z bazy - id_ksiazki
 */
                int id_gry = resultSet.getInt("id_ksiazki");
                  /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                String nazwa_gry = resultSet.getString("tytul");
/**
 * przypisujemy pod zmienną pomocniczą wartość 1
 */
                pom = 1;
/**
 * instrukcja warunkowa ktora się wykona jeśli wartość zmiennej bz która jest wyobrem książki przez użytkownika z listy książke jest równa aktualnie zwrocenomu rekordowi z bazy w tym przypadku tytułu ksiażki 
 */
                if (bz.equals(nazwa_gry)) {
                    /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_gry czyli numer id książki którego tytuł to tytuł książki wybranej przez użytkownikia 
                                 */
                    id_woj1 = id_gry;
                    /**
                                 * następną instrukcją jest przerwanie wykonujacej się pętli
                                 */
                    break;
                } 
                 /**
                             * instrukjca warunkowa jeśli wartość zmiennej bz w której jest wybór książki z listy książek  dokonanego przez użytkownika nie  jest równy pobranej wartosci książki z bazy
                             */
                else {
                    /**
                                 * przerwanie wykonujacej się pętli
                                 */
                    break;

                }
            }

        } 
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
         * instrukcja warunkowa wykona się jeżei wartość zmiennej pomcniczej jest równa 1
         */
        if (pom == 1) {
            
             /**
         * instrukcja warunkowa wykona się jeżei wartość zmiennej pomcniczej jest równa 1
         */
            if (pom == 1) {

                ///  String
/**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli usunięcie z tabeli wypoczyzenia rekordu gdzie id_klienta jest id klienta aktualnie zalogowanego a id_ksiazki jest id książki wybranej z listy przez zalogowanego użytownika
                     */
                String sql1 = "delete from wypozyczenia where id_klienta=" + id_woj2 + " and id_ksiazki=" + id_woj1 + "";
                /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                try {
                    /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                    preparedStatement = con.prepareStatement(sql1);
                    /**
                     * usuniecie z bazy rekordu
                     */
                    preparedStatement.executeUpdate();
                    //wroc.setVisible(true);
                    tym = 2;
                    /**
                     * wyświtelenie odpowiedniego komunikatu po zwróceniu książki
                     */
                    JOptionPane.showMessageDialog(null, "Zwróciłeś książkę!", "Brawo", JOptionPane.INFORMATION_MESSAGE);


                } 
                 /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Nieprawidłowy login!", "Uwaga", JOptionPane.WARNING_MESSAGE);
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
                /**
                 * wyzerowanie wszystkich zmiennych pomocniczych
                 */
                id_woj1 = 0;
                id_woj2 = 0;
                licznik_wierszy = 0;
                licznik_log = 0;
                /**
                 * wyczyszczenie listy ksiażek
                 */
                wybor_zwrot.getItems().clear();

                String login1 = logowanie.getText();
                System.out.print("LOG" + login1);
                /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci jeśli login jest rowny loginowi zalogowanego  użytkownika
                     */
                String sql = "SELECT * FROM klienci WHERE login= ?;";
/**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                try {
                    /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                    preparedStatement = con.prepareStatement(sql);
                    
                        /**
                         * podstawienie pod warunek polecenia SQL-owego (where) loginu zalogowanego użytkownika 
                         */
                    preparedStatement.setString(1, login1);
                 /**
 * pobor danych z bazy i zapis do zmiennej
 */
                    resultSet = preparedStatement.executeQuery();
                    /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                    while (resultSet.next()) {
                        /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                        int id_klienta = resultSet.getInt("id_klienta");
                                           /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                        String login = resultSet.getString("login");
/**
 * instrukcja warunkowa jeśli login użytkownika nie jest równy loginowi pobranemu z bazy
 */
    
                        if (!login1.equals(login)) {
                            /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                            licznik_log++;
                        } 
                        /**
                             *  instrukcja warunkowa  jeśli login użytkownika jest równy loginowi pobranemu z bazy
                             */
                        else 
                            /**
                                 * przypisujemy do zmiennej pomocniczej zmienną id_klienta czyli numer id klienta którego login to login zalogowanego użytkownika
                                 */
                            id_woj2 = id_klienta;
                        /**
                                 * zwiększamy zmienną pomocniczą o 1
                                */
                        licznik_wierszy++;

                    }
                } 
                /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                catch (SQLException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }

/**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór tytułów książek gdzie jako warunek jest id klienta aktualnie zalogowanego użytkownika. Są to książki aktualnie zalogowanego użytkownika
                     */
                String ksiazka = "SELECT ksiazki.tytul FROM wypozyczenia INNER JOIN ksiazki ON wypozyczenia.id_ksiazki=ksiazki.id_ksiazki where id_klienta=" + id_woj2 + ";";
               /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
                try {
                       /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                    preparedStatement = con.prepareStatement(ksiazka);
 /**
 * pobor danych z bazy i zapis do zmiennej
 */
                    resultSet = preparedStatement.executeQuery();

                    System.out.print("wwww " + id_woj2);
/**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                    while (resultSet.next()) {
                     /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                        String nazwa = resultSet.getString("tytul");
                        // list=FXCollections.observableArrayList(nazwa);
                        /**
                         * dodanie do listy ksiażek tytułu ksiażki podanych w zmiennej nazwa (wyżej). Są do książki aktualnie zalogowanego użytkownika
                         */
                        wybor_zwrot.getItems().add(nazwa);
                    }
                } 
                /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
                catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex, "Uwaga", JOptionPane.WARNING_MESSAGE);

                    // System.err.println(ex.getMessage());


                }


                //////////////////////////////


///////////////////////////////////
            } /**
             * instrukcja warunkowa jeśli zmienna pomocnicza jest różna do 1
             */
                    else {
                System.out.print("if1");

            }
        }
        /**
             * instrukcja warunkowa jeśli zmienna pomocnicza jest różna do 1
             */
        else {
            System.out.print("if2");

        }


    }
/**
 * metoda odpowiedzialna za wygenerowanie raportu w formacie PDF w którym są umieszczone dane użytkowników
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wygenerowanie raportu za pomocą kliku myszą
    
 * @throws FileNotFoundException wyrzuca wyjątek w przypadku gdy nie można zlokalizowac pliku
 * @throws JRException  wyjątek wyrzucany w przypadku niepowodznia dzialania biblioteki JasperReports
 */
    @FXML
    public void pdf_uz(ActionEvent event) throws FileNotFoundException, JRException {
        
        ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        
        /**
         *  utworzenie obiektu listy tablicowej
         */
        List<Klient> klientList = new ArrayList<>();
        /**
         * utworzenie obiektu typu KlientRaport() potrzebego do wygenerowania raportu
         */
        KlientRaport klientRaport = new KlientRaport();
 /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli klienci
                     */
        String sql = "SELECT * FROM klienci;";
        
        System.out.println(connection.conDB());
        /**
         * utworzenie tablicy typu String potrzebnej do przechowywania obiektów pobranch z bazy
         */
        String uzy[] = new String[10];
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
                 /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
                  
            preparedStatement = con.prepareStatement(sql);
//              preparedStatement.setString(1,login1);
  /**
 * pobor danych z bazy i zapis do zmiennej
 */
            resultSet = preparedStatement.executeQuery();
            /** 
             * pętla for ktora działa 10 razy slużąca do zapisnia do tablicy Stringów uzy obiektów pobranych z bazy
             */
            for (int i = 0; i < 10; i++) {
                   /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                while (resultSet.next()) {


       




      /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  id_klienta
 */
                    int id_klienta = resultSet.getInt("id_klienta");
                          /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                    String login = resultSet.getString("login");
                          /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  imie
 */
                    String imie = resultSet.getString("imie");
                          /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  nazwisko
 */
                    String nazwisko = resultSet.getString("nazwisko");
                          /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  numer_tel
 */
                    String numer_tel = resultSet.getString("numer_tel");
                    /**
                     * inkrementacja zmiennej pomocniczej 
                     */
                    licznik_wierszy++;
                    /**
                     * dodanie do tablicy uzy zmiennej login który jestt pobrany z bazy
                     */
                    uzy[i] = login;
                    System.out.println(uzy[i]);
                    /**
                     * dodanie do listy tablicowej danych pochodzącyh z bazy z tabeli klienci zapisancyh do zmiennych 
                     */
                     klientList.add(new Klient(imie, nazwisko, login, numer_tel));
                }
            }

        } 
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // create_PDF.

        // todo dodać ścieżke
        /**
         * wygenerowanie raportu pooprzez wywolanie metody obiektu klientRaport generujRaport. Jej parametry to: klientList - lista tablicowa przechowujaca dane ktorymi wypełniony zostanie PDF  tym przypadku danymi z tabeli klienci, new FileInputStream("src\\fxml\\klient.jrfxml") - sciezka do pliku źródłowego w którym jest zainicjolizoany wygląd dokumentu PDFa oraz 3 parametr to sciezka do pliku docelowego
         */
        klientRaport.generujRaport(klientList, new FileInputStream("src\\fxml\\klient.jrfxml"), "C:\\Users\\Kamil\\Documents\\NetBeansProjects\\20L1GR5_projekt\\Projekt_biblioteka\\src\\projekt_biblioteka");


    }
/**
 * metoda odpowiedzialna za wygenerowanie raportu w formacie PDF w którym są umieszczone dane o wypożyczeniach
 * @param event param event Zdarzenie reprezentujące pewien rodzaj akcji w tym przypadku wygenerowanie raportu za pomocą kliku myszą
    
 * @throws FileNotFoundException wyrzuca wyjątek w przypadku gdy nie można zlokalizowac pliku
 * @throws JRException  wyjątek wyrzucany w przypadku niepowodznia dzialania biblioteki JasperReports
 */
    @FXML
    private void pdf_wyp(ActionEvent event) throws FileNotFoundException, JRException {
        ladujdane.setDisable(false);
        czyscdane.setDisable(false);
        rw.setDisable(false);
         ru.setDisable(false);
        
        
        /**
         *  utworzenie obiektu listy tablicowej
         */
        List<Wypozyczenia> wypozyczeniaList = new ArrayList<>();
        /**
         * utworzenie obiektu typu WypozyczeniaRaport() potrzebego do wygenerowania raportu
         */
        WypozyczeniaRaport wypozyczeniaRaport = new WypozyczeniaRaport();
        
         /**
                     * przypisujemy pod zmienną wynik dzialąnia polecenia SQL-owego czyli wybór wszystkich rekordow  z tabeli wypozyczenia oraz poprzez powiązanie za pomocą inner joina z tabelami ksiazki oraz klienci i przez to wyświetlenie loginu użytkwnika oraz tytulu wypozyczonej ksiażki przez tegoż użytkownika
                     */
        
        String sql = "select klienci.login, ksiazki.tytul, data_wyp, data_zwr \n" +
"from wypozyczenia inner join klienci on wypozyczenia.id_klienta=klienci.id_klienta inner join ksiazki on wypozyczenia.id_ksiazki=ksiazki.id_ksiazki";
        System.out.println(connection.conDB());
        /**
         * utworzenie tablicy typu String potrzebnej do przechowywania obiektów pobranch z bazy
         */
        String uzy[] = new String[10];
        /**
         * blok try-catch sprawdzający poprawność i dostępność (czy poprawnie wysłano) powyższego polecenia SQL-owego
         */
        try {
            
              /**
             * przygotowanie i wysłanie polecenia SQL-owego do bazy 
             */
            preparedStatement = con.prepareStatement(sql); /**
 * pobor danych z bazy i zapis do zmiennej
 */
            
//              preparedStatement.setString(1,login1);
            resultSet = preparedStatement.executeQuery();
            /** 
             * pętla for ktora działa 10 razy slużąca do zapisnia do tablicy Stringów uzy obiektów pobranych z bazy
             */
            for (int i = 0; i < 10; i++) {
                    /**
 * petla while która odczytuje kolejne rekordy z bazy
 */
                while (resultSet.next()) {
  /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  login
 */
                    String id_klienta = resultSet.getString("klienci.login");
                      /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  tytul
 */
                    String login = resultSet.getString("ksiazki.tytul");
                      /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  data_wyp
 */
                    String imie = resultSet.getString("data_wyp");
                      /**
 * zmienna która przechowuje zmnienną pobraną z bazy -  data_zwr
 */
                    String nazwisko = resultSet.getString("data_zwr");
             /**
                     * 
                     przypisane do zmiennej tablicowej typu String (result) wyninków działania  metody split czyli zapisuje  jako odzdielne wartości obieky które są oddzielone znakime "-" zapisane w zmennej imie
 */
                    String[] result = imie.split("-");
                          /**
                     * 
                     przypisane do zmiennej tablicowej typu String (result) wyninków działania  metody split czyli zapisuje  jako odzdielne wartości obieky które są oddzielone znakime "-" zapisane w zmennej imie
 */
                    String[] result1 = nazwisko.split("-");
                    /**
                     * zapis do typu LocalDate wartości po kolei z tablicy Stringów result i konwersja ich na typy Integer
                     */
                   LocalDate.of(Integer.valueOf(result[0]),Integer.valueOf(result[1]),Integer.valueOf(result[2]));
                    /**
                     * zapis do typu LocalDate wartości po kolei z tablicy Stringów result1 i konwersja ich na typy Integer
                     */
                   LocalDate.of(Integer.valueOf(result1[0]),Integer.valueOf(result1[1]),Integer.valueOf(result1[2]));
                   /**
                    * zwiekszenie licznika zmiennej pomocniczej o 1
                    */
                    licznik_wierszy++;/**
                     * dodanie do tablicy uzy zmiennej login który jestt pobrany z bazy
                     */
                    uzy[i] = login;
                    
                    System.out.println(uzy[i]);
                     /**
                     * dodanie do listy tablicowej danych pochodzącyh z bazy z tabeli wypozyczenia zapisancyh do zmiennych 
                     */
                     wypozyczeniaList.add(new Wypozyczenia(id_klienta, login,  LocalDate.of(Integer.valueOf(result[0]),Integer.valueOf(result[1]),Integer.valueOf(result[2])),  LocalDate.of(Integer.valueOf(result1[0]),Integer.valueOf(result1[1]),Integer.valueOf(result1[2]))));
                }
            }

        }
        /**
 * w przypadku błedu SQL-owego wyswietlenie odpowiedniej informacji o błędzie
 */
        catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        // wyciągnąć dane z bazy i dla każdego obiektu
//        wypozyczeniaList.add(new Wypozyczenia("nazwisko", "tytuł", dataWypozyczenia, dataZwrotu));



        // todo dodać ścieżke
        /**
         * wygenerowanie raportu pooprzez wywolanie metody obiektu wypozyczeniaRaport generujRaport. Jej parametry to: wypozyczeniaList - lista tablicowa przechowujaca dane ktorymi wypełniony zostanie PDF w tym przypadku danymi z tabeli wypozyczenia, new FileInputStream("src\\fxml\\klient.jrfxml") - sciezka do pliku źródłowego w którym jest zainicjolizoany wygląd dokumentu PDFa oraz 3 parametr to sciezka do pliku docelowego
         */
        wypozyczeniaRaport.generujRaport(wypozyczeniaList, new FileInputStream("src\\fxml\\wypozyczenia.jrfxml"), "C:\\Users\\Kamil\\Documents\\NetBeansProjects\\20L1GR5_projekt\\Projekt_biblioteka\\src\\projekt_biblioteka");
    }
}