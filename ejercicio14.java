/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject43;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject43 {

    public static void main(String[] args) {
        System.out.println("La suma es: " + sumarCien());
    }

    public static int sumarCien() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        return suma;
    }
}
