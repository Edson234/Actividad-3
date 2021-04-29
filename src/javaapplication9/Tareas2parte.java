/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Edson Coj
 */
public class Tareas2parte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea 5
        System.out.println("Tarea 5");
        Scanner leer = new Scanner (System.in);
        int num [] = new int [3];
        System.out.println("Ingrese los numeros que va a sumar y sacar el promedio");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = leer.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }

        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("El promedio es: "+ promedio );
        System.out.println("El numero mayor es: " + mayor +" y el numero menor es: "+ menor );
        System.out.println("La distancia entre entre los numeros es: "+ distacia );
    }
    
}
