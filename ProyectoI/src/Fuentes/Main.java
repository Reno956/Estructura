
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        long inicio, fin, tiempo;
        Scanner sc = new Scanner(System.in);
        int tam,num;
        System.out.println("Ingrese el tamaño del arreglo");
        tam=sc.nextInt();
        System.out.println("Ingrse el numero deseado");
        num=sc.nextInt();
        Arreglo arreglo= new Arreglo(tam);
        System.out.println("\nArreglo en desorden");
        System.out.println(arreglo.toString());
        inicio = System.currentTimeMillis();
        arreglo.buscarSuma(num);
        fin = System.currentTimeMillis();
        tiempo=(fin-inicio);
        System.out.println( "Tiempo de ejecucion: "+tiempo+" milisegundos");
        arreglo.ordVector(0, arreglo.getTamaño());
        System.out.println("\nArreglo ordenado");
        System.out.println(arreglo.toString());
        inicio = System.currentTimeMillis();
        arreglo.buscarSuma(num);
        fin = System.currentTimeMillis();
        tiempo=(fin-inicio);
        System.out.println( "Tiempo de ejecucion: "+tiempo+" milisegundos");
    }
    
}
