/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.ocampo;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class ejemplo {
    public static void main(String[] args) {
        decirHola();
        decirAdios();//Como llamo a un metodo
        //Como declaro una variable
        //primero el tipo segundo nombre y tercero opcional el valor
        int numero1;
        int numero2=0;
        //Booleano
        boolean valor1;
        boolean valor2=false;
        boolean valor3=true;
        //Caracter
        char car1;
        char car2='C';
        //Cadena
        String cad1;
        String cad2="es una cadena de texto";
        //Real
        double num1;
        double num2=0.0;
        //objeto
        Scanner entrada=new Scanner(System.in);
       
        numero1=entrada.nextInt();
         if (numero1 ==numero2){
        System.out.println("El numero es "+ numero1);
        System.out.println("ingresa otro numero");
    } else {
            System.out.println("escribir el mismo digito del numero2");
    }
        valor1=entrada.nextBoolean();
        if (valor1==valor2 ){
        System. out.println("el booleano es "+valor1);
        }else{
            System.out.println("escriba el mismo digito del valor2");
        }
        car1=entrada.next().charAt(0);
        if (car1==car2){
        System.out.println("El caracter es "+car1);
        }else{
            System.out.println("escriba el mismo caracter");
        }
        cad1=entrada.next();
        if(cad1==cad2){
        System.out.println("La cadena es "+cad1);
        }else{
            System.out.println("escriba la misma cadena");
        }
        num1=entrada.nextDouble();
        if(num1==num2){
        System.out.println("El real es"+num1);
        }else{
            System.out.println("escriba el mismo numero real");
        }
        
                
    }
    //como declaro un metodo
    
    
    public static void decirHola() {
        System.out.println("Hola Putos");
    }
    public static void decirAdios() {
        System.out.println("Adios");
    }
}
