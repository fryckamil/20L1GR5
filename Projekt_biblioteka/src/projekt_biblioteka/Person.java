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
    public String imie = null;
    public String nazwisko = null;
    public String telefon = null;
    public String pesel = null;
    public String adres = null;
   public String nip = null;

    public Person() {
    }

    public Person(String imie, String nazwisko,String telefon, String pesel,String adres,String nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.pesel = pesel;
        this.adres = adres;
        this.nip = nip;
    }

    public String getFirstName() {
        return imie;
    }

    public void setFirstName(String firstName) {
        this.imie = imie;
    }
    
    public String getRok() {
        return nazwisko;
    }

    public void setRok(String rok) {
        this.nazwisko = nazwisko;
    }

    public String getLastName() {
        return telefon;
    }

    public void setLastName(String lastName) {
        this.telefon = telefon;
    }
    
     public String getgat() {
        return pesel;
    }

    public void setgat(String lastName) {
        this.pesel = pesel;
    }
    public String getadres() {
        return adres;
    }


    public String getpesel() {
        return nip;
    }

    
}
