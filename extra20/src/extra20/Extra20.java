/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra20;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector ");
        int tamaño = leer.nextInt();
        int vector[]=new int [tamaño];
        rellene(vector);
        imprima(vector);
    }

    public static void rellene(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*9);
        }
    }
    public static void imprima(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }

    }
    
