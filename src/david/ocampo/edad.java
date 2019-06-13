/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.ocampo;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class edad {
    public static void main(String[] args) {
        int numero1;
         Scanner entrada=new Scanner(System.in);
          numero1=entrada.nextInt();
          if (numero1>=1 && numero1<=12){
              System.out.println("es niño");
          }else{
              if (numero1>12 && numero1<=30){
                  System.out.println("es un joven");
              }else{
                  if (numero1>30 && numero1<=64){
                      System.out.println("es adulto");
                  }else{
                      if (numero1>64){
                          System.out.println("es tercera edad");
                      }
                  }
              }
          }
              
    }
}
