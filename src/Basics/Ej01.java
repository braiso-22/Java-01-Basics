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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        float valor, tasa = 1.14f;

        System.out.println("Introduce un valor en euros!");
        valor = a.nextFloat();
        a.nextLine();

        valor *= tasa;

        System.out.println("El valor en dolares es: " + valor + "$");
    }

}
