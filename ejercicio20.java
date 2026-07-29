/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject49;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject49 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double[] notas = new double[30];
        double suma = 0, mayor = 0, menor = 5.0;
        int aprobados = 0, reprobados = 0;
        
        for(int i=0; i<30; i++) {
            System.out.print("Nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
            if(notas[i] > mayor) mayor = notas[i];
            if(notas[i] < menor) menor = notas[i];
            if(notas[i] >= 3.0) aprobados++; else reprobados++;
        }
        System.out.println("Mayor: " + mayor + " Menor: " + menor + " Promedio: " + (suma/30));
        System.out.println("Aprobados: " + aprobados + " Reprobados: " + reprobados);
    }
}