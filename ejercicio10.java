/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject39;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject39 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("=== VERIFICADOR DE AÑO BISIESTO ===");

        // 1. Entrada de datos
        System.out.print("Ingrese un año: ");
        int anio = teclado.nextInt();

        // 2. Procesamiento y salida
        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " ES bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
    }

    // Método para determinar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        // Regla: Divisible entre 4 Y (NO divisible entre 100 O divisible entre 400)
        return (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);
    }
}
