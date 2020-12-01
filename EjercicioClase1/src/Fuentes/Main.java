
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arrays arrays;
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        c=sc.nextInt();
        System.out.println("Ingrese el inicio del array: ");
        a=sc.nextInt();
        System.out.println("Ingrese el final del array: ");
        b=sc.nextInt();
        arrays=new Arrays(c);
        arrays.setArray(a, b);
        System.out.println(arrays.toString());
    }
    
}
