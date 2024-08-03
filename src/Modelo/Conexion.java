/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Conexion {
    Connection c = null;
    private String bd = "bd_hexadrive_acmm";
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/" + bd;

    
    public Connection getConnection() {
        try {
            //Driver
            Class.forName("com.mysql.cj.log.Slf4JLogger");
            try {
                //Conectamos a la Base de Datos
                c = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
                System.out.print("CONEXION REALIZADA EXITOSAMENTE");
            } catch (SQLException ex) {
                System.out.print("NO SE PUDO REALIZAR CONEXION " + ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("NO SE PUDO REALIZAR CONEXION " + ex.getMessage());
        }
        return c;
    }

    public static  Connection obtenerConnection(){
        String url = "jdbc:mysql://localhost:3306/bd_hexadrive_acmm";
        String user = "root";
        String password = "";
        
        Connection con;
        try {
            con = DriverManager.getConnection(url,user,password);
            return con;
        } catch (SQLException ex) {
            System.out.print("NO SE PUDO REALIZAR CONEXION " + ex.getMessage());
            return null;
        }
        
    }
    
    public static void main (String[] args){
        Conexion con = new Conexion();
        con.getConnection();
    }
}
