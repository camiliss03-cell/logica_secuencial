/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject34;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");

        // 1. Entrada de datos
        System.out.print("Ingrese la temperatura en grados Celsius (°C): ");
        double celsius = teclado.nextDouble();

        // 2. Procesamiento mediante métodos
        double fahrenheit = convertirAFahrenheit(celsius);
        double kelvin = convertirAKelvin(celsius);

        // 3. Salida de resultados
        System.out.println("\n---------------------------------------");
        System.out.println("Temperatura ingresada: " + celsius + " °C");
        System.out.println("Equivalente en Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Equivalente en Kelvin: " + kelvin + " K");
        System.out.println("---------------------------------------");
    }

    // Método para convertir Celsius a Fahrenheit: (C * 9/5) + 32
    public static double convertirAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Método para convertir Celsius a Kelvin: C + 273.15
    public static double convertirAKelvin(double celsius) {
        return celsius + 273.15;
    }
}
