
package Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int n;
        System.out.println("Ingrese el tamaño de la lista:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            lista.añadirInicio(rd.nextInt(n));
        }
        System.out.println("Los elementos de la lista son:");
        System.out.println(lista.salida());
        System.out.println("Los elementos pares de la lista son:");
        System.out.println(lista.numPar());
    }
    
}
