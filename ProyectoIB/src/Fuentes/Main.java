
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam,num;
        System.out.println("Ingrese el tamaño del arreglo");
        tam=sc.nextInt();
        System.out.println("Ingrse el numero deseado");
        num=sc.nextInt();
        Arreglo arreglo= new Arreglo(tam);
        System.out.println("Arreglo en desorden");
        System.out.println(arreglo.toString());
        arreglo.buscarSuma(num);
        arreglo.ordVector(0, arreglo.getTamaño());
        System.out.println("Arreglo ordenado");
        System.out.println(arreglo.toString());
        arreglo.buscarSuma(num);
    }
    
}
