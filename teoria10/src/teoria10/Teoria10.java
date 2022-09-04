/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria10;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Teoria10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {int num1, num2, num3, num4;
            System.out.println("Ingrese 4 números comprendidos entre 1 y 20");
            Scanner leer = new Scanner(System.in);
            
          
              num1 = leer.nextInt();
              num2 = leer.nextInt();
              num3 = leer.nextInt();
              num4 = leer.nextInt();  
          
           while (num1 < 1 || num1 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num1 = leer.nextInt();
           }
            while (num2 < 1 || num2 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num2 = leer.nextInt();
}
             while (num3 < 1 || num3 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num3 = leer.nextInt();
           }
              while (num4 < 1 || num4 > 20){
               System.out.println("Vuelva a ingresar el número. Recuerde que tiene que estar entre 1 y 20 BOLUDOOOO");
               num4 = leer.nextInt();
           }
                System.out.print( num1 + " ");
                for (int j=0; j < num1; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");
                System.out.print( num2 + " ");
                for (int j=0; j < num2; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");
            
             
                System.out.print(num3 + " ");
                for (int j=0; j < num3; j++){
                    System.out.print("*");
                }
                 System.out.println(" ");
            
            
                System.out.print(num4 + " ");
                for (int j=0; j < num4; j++){
                    System.out.print("*");
                } 
                System.out.println(" ");

        // TODO code application logic here
    }
    
}
