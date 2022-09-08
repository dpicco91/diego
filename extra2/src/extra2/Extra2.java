/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
 *
 * @author dayana
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A=1,B=2,C=3,D=4,aux;
        
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        
        aux=B;
        B=C;
        C=aux; 
        aux=D;
        D=C;
        C=A;
        A=aux;
        
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);

        // TODO code application logic here
    }
    
}
