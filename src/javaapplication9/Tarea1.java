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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea 1
        
        System.out.println("Tarea 1");
        int suma=0;
        for (int i = 0; i<=102 ; i++) {
            suma=suma+i;
            System.out.println(suma);
            
        // Tarea 2 
        }
           System.out.println("Tarea 2");
        int numero=5;
        int factorial=1;
        while (numero !=0)
            {
            factorial*=numero;
        numero--;
        }
        System.out.println("factorial de 5 es : " + factorial);  
        {
        }
        
        //Tarea 3
        System.out.println("Tarea 3");{
        
    }
        System.out.println("Ingresa un numero a calcular factorial");
        Scanner leer = new Scanner (System.in);
        int num = 1;
        int sum = 1;
        int cont = leer.nextInt();
        for (int i = cont; i > 0; i--) {
            sum = sum * num;
            num++;
        System.out.println("El factorial de: "+cont+" es:"+sum);    
        
        
    }
        System.out.println("ingrese el un numero entero para sacar la media:");
        
        int sumar = 0;
        int num1 = 0;
        int contar = leer.nextInt();
        for (int i = contar; i >=0 ; i--) {
            sumar= sumar + num1;
            num1++;
        }
        float media = sumar/contar;
        System.out.println("la media es:"+media);
        
    }
    
    
}
