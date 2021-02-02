
package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la lista:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el elemento " + i + ":");
            lista.añadirInicio(sc.nextInt());
        }
        System.out.println("Los elementos de la lista son:");
        System.out.println(lista.toString());
        System.out.println("Ingrese el elemento a buscar:");
        n=lista.buscarEnLista(sc.nextInt());
        if(n==0){
            System.out.println("Elemento no encontrado");
        } else{
            System.out.println("Elemento encontrado " + n + " veces");
        }
    }
    
}
