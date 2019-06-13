/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO;

/**
 *
 * @author ITS LOJA
 */
public class clase_de_string {
    public static void main(String[] args) {
        String cadena = "la sombrilla tiene 1 pata. -";
        int index = cadena.indexOf("a");
        System.out.println(index);
        System.out.println(cadena.concat( " que hace")); //une dos cadenas
        System.out.println(cadena);
        System.out.println(cadena.contains("u"));
//    int contarA=0;
//    String buscar = "12345678";
//            for(int i=0;i<cadena.length();i++){
//                System.out.println(cadena.charAt(i)+" posicion"+i);
//                if(buscar.contains(cadena.charAt(i)+"")){
//                    System.out.println("encontre un numero");
//                    contarA++;
//                    
//                }else{
//                    System.out.println("no encontre un numero");
//                }
//            }
//            System.out.println("el numero total de numeros es " + contarA);
    String vocales="AEIOUaeiou";
    String consonantes="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
    int contarvocales=0, contarconsonantes = 0;
    for (int i=0;i<cadena.length();i++){
        if(vocales.contains(cadena.charAt(i)+"")){
            contarvocales++;
        }
        if(consonantes.contains(cadena.charAt(i)+"")){
            contarconsonantes++;
        }
    }
        System.out.println("vocales "+contarvocales+" consonantes "+contarconsonantes);
        String caracteresespeciales=".,;:-*-+/%$?¿!º_´`";
    String letras="AEIOUBCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyzaeiou";
    int contarcaracteres=0, contarletras = 0;
    for (int i=0;i<cadena.length();i++){
        if(caracteresespeciales.contains(cadena.charAt(i)+"")){
            contarcaracteres++;
        }
        if(letras.contains(cadena.charAt(i)+"")){
            contarletras++;
        }
    }
        System.out.println("hay "+contarcaracteres+" caracteres especiales y  hay "+ contarletras+ " letras");
        System.out.println(cadena.replace("a", "o"));
    }
    
}
