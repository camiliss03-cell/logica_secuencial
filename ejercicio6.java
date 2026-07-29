/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject35;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject35 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== EVALUACIÓN DE NÚMERO (Positivo / Negativo / Cero) ===");

        // 1. Entrada de datos
        System.out.print("Ingrese un número: ");
        double numero = teclado.nextDouble();

        // 2. Procesamiento y evaluación mediante el método
        evaluarNumero(numero);
    }

    // Método para evaluar la condición del número
    public static void evaluarNumero(double num) {
        System.out.println("\n---------------------------------------");
        if (num > 0) {
            System.out.println("El número " + num + " es POSITIVO.");
        } else if (num < 0) {
            System.out.println("El número " + num + " es NEGATIVO.");
        } else {
            System.out.println("El número es CERO.");
        }
        System.out.println("---------------------------------------");
    }
}
