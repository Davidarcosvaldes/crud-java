/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectousers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author David
 */
public class ConectionMysql {
    
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            System.out.println("Conectado a tu bases de datos users");
            
        } catch (Exception e) {
            System.out.println("Error de coneccion "+e);
        }
        return cn;
    }
    
}
