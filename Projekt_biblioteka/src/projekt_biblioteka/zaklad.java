/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_biblioteka;

/**
 *
 * @author Kamil
 */
public class zaklad {
    public String nazwa = null;
    public String adres = null;
    public String typ = null;
    

    public zaklad() {
    }

    public zaklad(String nazwa, String adres,String typ) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.typ = typ;
       
    }

    public String getFirstName() {
        return nazwa;
    }

    
    
    public String getRok() {
        return adres;
    }

    

    public String getLastName() {
        return typ;
    }

    
   

}
