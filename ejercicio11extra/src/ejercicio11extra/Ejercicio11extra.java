/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11extra;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        medirNumero(num);
    }

    public static void medirNumero(int num) {
        int cont = 0;
        do {
            num /= 10;
            cont++;
        } while (num > 0);
        System.out.println("El numero tiene " + cont + " digitos");

    }
        // TODO code application logic here
    }
    

