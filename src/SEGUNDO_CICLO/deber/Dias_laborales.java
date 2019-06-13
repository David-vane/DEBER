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
public class Dias_laborales {
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");
        String dia = entrada.next();
         switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia para descansar");
        
        }
    }
}

