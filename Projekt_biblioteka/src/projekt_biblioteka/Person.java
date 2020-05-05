/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Kamil
 */
public class Person {
    public String firstName = null;
    public String lastName = null;
    public String rok = null;
    public String gat = null;

    public Person() {
    }

    public Person(String firstName, String lastName,String rok, String gat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rok = rok;
        this.gat = gat;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public String getgat() {
        return gat;
    }

    public void setgat(String lastName) {
        this.gat = gat;
    }
}
