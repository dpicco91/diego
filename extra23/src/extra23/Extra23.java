/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra23;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];

        llenarMatriz(matriz);
       
        int[] vector = new int[5];
        String[] palabras = new String[5];
        String frase = "";

        for (int i = 0; i < vector.length; i++) {
            boolean comprobar = false;
            do {
                vector[i] = (int) (Math.random() * 20);
                for (int j = 0; j < i; j++) {
                    if (vector[i] == vector[j]) {
                        comprobar = true;
                        break;
                    } else {
                        comprobar = false;
                    }
                }
            } while (comprobar == true);

        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print("[ " + vector[i] + "] ");
        }
        System.out.println("");

        for (int i = 0; i < palabras.length; i++) {

            do {
                System.out.println("Ingresa la frase " + (i + 1));
                frase = leer.next();
                frase=frase.toUpperCase();
                palabras[i] = frase;

            } while (frase.length() < 3 || frase.length() > 5);

            
        }

        for (int i = 0; i < 5; i++) {
            int n=(int) (Math.random() * 15);
            frase=palabras[i];
            for (int j = 0; j < frase.length(); j++) {
                
                matriz[vector[i]][n]=frase.substring(j, j+1);
                n++;

            }
        }
         mostrarMatriz(matriz);

    }

    public static void llenarMatriz(String[][] matriz) {
        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = String.valueOf((int) (Math.random() * 10));
            }
        }
    }

    public static void mostrarMatriz(String[][] matriz) {

        for (String[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz1[j] + "] ");
            }
            System.out.println("");
        }

    }
        // TODO code application logic here
    }
   
