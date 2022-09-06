/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el tamaño del vector");
        int[] vector = new int[n = leer.nextInt()];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("ingrese un numero a buscar");
        int aux = leer.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (aux == vector[i]) {
                encontrado = true;
                System.out.println("el numero se encontro, en la posicion " + i);
            }

        }
        if (encontrado == false) {
            System.out.println("el numero ingresado no fue encontrado");
        }

        // TODO code application logic here
    }

}
