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
public class calsejueves14 {
    public static void main(String[] args) {
        //para obtener un dato ungresado por el teclado utilizamos la variable(entrada)
        Scanner entrada = new Scanner(System.in);
        //se declara tres variables de tipo real (float) (double)
        float altura, peso, imc;
        //mostrar un mensaje en pantalla
        System.out.println("ingrese su altura en metros");
        //lee los datos ingrasados por el teclado y lo guarda en la variable altura
        altura=entrada.nextFloat();
        //para mopstrar un mensaje en pantalla
        System.out.println("ingresar su peso en kg");
        //lee los datos ingrasados por el teclado y lo guarda en la variable (peso)
        peso=entrada.nextFloat();
        //proceso mediante el cual encontramos el valor de la variable(imc)
        imc=peso/((altura* altura));
        System.out.println("el imc es"+ imc);
        if (imc<18.5){
            System.out.println("bajo peso");
        }else{
            if(imc>18.5 && imc<24.99){
                System.out.println("peso normal");
            }else{
                if (imc>=29.99){
                    System.out.println("sobrepeso");
                }
            }
        }
            
        
    }
}
