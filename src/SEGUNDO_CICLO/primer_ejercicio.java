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
public class primer_ejercicio {
    public static void main(String[] args) {
        System.out.println("ingresar un numero");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        if (a%2==0){
            System.out.println("es un numero par");
        } else{
                    System.out.println("es un numero impar");
                    }
    }
}
