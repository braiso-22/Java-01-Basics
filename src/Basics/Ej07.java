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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kilometrajeInicial, kilometrajeActual, gasolinaInicial, gasolinaActual, kilometrosAndados, gasolinaGastada, media;
        Scanner a = new Scanner(System.in);

        System.out.println("Introduce kilometraje inicial");
        kilometrajeInicial = a.nextInt();
        System.out.println("Introduce kilometraje actual");
        kilometrajeActual = a.nextInt();
        System.out.println("Introduce litros de combustible inicial");
        gasolinaInicial = a.nextInt();
        System.out.println("Introduce litros de combustible actual");
        gasolinaActual = a.nextInt();

        kilometrosAndados = kilometrajeActual - kilometrajeInicial;
        gasolinaGastada = gasolinaInicial - gasolinaActual;

        media = gasolinaGastada * 100 / kilometrosAndados;

        System.out.printf("El gasto medio de combustible cada 100Km es de: %d Litros\n",media);
    }

}
