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
public class sign {
    public static String main(String[] args) { 
        int dia;
        int mes;
        Scanner entrada = new Scanner(System.in);
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        if (mes==1){
            if (dia >= 21) {
                return "acuario";
            } else {
                return "capricornio";
            }
        }
        if (mes==2){
            if (dia >= 19) {
                System.out.println("piscis"); 
            } else {
                System.out.println("acuario");
            }
        }
        if (mes==3){
            if (dia >= 20) {
                System.out.println("aries");
            } else {
                System.out.println("piscis");
            }
        }
        if (mes==4){
            if (dia >= 20) {
                System.out.println("tauro");
            } else {
                System.out.println("aries");
            }
        }
        if (mes==5){
            if (dia >= 21) {
                System.out.println("geminis");
            } else {
                System.out.println("tauro");
            }
        }
        if (mes==6){
            if (dia >= 20) {
                System.out.println("cancer");
            } else {
                System.out.println("geminis");
            }
        }
        if (mes==7){
            if (dia >= 22) {
                System.out.println("leo");
            } else {
                System.out.println("cancer");
            }
        }
        if (mes==8){
            if (dia >= 21) {
                System.out.println("virgo");
            } else {
                System.out.println("leo");
            }
        }
        if (mes==9){
            if (dia >= 22) {
                System.out.println("libra");
            } else {
                System.out.println("virgo");
            }
        }
        if (mes==10){
            if (dia >= 21) {
                System.out.println("escorpion");
            } else {
                System.out.println("libra");
            }
        }
        if (mes==11){
            if (dia >= 21) {
                System.out.println("sagitario");
            } else {
                return "escorpion";
            }
        }
        if (mes==12){
            if (dia >= 21) {
                System.out.println("capricornio");
            } else {
                System.out.println("sagitario");
            }
        }
    }
}

   