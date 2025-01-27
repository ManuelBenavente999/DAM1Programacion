/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trimestre2;

import java.util.Stack;

/**
 *
 * @author manuel.benavente
 */
public class Palindromo {
    public static String invertir(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char letra : cadena.toCharArray()) {
            pila.push(letra);
        }
        StringBuilder invertida = new StringBuilder();
        while(!pila.isEmpty()) {
            invertida.append(pila.pop());
        }
        return invertida.toString();  
    }
    
    public static void main(String[] args) {
        String palabra = "phohp";
        System.out.println(invertir(palabra));
        if (palabra == invertir(palabra)) {
            System.out.println("La palabra es Palindromo");
        } else {System.out.println("La palabra no es Palindromo");
    }
}
}
