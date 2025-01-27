/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trimestre2;

import java.util.ArrayList;
import java.util.Scanner;

/*@author manuel.benavente*/
public class EjercicioArrayList1 {
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<>(3);
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Quiere usar el programa s/n");
        String opcionUno = scanner.nextLine();
       do {
       System.out.println("\n+++++++ Menu de opciones +++++++");
                    System.out.println("1. Agregar un numero ");
                    System.out.println("2. Eliminar un Numero");
                    System.out.println("3. Buscar un Numero especifico");
                    System.out.println("4. Mostrar todos los numeros");
                    System.out.println("5. Ordenar todos los numeros");
                    System.out.println("6. Sumar todos los numeros");
                    System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe un numero ");
                        int numeroAñadir = scanner.nextInt();
                        numeros.add(numeroAñadir);
                        System.out.println("Numero agregado con exito");
                        break;
                    case 2:
                        System.out.println("Seleccione el numero que desea eliminar");
                        int numeroBorrar = scanner.nextInt();
                        numeros.remove(numeroBorrar);
                        System.out.println("Numero " + numeroBorrar + " eliminado.");
                        //Añadir para reordenar la lista                        
                        break;
                    case 3:
                        System.out.println("Numero a buscar");
                        int numeroBuscar = scanner.nextInt();
                        int posicion = numeros.indexOf(numeroBuscar);
                        if (posicion >= 0) {
                                System.out.println("El numero " + numeroBuscar + " se encuentra en la posicion " + (posicion+1) + " del ArrayList.");
                            } else {
                                System.out.println("El numero " + numeroBuscar + " no se encuentra en el ArrayList.");
                            }
                        break;
                    case 4:
                        System.out.println(numeros);
                        /*
                        Manera 2 de recorrer un ArrayList
                        for (int numero : numeros) {
                        System.out.println(numero);
                        }
                        */
                        break;
                    case 5: 
                        numeros.sort(null);
                        System.out.println("Numeros ordenados correctamente");
                        for (int numero : numeros) {
                        System.out.println(numero);
                        }
                        break;
                    case 6:
                        int suma = 0;
                        for (int numero : numeros) {
                            suma += numero;
                        }
                        System.out.println("La suma es: " + suma);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        }
                } while (opcionUno != "n");
                    System.out.println("Gracias por usar la aplicacion");
                    scanner.close();    
    }
}