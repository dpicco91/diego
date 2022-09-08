/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12extra;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        String[] vector2 = new String [10];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i;
        }
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]=String.valueOf(vector[i]);
            if(vector2[i].equals("3")){
                         vector2[i]="E";
                     }
        }
        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                 for (int k = 0; k < vector2.length; k++) {
                     
                     System.out.println("["+vector2[i]+"]"+"["+vector2[j]+"]"+"["+vector2[k]+"]");
                }
            }
        }
    }
}

            
                

            

