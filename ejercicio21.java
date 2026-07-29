/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject50;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject50 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] arr = new int[25];

        // 1. Primero se llena el arreglo con datos
        System.out.println("--- Ingreso de 25 números ---");
        for (int i = 0; i < 25; i++) {
            System.out.print("Ingrese número para la posición [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // 2. Ahora se realiza la búsqueda
        System.out.print("\n¿Qué número desea buscar?: ");
        int busqueda = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 25; i++) {
            if (arr[i] == busqueda) {
                System.out.println("¡Encontrado! El número está en la posición (índice): " + i);
                encontrado = true;
                break; // Se detiene al encontrar la primera coincidencia
            }
        }

        if (!encontrado) {
            System.out.println("El número " + busqueda + " no existe en el arreglo.");
        }
    }
}