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
public class asteriscos {

    public static void main(String[] args) {
        int asterisco;
        Scanner entrada = new Scanner(System.in);
        int base;
        int espacio;
        int i;
        base = entrada.nextInt();
        for (i = 1; i <= base; i++) {
            for (espacio = 1; espacio <= base - i; espacio++) {
                System.out.println(" ");
            }
            for (asterisco = 1; asterisco <= i; asterisco += 1 ) {
                System.out.print(" * ");
            }
        }
        System.out.println(" ");
    }
}
