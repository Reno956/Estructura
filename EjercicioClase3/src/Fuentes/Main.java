
package Fuentes;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Arreglo arrA,arrB;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        c=sc.nextInt();
        arrA=new Arreglo(c);
        arrA.setArray();
        arrB=arrA;
        arrB.bubleSort();
        System.out.println(arrA.toString());
        System.out.println(arrB.toString());
    }
    
}
