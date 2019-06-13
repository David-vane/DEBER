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
public class remplazo_de_letras {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        String cadena ;
         System.out.println("ingrese la palabra");
         cadena= entrada.next();
         int contador=0;
         for (int l = 0 ; l<cadena.length();l++){
             contador++;
         }
         if( contador>=10){
             System.out.println(cadena.replace("e", "u"));
         }else{
             System.out.println(cadena.replace("o", "e"));
         }
}
}
