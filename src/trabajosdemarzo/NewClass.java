/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author ITS LOJA
 */
public class NewClass {
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
String Texto="";
int cont=0;
int contador=0;
System.out.println("Ingresa el texto ");
Texto = lector.nextLine(); 
for (int i = 0; i < Texto.length(); i++) {
cont ++;
    System.out.println("letras: "+cont);
    
}
        System.out.println("el numero de vocales es: ");
for (int i = 0; i < Texto.length(); i++) {
if ((Texto.charAt(i)=='a') || (Texto.charAt(i)=='e') || (Texto.charAt(i)=='i') || (Texto.charAt(i)=='o') || (Texto.charAt(i)=='u')){
    contador++;
        System.out.println("vocal: "+contador);
}
}


    }
}
    