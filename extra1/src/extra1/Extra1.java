/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author dayana
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        Scanner read = new Scanner(System.in);
        int min, hr, d;
        System.out.print("ingrese la cantidad de minutos ");
        min = read.nextInt();
        hr = Math.round(min / 60);
        d = 0;
        while (hr >= 24) {
            hr = hr - 24;
            d++;
        }
        System.out.println("son "+d+" días y "+hr+" horas");
        // TODO code application logic here
    }
    
}
