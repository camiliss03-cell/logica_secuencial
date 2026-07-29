/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject32;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class ejercicio3 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE NOTA DEFINITIVA ===");

        // 1. Entrada de datos
        System.out.print("Ingrese la nota del Parcial 1 (30%): ");
        double parcial1 = teclado.nextDouble();

        System.out.print("Ingrese la nota del Parcial 2 (30%): ");
        double parcial2 = teclado.nextDouble();

        System.out.print("Ingrese la nota del Proyecto Final (40%): ");
        double proyectoFinal = teclado.nextDouble();

        // 2. Procesamiento mediante el método
        double notaDefinitiva = calcularDefinitiva(parcial1, parcial2, proyectoFinal);

        // 3. Salida de resultados
        System.out.println("\n---------------------------------------");
        System.out.printf("La nota definitiva del estudiante es: %.2f\n", notaDefinitiva);
        System.out.println("---------------------------------------");
    }

    // Método para calcular el promedio ponderado
    public static double calcularDefinitiva(double p1, double p2, double pf) {
        // Multiplicamos cada nota por su porcentaje en decimal
        double aporteP1 = p1 * 0.30;
        double aporteP2 = p2 * 0.30;
        double aportePF = pf * 0.40;

        return aporteP1 + aporteP2 + aportePF;
    }
}
