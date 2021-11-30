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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valorInicial;
        float valorFinal, impuesto = 1.20f, ganancia = 1.10f;
        Scanner a = new Scanner(System.in);

        System.out.println("Introduce el coste de fabrica del vehiculo:");

        valorInicial = a.nextInt();
        a.nextLine();
        valorFinal = valorInicial * (float) ganancia * (float) impuesto;

        System.out.printf("El coste para el consumidor es: %.2f €\n", valorFinal);
    }

}
