/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject30;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class ejercicio1 {

    public static void main(String[] args) 
{
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE RECTÁNGULO ===");
        
        // 1. Pedir la base y la altura
        System.out.print("Ingrese la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        // 2. Calcular Área y Perímetro
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        // 3. Mostrar Resultados
        System.out.println("\n-----------------------------");
        System.out.println("El Área es: " + area);
        System.out.println("El Perímetro es: " + perimetro);
        System.out.println("-----------------------------");
    }

    // Método para calcular el área: Base * Altura
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Método para calcular el perímetro: 2 * (Base + Altura)
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
