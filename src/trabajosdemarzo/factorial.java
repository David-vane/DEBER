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
public class factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int f=1;
        int i;
        int n;
        System.out.println("Ingrese numero");
        n = entrada.nextInt();
        for (i=n;i>0;i--){
            f=f*i;
        }
        System.out.println("el factorial de "+ n +" es:" + f);
        if (n < 0) {
            System.out.println("No existe el factorial de un N negativo");
        } else {
            if (n == 0) {
                System.out.println("El factorial de 0 es 1");
            } else {
                for (i = n; i>0; i--) {
                    f = n * i;
                    System.out.println(n + "*" + i + "=" + f);
                }
            }
        }
        
    }
}
