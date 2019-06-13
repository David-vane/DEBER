/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class segundo_ejercicio {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        String texto;
        System.out.println("Introduzca un texto para calcular el numero de mayusculas y minusculas");
        texto = entrada.nextLine();
        char[] textocaracter = texto.toCharArray();
        int i;
        int longitud = textocaracter.length;
        int may = 0;
        int min = 0;
        int num;
        for (i = 0; i < longitud; i++) {
            if (textocaracter[i] == 'A' || textocaracter[i] == 'B' || textocaracter[i] == 'C' || textocaracter[i] == 'D' || textocaracter[i] == 'E' || textocaracter[i] == 'F' || textocaracter[i] == 'G' || textocaracter[i] == 'H' || textocaracter[i] == 'I' || textocaracter[i] == 'J' || textocaracter[i] == 'K' || textocaracter[i] == 'L' || textocaracter[i] == 'M' || textocaracter[i] == 'N' || textocaracter[i] == 'Ñ' || textocaracter[i] == 'O' || textocaracter[i] == 'P' || textocaracter[i] == 'Q' || textocaracter[i] == 'R' || textocaracter[i] == 'S' || textocaracter[i] == 'T' || textocaracter[i] == 'U' || textocaracter[i] == 'V' || textocaracter[i] == 'W' || textocaracter[i] == 'X' || textocaracter[i] == 'Y' || textocaracter[i] == 'Z' ) {
                may++;
            }else{
                if (textocaracter[i] == 'a' || textocaracter[i] == 'b' || textocaracter[i] == 'c' || textocaracter[i] == 'd' || textocaracter[i] == 'e' || textocaracter[i] == 'f' || textocaracter[i] == 'g' || textocaracter[i] == 'h' || textocaracter[i] == 'i' || textocaracter[i] == 'j' || textocaracter[i] == 'k' || textocaracter[i] == 'l' || textocaracter[i] == 'm' || textocaracter[i] == 'n' || textocaracter[i] == 'ñ' || textocaracter[i] == 'o' || textocaracter[i] == 'p' || textocaracter[i] == 'q' || textocaracter[i] == 'r' || textocaracter[i] == 's' || textocaracter[i] == 't' || textocaracter[i] == 'u' || textocaracter[i] == 'v' || textocaracter[i] == 'w' || textocaracter[i] == 'x' || textocaracter[i] == 'y' || textocaracter[i] == 'z' ) {
                  min ++;
            }
             
        }
        min = longitud - may;
        System.out.println("El numero de mayusculas son: " + may);
        System.out.println("El numero de minusculas son: " + min);
        num= longitud - min;
            System.out.println("hay"+ num +"numeros");
    }
}
