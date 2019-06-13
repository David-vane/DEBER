/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO.deber;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class Palabras_iguales {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String p1;
        String p2;
        System.out.println("introduce la primera palabra: ");
        p1= entrada.next();
        System.out.println("introduce la segunda palabra: ");
        p2= entrada.next();
        if(Objects.equals(p1,p2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
}
