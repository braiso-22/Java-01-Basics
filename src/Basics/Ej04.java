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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char porcentaje = '%';

        //no hace falta pedir por pantalla el total porque se puede calcular facilmente
        int suspenso, suficiente, notable, sobresaliente, total, aprobados;

        float porcentajeAprobados, porcentajeNotable, porcentajeSobresaliente;
        Scanner a = new Scanner(System.in);

        System.out.println("Cuantos han suspendido?");
        suspenso = a.nextInt();
        System.out.println("Cuantos han sacado suficiente?");
        suficiente = a.nextInt();
        System.out.println("Cuantos han sacado notable?");
        notable = a.nextInt();
        System.out.println("Cuantos han sacado sobresaliente?");
        sobresaliente = a.nextInt();

        total = suspenso + suficiente + notable + sobresaliente;
        aprobados = total - suspenso;

        porcentajeAprobados = (float) aprobados * 100 / total;
        porcentajeNotable = (float) notable * 100 / total;
        porcentajeSobresaliente = (float) sobresaliente * 100 / total;

        System.out.printf("Los resultados son: \n %.2f%s aprobados\n"
                + " %.2f%2$s notables\n %.2f%2$s sobresalientes\n",
                porcentajeAprobados, porcentaje,
                porcentajeNotable, porcentajeSobresaliente);
        /* 
        System.out.println("Los resultados son: \n" + porcentajeAprobados
                + "% aprobados\n" + porcentajeNotable + "% notables\n"
                + porcentajeSobresaliente + "% sobresalientes");
         */

    }

}
