/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author matia
 */
public class Juego {
    private String nombre;
    private int calificacion;
    private int id;
    
    public Juego (int id, String nombre){
        this.id=id;
        this.nombre = nombre;
        this.calificacion = -1;
    }
    
    public Juego(int id, String nombre, int calificacion) {
        this.id= id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String toString (){
        if (this.calificacion == -1){
            return this.nombre;
        }
        return String.format("%s --- %d" + "/10a",this.nombre,this.calificacion);
    }
    
    
}
