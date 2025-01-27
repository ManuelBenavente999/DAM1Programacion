/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trimestre2;
import java.util.ArrayList;
/**
 *
 * @author manuel.benavente
 */
public class ArrayListApuntes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add(0, "Ruben Monc.");
        nombres.add("Kelly");
        nombres.add(1, "Phona");
        
        
        
        String nombre = nombres.get(0);
        String nombreUno = nombres.get(1);
        String nombreDos = nombres.get(2);
        System.out.println(nombre);
        System.out.println(nombreUno);
        System.out.println(nombreDos);
        
    }
    
}
