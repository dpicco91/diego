/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double suma=0, promedio=0;
        System.out.println("Ingrese la cantidad de Familias a encuestar");
        int familia = leer.nextInt();
        double vectorfamilia[] = new double [familia];
        System.out.println("Ingrese la cantidad de hijos por cada familia");
        for (int i = 0; i < familia; i++) {
            System.out.println("Familia N° "+(i+1));
            vectorfamilia[i]=leer.nextDouble();
            suma +=vectorfamilia[i];
       }
        promedio=(suma/familia);
        System.out.println("El promedio de hijos por familia es: "+promedio);
    }
    
}
