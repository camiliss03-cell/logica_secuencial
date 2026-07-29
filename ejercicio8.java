/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject37;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE COMPRA CON DESCUENTO ===");

        // 1. Entrada de datos
        System.out.print("Ingrese el valor total de la compra: $");
        double valorCompra = teclado.nextDouble();

        // 2. Procesamiento mediante métodos
        double descuento = calcularDescuento(valorCompra);
        double totalPagar = valorCompra - descuento;

        // 3. Salida de resultados
        System.out.println("\n---------------------------------------");
        System.out.println("Valor de la compra: $" + valorCompra);
        
        if (descuento > 0) {
            System.out.println("¡Aplica descuento del 10%! : -$" + descuento);
        } else {
            System.out.println("No aplica descuento (Compra menor o igual a $200.000).");
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Total final a pagar: $" + totalPagar);
        System.out.println("---------------------------------------");
    }

    // Método para calcular el descuento si aplica
    public static double calcularDescuento(double compra) {
        // La condición indica que debe SUPERAR los $200.000 (compra > 200000)
        if (compra > 200000) {
            return compra * 0.10; // Devuelve el 10%
        } else {
            return 0; // No hay descuento
        }
    }
}
