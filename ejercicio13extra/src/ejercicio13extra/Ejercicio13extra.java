/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13extra;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio13extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para hacer una escalera");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
               System.out.print((j+1)+" ");
            }
            System.out.println("");
        }
    }
        // TODO code application logic here
    }
    

