/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Configuracion.ConexionLocal;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author matia
 */
public class UsuarioController {

    private ConexionLocal ConnNueva = new ConexionLocal();

    public int iniciarSesion(String user, String password) {

        try {

            ConnNueva.conectar();
            String consulta = "select u.idusuario, u.password from usuario as u where u.user = ?;";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "El usuario no existe");

                return -1;
            }

            if (rs.getString("password").equals(password)) {
                return rs.getInt("idusuario");
            }
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta, vuelva a intentarlo.");

            return -1;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error al iniciar Sesion.", JOptionPane.ERROR_MESSAGE);
            return -1;
        }

    }

    public boolean registrarse(String user, String password) {

        try {
            ConnNueva.conectar();
            String consulta = "select * from usuario where user = ?;";
            PreparedStatement st = ConnNueva.getConexion().prepareStatement(consulta);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                return false;
            }

            consulta = "insert into usuario (user, password, idRol) values (?,?,2);";
            st = ConnNueva.getConexion().prepareStatement(consulta);
            st.setString(1, user);
            st.setString(2, password);
            st.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "error al registrar usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
