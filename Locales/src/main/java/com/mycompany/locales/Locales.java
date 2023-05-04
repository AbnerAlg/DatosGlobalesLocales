/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.locales;

/**
 *
 * @author abner
 */
public class CalcularAreaTriangulo {

    public static void main(String[] args) {
        // Llamamos al método que realiza el cálculo del área del triángulo
        calcularAreaTriangulo();
    }

    public static void calcularAreaTriangulo() {
        // Definimos las variables necesarias para el cálculo del área
        double base = 10.0;
        double altura = 5.0;
        double area;

        // Calculamos el área del triángulo
        area = (base * altura) / 2;

        // Imprimimos el resultado por consola
        System.out.println("El área del triángulo es: " + area);
    }
}
