/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.ocampo.deber;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class peso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, peso;
        System.out.println("ingrese su altura en centimetros");
        altura=entrada.nextDouble();
        System.out.println("ingresar si peso en kg");
        peso=entrada.nextFloat();
        if (altura>=150 && altura<160){
            if(peso>=50 && peso<=64){
                System.out.println("peso normal");
            }else{
               if(peso>64){
                   System.out.println("sobrepeso");
               }else{
                   if(peso<50){
                       System.out.println("estas flaco");
                   }
               }
            }
        }
        if (altura>=160 && altura<170){
            if(peso>64 && peso<=72){
                System.out.println("peso normal");
            }else{
               if(peso>72){
                   System.out.println("sobrepeso");
               }else{
                   if(peso<64){
                       System.out.println("estas flaco");
                   }
               }
            }
        }
        if (altura>=170 && altura<=180){
            if(peso>72 && peso<=81){
                System.out.println("peso normal");
            }else{
               if(peso>81){
                   System.out.println("sobrepeso");
               }else{
                   if(peso<72){
                       System.out.println("estas flaco");
                   }
               }
            }
        }
        if (altura>180 && altura<=194){
            if(peso>81 && peso<=94){
                System.out.println("peso normal");
            }else{
               if(peso>94){
                   System.out.println("sobrepeso");
               }else{
                   if(peso<81){
                       System.out.println("estas flaco");
                   }
               }
            }
        }
    }
}
