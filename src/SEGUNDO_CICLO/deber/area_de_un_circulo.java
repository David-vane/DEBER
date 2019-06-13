/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO.deber;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class area_de_un_circulo {

    public static void main(String[] args) {
        System.out.println("introduce el radio");
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double radio;
        double area;
        radio = entrada.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area es: " + area);

    }
}
