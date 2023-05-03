/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.globales;

/**
 *
 * @author abner
 */
public class Globales {
    

    static int contador = 0;


    public static void incrementarContador() {
        contador++;
    }

    public static void imprimirContador() {
        System.out.println("El contador es: " + contador);
    }



    public static void main(String[] args) {
        incrementarContador();
        incrementarContador();
        imprimirContador();
    }
}
