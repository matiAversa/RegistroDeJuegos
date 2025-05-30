/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Configuracion.ConexionLocal;
import Models.Juego;
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
public class JuegoController {

    private ConexionLocal ConnNueva = new ConexionLocal();


    public void creacion(Juego nuevo) {
        try {
            this.ConnNueva.conectar();
            String consulta = "insert into Juego (nombre) values (?);";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setString(1, nuevo.getNombre());
            st.execute();
            this.ConnNueva.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en algo", "error al agregar nuevo juego", 0);
        }
    }


    public List<Juego> readJuegos(int idActual) {
        try {
            this.ConnNueva.conectar();
            String consulta = "select * from juego where juego.idJuego not in (select juegojugado.idJuego from juegojugado where juegojugado.idUsuario = ?);";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setInt(1, idActual);
            ResultSet rs = st.executeQuery();

            List<Juego> juegos = new ArrayList<>();
            while (rs.next()) {
                String nom = rs.getString("nombre");
                int id = rs.getInt("idJuego");
                juegos.add(new Juego(id, nom));
            }
            this.ConnNueva.desconectar();
            return juegos;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al leer Juegos.", "se produjo un error al leer los juegos de la BD", 0);
        }
        return null;
    }

    public void agregarJuegoJugado(int idActual, Juego juegoSeleccionado, int calificacion) {
        try {
            ConnNueva.conectar();
            String consulta = "insert into juegojugado (idUsuario, calificacion, idJuego) values ( ?, ?, ? );";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setInt(1, idActual);
            st.setInt(2, calificacion);
            st.setInt(3, juegoSeleccionado.getId());
            st.execute();
            this.ConnNueva.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "error al ingresar un juego a la lista de juegos jugados", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Juego> readJuegosJugados(int idActual) {

        try {
            this.ConnNueva.conectar();
            String consulta = "select juego.nombre, juego.idJuego, juegoJugado.calificacion from juego inner join juegojugado on (juego.idJuego = juegojugado.idjuego) where juegojugado.idusuario = ?;";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setInt(1,idActual);
            ResultSet rs = st.executeQuery();

            List<Juego> listaJuegos = new ArrayList<>();

            while (rs.next()) {
                String nom = rs.getString("nombre");
                int id = rs.getInt("idJuego");
                int calif = rs.getInt("calificacion");

                listaJuegos.add(new Juego(id, nom, calif));
            }
            this.ConnNueva.desconectar();
            return listaJuegos;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "error al actualizar la lista de juegos jugados", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void actualizar(int idActual, int id, int califNueva) {

        try{
         this.ConnNueva.conectar();
         String consulta = "update juegojugado set calificacion = ? where idJuego=? and idusuario=?;";
         PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
         st.setInt(1,califNueva);
         st.setInt(2, id);
         st.setInt(3,idActual);
         st.execute();
         this.ConnNueva.desconectar();
         
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "error en el back al actualizar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar(int id) {

        try {

            this.ConnNueva.conectar();
            String consulta = "delete from juegoJugado where idJuego = ?;";
            PreparedStatement st = this.ConnNueva.getConexion().prepareStatement(consulta);
            st.setInt(1, id);
            st.execute();
            this.ConnNueva.desconectar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "error al tratar de eliminar el juego seleccionado...", JOptionPane.ERROR_MESSAGE);
        }

    }

}
