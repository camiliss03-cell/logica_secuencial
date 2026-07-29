/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject44;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject44 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        procesarDiezNumeros(teclado);
    }

    public static void procesarDiezNumeros(Scanner sc) {
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 10));
    }
}