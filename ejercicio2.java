/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject31;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE FACTURA CON IVA (19%) ===");
        
        // 1. Entrada de datos
        System.out.print("Ingrese el valor del producto (sin IVA): ");
        double valorBase = teclado.nextDouble();

        // 2. Procesamiento de datos mediante métodos
        double valorIva = calcularIva(valorBase);
        double valorTotal = calcularTotal(valorBase, valorIva);

        // 3. Salida de resultados
        System.out.println("\n---------------------------------------");
        System.out.println("Valor antes del IVA: $" + valorBase);
        System.out.println("Valor del IVA (19%): $" + valorIva);
        System.out.println("Valor Total a pagar: $" + valorTotal);
        System.out.println("---------------------------------------");
    }

    // Método para calcular únicamente el 19% de IVA
    public static double calcularIva(double valorBase) {
        return valorBase * 0.19;
    }

    // Método para calcular el Total (Base + IVA)
    public static double calcularTotal(double valorBase, double valorIva) {
        return valorBase + valorIva;
    }
}
