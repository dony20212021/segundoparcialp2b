/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.segundoparcialp2b.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RHINO VS OJITOS
 */
public class BaseDatos {
    Connection conn;
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (Exception e) {
            System.out.println("Error en el driver"); 
        } 
    }

    public BaseDatos() {
        conectar();
    }
    
    public static void main(String[] args) {
        new BaseDatos().conectar();
    }
    
}
