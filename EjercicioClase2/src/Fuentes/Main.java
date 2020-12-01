
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Matriz matA,matB,matC;
        int n,m,a,b;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el orden de las matrices a sumar ");
        System.out.println("Ingrese el numero de filas: ");
        n=sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        m=sc.nextInt();
        matA=new Matriz(n, m);
        matB=new Matriz(n, m);
        matC=new Matriz(n, m);
        System.out.println("Ingrese el rango de numeros de la matriz A");
        System.out.println("Ingrese el limite inferior: ");
        a=sc.nextInt();
        System.out.println("Ingrese el limite superior: ");
        b=sc.nextInt();
        matA.setMatriz(a,b);
        System.out.println("Ingrese el rango de numeros de la matriz B");
        System.out.println("Ingrese el limite inferior: ");
        a=sc.nextInt();
        System.out.println("Ingrese el limite superior: ");
        b=sc.nextInt();
        System.out.println("Matriz A\n" + matA.toString());
        matB.setMatriz(a,b);
        System.out.println("Matriz B\n" + matB.toString());
        matC=matA.sumaMatriz(matB);
        System.out.println("Matriz Suma\n" + matC.toString());
    }
    
}
