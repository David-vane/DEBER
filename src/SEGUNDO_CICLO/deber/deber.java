/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO.deber;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class deber {
    public static void main(String args[]) { 
        Scanner entrada =new Scanner(System.in);
        System.out.println("escribe una palabra");
        String cadena ;
        String cadena2;
        cadena= entrada.next();
        cadena2=entrada.next();
        // Convierte en mayusculas
        System.out.println(cadena.toUpperCase());
        // convertir a lowercase
        System.out.println(cadena2.toLowerCase());
    }
}
