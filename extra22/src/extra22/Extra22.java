/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra22;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño de la matriz: ");
        int tamaño1 = leer.nextInt();
        int tamaño2 = leer.nextInt();
        int [][] matriz = new int[tamaño1][tamaño2];
        int suma= 0;
        rellenar (matriz, tamaño1, tamaño2, suma);
    }
    public static void rellenar (int [][] matriz, int tamaño1, int tamaño2, int suma) {
        for (int i = 0; i < tamaño1; i++) {
            for (int j = 0; j < tamaño2; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < tamaño1; i++) {
            for (int j = 0; j < tamaño2; j++) {
               suma+= matriz[i][j];
            }
        }
        System.out.println("la suma de los elementos de las matrices es: "+ suma);
    }

        // TODO code application logic here
    }
    

