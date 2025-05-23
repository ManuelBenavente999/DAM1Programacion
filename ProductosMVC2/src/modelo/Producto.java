/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

/**
 *
 * @author manuel.benavente
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    
    public Producto() {}

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters y Setters

    public int getId() { return id;}
    public void setId(int id) { this.id = id;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre; }
    
    public double getPrecio() {return precio; }
    public void setPrecio(double precio) { this.precio = precio;}
 
}
