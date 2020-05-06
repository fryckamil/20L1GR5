/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author Kamil
 */
public class connection {
    Connection conn=null;
    public static Connection conDB() 
    {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/Zaklady_fryzjerskie","postgres","bronz7");
       return con;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    
}
}
