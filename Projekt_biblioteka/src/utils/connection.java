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
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteka_n","root","");
       return con;
        } catch (Exception ex) {
            return null;
        }
    
}
}
