/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trimestre2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadoraExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
        boolean entradaValida = false;

        // Solicitar el primer número con manejo de excepción
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, introduce números enteros.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }

        entradaValida = false; // Reiniciar el estado para el segundo número

        // Solicitar el segundo número con manejo de excepción
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, introduce números enteros.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }

        // Solicitar el símbolo de operación
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        // Variable para almacenar el resultado
        int resultado = 0;
        boolean operacionValida = true;

        // Realizar la operación según el símbolo ingresado
        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Error: Entrada no válida. Por favor, introduce un operador válido (+, -, *, /).");
                operacionValida = false;
                break;
        }

        // Mostrar el resultado si la operación fue válida
        if (operacionValida) {
            System.out.println("El resultado de " + numero1 + " " + operacion + " " + numero2 + " es: " + resultado);
        }

        // Cerrar el escáner
        scanner.close();
    }
}
