/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosdemarzo;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class contabilizador_de_vocales_y_consonantes {

    public static void main(String[] args) {
        // TODO Apéndice de método generado automáticamente
        Scanner entrada = new Scanner(System.in);
        String texto;
        //PETICION DE DATOS
        System.out.println("Introduzca un texto para calcular el numero de vocales y consonantes");
        texto = entrada.nextLine();

        //ALMACENAR TEXTO EN UN ARRAY DE CHAR
        char[] textocaracter = texto.toCharArray();

        //SABER NUMERO DE VOCALES Y CONSONANTES
        int i;
        int longitud = textocaracter.length;
        int voc = 0;
        int consonantes;
        for (i = 0; i < longitud; i++) {
            if (textocaracter[i] == 'a' || textocaracter[i] == 'e' || textocaracter[i] == 'i' || textocaracter[i] == 'o' || textocaracter[i] == 'u') {
                voc++;
            }

        }
        consonantes = longitud - voc;
        System.out.println("El numero de vocales son: " + voc);
        System.out.println("El numero de consonantes son: " + consonantes);
    }
}
