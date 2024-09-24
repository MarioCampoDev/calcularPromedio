/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularpromedio;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class CalcularPromedio {

    public static void main(String[] args) {
        double notasMatriz[][] = new double [4][4], contadorPromedio = 0, totalPromedio = 0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < notasMatriz.length; i++) {
            for (int j = 0; j < notasMatriz.length-1; j++) {
                System.out.println("Ingrese la nota de la posicion: "+i);
                notasMatriz[i][j] = teclado.nextDouble();
                contadorPromedio = contadorPromedio + notasMatriz[i][j];
            }
            totalPromedio = contadorPromedio/(notasMatriz.length-1);
            notasMatriz[i][notasMatriz.length-1] = totalPromedio;
            contadorPromedio = 0;
        }
        
        for (int i = 0; i < notasMatriz.length; i++) {
            System.out.println("Las notas del alumno #"+i+" son:");
            for (int j = 0; j < notasMatriz.length-1; j++) {
                System.out.println("Nota #"+j+" con valor de: "+notasMatriz[i][j]);
            }
            System.out.println("El valor del promedio es de: "+notasMatriz[i][notasMatriz.length-1]);
        }
    }
}
