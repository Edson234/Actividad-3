/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Edson Coj
 */
public class Tareas4parte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Tarea 8");
        char gato[][]= new char[3][3];
        gato[0][0]='x';
        gato[0][1]='o';
        gato[0][2]='o';
        gato[1][0]='o';
        gato[1][1]='x';
        gato[1][2]='o';
        gato[2][0]='o';
        gato[2][1]='o';
        gato[2][2]='x';
        for (int i = 0; i < gato.length; i++) {
            System.out.println("|" + gato[i][0]+"|" + gato[i][1]+"|"+gato[i][2]+"|");
    }
        }
    
}
