/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra17;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicioextra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo");
        int num = leer.nextInt();
        if (esPrimo(num)) {
            System.out.println("Es un numero Primo");
        } else {
            System.out.println("NO es un numero primo");
        }
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            return true;
        } else {
            return false;
        }
    }

}
        // TODO code application logic here
    
    

