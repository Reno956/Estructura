
package Fuentes;

import java.util.Scanner;

public class MainR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HanoiRecursivo hanrec=new HanoiRecursivo();
        long startR,endR;
        endR=0;
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        
        System.out.println("\nMetodo Recursivo");
        startR = System.currentTimeMillis();
        hanrec.Hanoi(n,'A','B','C');
        endR+=System.currentTimeMillis()-startR;
        System.out.println("Tiempo: " + endR + " ms");
    }
}
