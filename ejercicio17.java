/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject46;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject46 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[10];
        // Llenado
        for(int i=0; i<10; i++) {
            System.out.print("Posición " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }
        // Mostrar
        for(int n : arreglo) System.out.println(n);
    }
}
