/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ITS LOJA
 */
public class ejercicio_vicente {
//    public static void main(String[] args){
//        Scanner a= new Scanner(System.in);
//        String frase;
//        System.out.println("intoduce una frase");
//        frase=a.nextLine();
//        StringTokenizer b= new StringTokenizer(frase);
//        System.out.println("numero de palabras"+ b.countTokens());
//        
//    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase = a.nextLine();
        int contadordepalabras = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadordepalabras++;
            }
        }
        System.out.println("hay " + contadordepalabras + " palabras");
    }
}
