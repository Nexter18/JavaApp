/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joseph
 */
public class ConexionDB {
    public  Connection conn;
    private static final String user ="root";
    private static final String password ="";
    private static final String url ="jdbc:mysql://localhost:3306/mediateca";
    private static final String driver = "com.mysql.jdbc.Driver";
    
    public ConexionDB ()  {
    
        conn =null;
        
        try {
        
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        
        if (conn != null) {
        
        System.out.println("Connexion establecida");
        }
        } catch (ClassNotFoundException | SQLException e) {
        
         System.out.println("Error al conectar" + e);
        
        }
    
       
    
    }
    
    //Este metodo retorna conexion
     public Connection getConnection(){
        
        return conn;
        
        }
     
     public void desconectar(){
        
        conn = null;
        
        if (conn == null) {
        
        System.out.println("Conexion terminada");
        }
        
        
        }
     
}
