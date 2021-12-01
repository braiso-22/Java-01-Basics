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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float media;
        System.out.println("Introduce 4 edades!!");
        media = a.nextFloat();
        media += a.nextFloat();
        media += a.nextFloat();
        media += a.nextFloat();
        
        media /= 4f;

        System.out.printf("La edad media es: %.2f años\n",media);
    }

}
