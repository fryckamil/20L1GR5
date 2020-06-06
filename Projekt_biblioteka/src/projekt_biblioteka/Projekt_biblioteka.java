/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import projekt_biblioteka.reports.TestClass;


/**
 *
 * @author Kamil
 */
public class Projekt_biblioteka extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        TestClass.testMethod();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        TableView tableView = new TableView();
tableView.setLayoutX(125);
tableView.setLayoutY(125);
tableView.setPrefHeight(123);
tableView.setPrefWidth(123);
    TableColumn<String, Person> column1 = new TableColumn<>("First Name");
    column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));


    TableColumn<String, Person> column2 = new TableColumn<>("Last Name");
    column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    
    TableColumn<String, Person> column3 = new TableColumn<>("First Name");
    column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));


    TableColumn<String, Person> column4 = new TableColumn<>("Last Name");
    column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));


    tableView.getColumns().add(column1);
    tableView.getColumns().add(column2);
    tableView.getColumns().add(column3);
    tableView.getColumns().add(column4);

    //tableView.getItems().add(new Person("John", "Doe",0,""));
   // tableView.getItems().add(new Person("Jane", "Deer",0,""));
   
        Scene scene = new Scene(root);
         scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        


        launch(args);
    }
    
}
