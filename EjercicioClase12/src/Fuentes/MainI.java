
package Fuentes;

import java.util.Scanner;

public class MainI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HanoiIterativo hanit;
        long startI,endI;
        endI=0;
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        hanit=new HanoiIterativo(15);
        
        System.out.println("\nMetodo Iterativo");
        startI = System.currentTimeMillis();
        hanit.Hanoi(n, 'A','B','C');
        endI+=(System.currentTimeMillis()-startI);
        System.out.println("Tiempo: " + endI + " ms");
    }
    
}
