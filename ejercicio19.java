/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject48;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject48 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int pares = 0, impares = 0;
        double suma = 0;
        
        for(int i=0; i<20; i++) {
            System.out.print("Num: ");
            arr[i] = sc.nextInt();
            suma += arr[i];
            if(arr[i] % 2 == 0) pares++; else impares++;
        }
        System.out.println("Promedio: " + (suma/20) + " | Pares: " + pares + " | Impares: " + impares);
    }
}