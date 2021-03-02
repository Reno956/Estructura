
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arbol arbol = new Arbol();
        int n;
        System.out.print("Ingrese el numero de nodos del arbol: ");
        n=sc.nextInt();
        for(int i=0; i<n;i++){
            System.out.print("Ingrese un nodo: ");
            arbol.insertar(sc.nextInt());
        }
        System.out.print("\nPreorden: ");
        arbol.preOrden(arbol.raiz);
        System.out.print("\nInorden: ");
        arbol.inOrden(arbol.raiz);
        System.out.print("\nPosorden: ");
        arbol.posOrden(arbol.raiz);
        System.out.println("");
    }
    
}
