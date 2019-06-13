/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class invertir {
    public static void main(String args[]) {
       Scanner entrada=new Scanner(System.in);
        String palabra;
        String invertida="";
        System.out.println("Ingresa una palabra y se mostrara a la inversa: ");
        palabra=entrada.nextLine();
        for (int i = palabra.length()-1; i>=0; i--){
            invertida += palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: "+ invertida);
    }
}
