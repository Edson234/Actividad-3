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
public class Tareas3parte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea 6
        
        System.out.println("Tarea 6");
        String[] diaSem;
        diaSem = new String[7];
        diaSem [0] = "Lunes";
        diaSem [1] = "Martes";
        diaSem [2] = "Miercoles";
        diaSem [3] = "Jueves";
        diaSem [4] = "Viernes";
        diaSem [5] = "sabado";
        diaSem [6] = "domingo";
        for (String diasSemana1 : diaSem) {
        System.out.println(diasSemana1);
        }
        // Tarea 7
        
        System.out.println("Tarea 7");
        String sWar[][] = new String[3][4];
        sWar[0][0]="Darth Vader";
        sWar[0][1]="Luke Skywalker";
        sWar[0][2]="Han solo";
        sWar[0][3]="Lea Organa";
        sWar[1][0]="Obi-Wan Kenobi";
        sWar[1][1]="Chewbacca";
        sWar[1][2]="Yoda";
        sWar[1][3]="Palpatine";
        sWar[2][0]="R2-D2";
        sWar[2][1]="Darth Maul";
        sWar[2][2]="Boba Fett";
        sWar[2][3]="C-3PO";
        int i,j;
        for (i = 0;i < sWar.length; i++){
            for(j = 0; j < sWar[i].length; j++){
                System.out.print("["+sWar[i][j]+"]");
        }
            }
    }
    
}
