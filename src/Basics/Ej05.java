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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float fahrenheit, celsius, pulgadas, mm;
        Scanner a = new Scanner(System.in);

        System.out.println("Introduce una temperatura en Celsius!!");
        celsius = a.nextFloat();
        a.nextLine();
        fahrenheit = ((float) celsius * 9 / 5) + 32;

        System.out.printf("En fahrenheit es: %.2f Fº\n", fahrenheit);

        System.out.println("Introduce una cantidad de agua en pulgadas!!");
        pulgadas = a.nextFloat();
        mm = pulgadas / 25.5f;
        System.out.printf("En milimetros es: %.1f mm", mm);
    }

}
