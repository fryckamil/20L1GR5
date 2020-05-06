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
public class hurtownia {
    public String nazwa = null;
    public String wlasciciel = null;
    public float zysk = 0;
    public String data = null;
    

    public hurtownia() {
    }

    public hurtownia(String nazwa, String wlasciciel,float zysk,String data) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.zysk = zysk;
        this.data = data;
       
    }

    public String getFirstName() {
        return nazwa;
    }

    
    
    public String getRok() {
        return wlasciciel;
    }

    

    public float getLastName() {
        return zysk;
    }
    public String getLastName1() {
        return data;
    }
}
