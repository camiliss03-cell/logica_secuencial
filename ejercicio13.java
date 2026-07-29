/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject42;

/**
 *
 * @author ESCRITORIO
 */
public class Mavenproject42 {

    public static void main(String[] args) {
        mostrarPares();
    }

    public static void mostrarPares() {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}