/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject36;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject36 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CLASIFICACIÓN DE EDAD ===");

        // 1. Entrada de datos
        System.out.print("Ingrese la edad de la persona: ");
        int edad = teclado.nextInt();

        // 2. Procesamiento mediante método
        clasificarEdad(edad);
    }

    // Método para clasificar según la edad
    public static void clasificarEdad(int edad) {
        System.out.println("\n---------------------------------------");
        
        if (edad < 0) {
            System.out.println("Edad no válida. Ingrese un valor positivo.");
        } else if (edad <= 11) {
            System.out.println("La persona es un: NIÑO/A");
        } else if (edad <= 17) {
            System.out.println("La persona es un: ADOLESCENTE");
        } else if (edad <= 59) {
            System.out.println("La persona es un: ADULTO");
        } else {
            System.out.println("La persona es un: ADULTO MAYOR");
        }
        
        System.out.println("---------------------------------------");
    }
}
