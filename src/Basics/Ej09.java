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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1, var2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        
        var1 += var2;
        var2 = var1 - var2;
        var1 -= var2;
        
        //int var3 = var1; var1=var2; var2=var3;
        
        System.out.printf("Ahora var1 es igual a %d\n", var1);
        System.out.printf("Ahora var2 es igual a %d\n", var2);
    }

}
