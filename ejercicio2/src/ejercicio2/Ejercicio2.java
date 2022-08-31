
package ejercicio2;
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("ingrese su nombre");
        Scanner leer = new Scanner (System.in);
        String nombre = leer.nextLine();
        System.out.println("su nombre es "+ nombre);
 
    }
    
}
