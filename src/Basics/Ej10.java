/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int cateto1, cateto2;
        double hipotenusa;

        System.out.println("Escribe el cateto 1:");
        cateto1 = teclado.nextInt();
        System.out.println("Escribe el cateto 2:");
        cateto2 = teclado.nextInt();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("La hipotenusa es: %.2f\n", hipotenusa);
    }

}
