/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matia
 */
public class Conexion {

    private Connection cnn;
    private String cadenaConexion, usuarioDB, claveDB;

    public Conexion(String cadenaConexion, String usuarioDB, String claveDB) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cadenaConexion = cadenaConexion;
            this.usuarioDB = usuarioDB;
            this.claveDB = claveDB;
            cnn = DriverManager.getConnection(this.cadenaConexion, this.usuarioDB, this.claveDB);
            System.out.println("Coneccion a la base de datos exitosa...");

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public boolean testearConexion() {
        try {
            return !cnn.isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void abrirConexion() {
        try {

            cnn = DriverManager.getConnection(this.cadenaConexion, this.usuarioDB, this.claveDB);
            System.out.println("Conectado...");

        } catch (SQLException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarConexion() {
        try {
            cnn.close();
            System.out.println("Desconectado...");
        } catch (SQLException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public Connection getConexion() {
        return this.cnn;
    }

}
