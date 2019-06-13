/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

import java.util.Scanner;

/**
 *
 * @author msti
 */
public class Software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese el limite de los pares e impares");
        int lim;
        int impar=1;
        int par=0; 
        int cont=1;
        Scanner entrada = new Scanner(System.in);
        lim=entrada.nextInt();
        while (cont<=lim){
            System.out.println(+par +"/"+ impar);
            par=par+2;
            impar=impar+2;
            cont=cont+1;
        } 
        
    }
    
}
