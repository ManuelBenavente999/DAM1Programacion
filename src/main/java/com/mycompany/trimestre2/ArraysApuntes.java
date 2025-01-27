/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trimestre2;

import java.util.Arrays;
/**
 *
 * @author manuel.benavente
 */
public class ArraysApuntes {

    public static void main(String[] args) {
        /*String[] nombres = {"Messi","Cristian","Francho","Jefe","Phona"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        for (int f = 0; f<matriz.length; f++) {
            for (int a = 0; a<matriz.length;a++) {
                System.out.println(matriz[f][a]);
            }
        }
        
        int[][] irregular = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
                System.out.println(irregular[0][2]);*/
        
        /*int[] numeros = {10, 8, 7, 1, 4};
        
        int[] palabras = {5 ,3 , 8, 1, 4};
        
        System.out.println(ArraysApuntes.compare(numeros,palabras));
        
        
        ArraysApuntes.sort(numeros);
        System.out.println(ArraysApuntes.toString(numeros));*/
        
        int[] numeros = {10, 8, 7, 1, 4};
        for (int i = 0, j = numeros.length -1 ; i < j; i++, j--) {
        int temp =numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = temp;
    }
        System.out.println(numeros);
        
    
    }
}
