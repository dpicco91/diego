
package ejercicioextra19;

import java.util.Scanner;

 
public class Ejercicioextra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("determine el tamaño de ambos vectores: ");
        int tamaño = leer.nextInt();
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            
            vector1[i] = (int)(Math.random()*2);
            vector2[i] = (int)(Math.random()*2);
        }
        for (int i = 0; i < tamaño; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("alguno de los valores no coinciden");
                break;
            }
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector1[i]);
        }

        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector2[i]);
        }

    }

        // TODO code application logic here
    }
    

