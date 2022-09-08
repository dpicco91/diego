/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9extra;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio9extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el divisor");
        int div = leer.nextInt();
        while (num < div) {
            System.out.println("Ingrese nuevamente un numero y un divisor");
            num = leer.nextInt();
            div = leer.nextInt();
        }
        divicionConRestas(num, div);
    }

    public static void divicionConRestas(int num, int div) {
        int cociente = 0;
        do {
            if (num > div) {
                num -= div;
                cociente++;
            }
        } while (num > div);
        System.out.println("El cociente de la divicion es: " + cociente);
        System.out.println("El residuo de la divicion es: " + num);
    }

        // TODO code application logic here
    }
    

