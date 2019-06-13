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
public class impuestos1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su salario mensual: ");
        Double sueldo;
        sueldo = entrada.nextDouble();
        System.out.println("ingrese el limite");
        Double lim;
        lim=entrada.nextDouble();
        sueldo=sueldo*12;
        
        if (sueldo >= lim) {
            System.out.println("usted gana al año: "+sueldo+" por lo tanto debe pagar impuestos");
        } else {
            if (sueldo < lim) {
                System.out.println("usted gana al año: "+sueldo+" por lo tanto no debe pagar impuestos");
            }
        }
    }
}
