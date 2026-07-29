/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject47;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject47 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        for(int i=0; i<15; i++) {
            System.out.print("Num: ");
            arr[i] = sc.nextInt();
            if(arr[i] > mayor) mayor = arr[i];
            if(arr[i] < menor) menor = arr[i];
        }
        System.out.println("Mayor: " + mayor + " | Menor: " + menor);
    }
}
