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
public class mayusculas_y_minusculas {

    public static void main(String[] args) {
        System.out.println("digite la palabra");
        Scanner entrada = new Scanner(System.in);
        String cadena;
        cadena = entrada.next();
        String vocales = "AEIOUaeiou";
        String consonantes = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        int contarvocales = 0, contarconsonantes = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.contains(cadena.charAt(i) + "")) {
                contarvocales++;
            }
            if (consonantes.contains(cadena.charAt(i) + "")) {
                contarconsonantes++;
            }
        }
        System.out.println("vocales " + contarvocales + " consonantes " + contarconsonantes);
        
        String mayusculas = "AEIOUBCDFGHJKLMNÑPQRSTVWXYZ";
        String minusculas = "bcdfghjklmnpqrstvwxyzaeiou";
        int contarmayusculas = 0, contarminusculas = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (mayusculas.contains(cadena.charAt(i) + "")) {
                contarmayusculas++;
            }
            if (minusculas.contains(cadena.charAt(i) + "")) {
                contarminusculas++;
            }
            
        }
        System.out.println("mayusculas " + contarmayusculas + " minusculas " + contarminusculas);
    }
}
