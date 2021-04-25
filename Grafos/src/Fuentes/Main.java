
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MatrizAdyacencia matriz;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de vertices: ");
        int nV = sc.nextInt();
        String op;
        matriz=new MatrizAdyacencia(nV);
        for(int i=0;i<nV-1;i++){
            for(int j=i+1;j<nV-1;j++){
                System.out.println("Existe una arista entre "+i+" y "+j);
                System.out.print("Ingrese si o no: ");
                op=sc.next();
                if(op.equalsIgnoreCase("si")){
                    matriz.insrtarArista(i,j);
                }
            }
        }
        System.out.println("\nMatriz de adyacencia\n");
        matriz.imprimir();
        System.out.println("Ingrese los vertices de la arista a eliminar");
        System.out.print("Ingrese el primer indice: ");
        int u=sc.nextInt();
        System.out.print("Ingrese el segundo indice: ");
        int v=sc.nextInt();
        if(matriz.hayArista(u, v)){
            matriz.eliminarArista(u, v);
            System.out.println("\nArista eliminada");
            System.out.println("\nMatriz de adyacencia\n");
            matriz.imprimir();
        }else{
            System.out.println("Los vertices no tienen relacion");
        }
    }
}
