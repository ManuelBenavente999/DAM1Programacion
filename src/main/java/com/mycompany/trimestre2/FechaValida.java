/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trimestre2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FechaValida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaMinima = LocalDate.of(1900, 1, 1);
        LocalDate fechaActual = LocalDate.now();

        while (true) {
            System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
            String fechaInput = scanner.nextLine();

            try {
                if (!validarFormato(fechaInput)) {
                    throw new IllegalArgumentException("Error: El formato de la fecha debe ser dd/mm/aaaa.");
                }

                LocalDate fecha = LocalDate.parse(fechaInput, formatter);

                if (fecha.isBefore(fechaMinima) || fecha.isAfter(fechaActual)) {
                    throw new IllegalArgumentException("Error: Fecha no válida. Por favor, introduce una fecha real dentro del rango permitido (1900 - fecha actual).\"");
                }

                System.out.println("La fecha es válida.");
                break;

            } catch (DateTimeParseException e) {
                System.out.println("Error: Fecha no válida. Por favor, introduce una fecha real.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado. Por favor, inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    // Validar formato usando expresión regular
    private static boolean validarFormato(String fecha) {
        String patron = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }
}
