/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject33;

import java.util.Scanner;

/**
 *
 * @author ESCRITORIO
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE NÓMULA Y SALARIO NETO ===");

        // 1. Entrada de datos
        System.out.print("Ingrese el total de horas trabajadas: ");
        double horasTrabajadas = teclado.nextDouble();

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = teclado.nextDouble();

        // 2. Procesamiento de datos mediante métodos
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, valorHora);
        double salud = calcularSalud(salarioBruto);
        double pension = calcularPension(salarioBruto);
        double salarioNeto = calcularSalarioNeto(salarioBruto, salud, pension);

        // 3. Salida de resultados
        System.out.println("\n---------------------------------------");
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Descuento Salud (4%): $" + salud);
        System.out.println("Descuento Pensión (4%): $" + pension);
        System.out.println("---------------------------------------");
        System.out.println("Salario Neto a Pagar: $" + salarioNeto);
        System.out.println("---------------------------------------");
    }

    // Método 1: Salario Bruto = Horas * Valor Hora
    public static double calcularSalarioBruto(double horas, double valorHora) {
        return horas * valorHora;
    }

    // Método 2: Descuento Salud = 4% del Salario Bruto
    public static double calcularSalud(double salarioBruto) {
        return salarioBruto * 0.04;
    }

    // Método 3: Descuento Pensión = 4% del Salario Bruto
    public static double calcularPension(double salarioBruto) {
        return salarioBruto * 0.04;
    }

    // Método 4: Salario Neto = Bruto - Salud - Pensión
    public static double calcularSalarioNeto(double bruto, double salud, double pension) {
        return bruto - (salud + pension);
    }
}
