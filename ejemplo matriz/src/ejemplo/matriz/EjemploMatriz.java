/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.matriz;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class EjemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese cuantos nombres va ingresar");
        //n = leer.nextInt();
        //String [] vectorNombres = new String[n];
        int [][] matrizNumero = new int[3][3];
        //IngNombres(vectorNombres, leer, n);
        llenarMatriz(matrizNumero, leer);
    }
    
    public static void IngNombres (String[] vectorNombres, Scanner leer,int n){
        System.out.println("Ingrese los nombres que desee");
        for (int i = 0; i < n; i++) {
            vectorNombres[i] = leer.next();
            
        }
    }
    public static void llenarMatriz (int[][] matrizNumero, Scanner leer) {
        System.out.println("Ingrese los numeros");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizNumero[i][j] = leer.nextInt();
            }
   
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizNumero[i][j]+ " ");
                
            }
            System.out.println("");
        }
        
    }
}
        // TODO code application logic here

    

