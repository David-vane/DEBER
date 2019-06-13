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
public class imprimir_asteriscos {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int numero;
     numero=entrada.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println("*");
        }
    }
}
