/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo13demarzo;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class clase {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int suma;
        int multiplicacion;
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();
        if (numero1 % 2 == 0) {
            System.out.println("es par");
            System.out.println("ingresar valores para poder sumar");
            numero2 = entrada.nextInt();
            numero3=entrada.nextInt();
            suma = numero2 + numero3;
            System.out.println(suma);
        } else {
            if (numero1 % 2 == 1) {
                System.out.println("es impar");
                System.out.println("ingrese valores para multiplicar");
                numero2 = entrada.nextInt();
                numero3 = entrada.nextInt();
                multiplicacion = numero2 * numero3;
                System.out.println(multiplicacion);
            }
        }

    }
}
