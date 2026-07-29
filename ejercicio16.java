/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject45;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject45 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        procesarHastaCero(teclado);
    }

    public static void procesarHastaCero(Scanner sc) {
        double suma = 0, num;
        int cont = 0;
        do {
            System.out.print("Ingrese número (0 para salir): ");
            num = sc.nextDouble();
            if (num != 0) {
                suma += num;
                cont++;
            }
        } while (num != 0);
        
        System.out.println("Cantidad: " + cont);
        System.out.println("Suma: " + suma);
        if(cont > 0) System.out.println("Promedio: " + (suma / cont));
    }
}