/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject38;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject38 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== COMPARACIÓN DE DOS NÚMEROS ===");

        // 1. Entrada de datos
        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();

        // 2. Procesamiento mediante método
        compararNumeros(num1, num2);
    }

    // Método para comparar cuál es mayor, menor o si son iguales
    public static void compararNumeros(double n1, double n2) {
        System.out.println("\n---------------------------------------");
        
        if (n1 > n2) {
            System.out.println("El número MAYOR es: " + n1);
            System.out.println("El número MENOR es: " + n2);
        } else if (n2 > n1) {
            System.out.println("El número MAYOR es: " + n2);
            System.out.println("El número MENOR es: " + n1);
        } else {
            System.out.println("Ambos números son IGUALES (" + n1 + " = " + n2 + ")");
        }
        
        System.out.println("---------------------------------------");
    }
}
