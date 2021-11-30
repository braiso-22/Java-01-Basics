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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escribe 1 número entero!");
        num1 = a.nextInt();
        a.nextLine();
        System.out.println("Escribe otro número entero");
        num2 = a.nextInt();
        a.nextLine();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        float division = (float) num1 / num2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + multiplicacion);
        System.out.println("La división es " + division);
    }

}
