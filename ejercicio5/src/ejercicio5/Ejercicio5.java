
package ejercicio5;
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner (System.in) ;
        int num= leer.nextInt();
        System.out.println("el doble del numero es "+ (num*2));
        System.out.println("el triple del numero es "+ (num*3));
        System.out.println("la raiz cuadrada del numero es "+ Math.sqrt(num) );
                
        
    }
    
}
