
package Ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaCircularSimple lista=new ListaCircularSimple();
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int n;
        int op=-1;
        System.out.println("Ingrese el tamaño de la lista:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            lista.añadirInicio(rd.nextInt(n)+1);
        }
        while(op!=0){
            System.out.println("\n1.- Imprimir Lista\n2.- Insertar Elemento");
            System.out.println("3.- Eliminar Elemento\n0.- Salir");
            op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println(lista.toString());
                    break;
                case 2:
                    System.out.println("Ingrese el elemento:");
                    n=sc.nextInt();
                    lista.añadirInicio(n);
                    System.out.println("Elemento ingresado!");
                    break;
                case 3:
                    boolean aux;
                    System.out.println("Ingrese el elemento:");
                    n=sc.nextInt();
                    aux=lista.eliminaDato(n);
                    if(aux){
                        System.out.println("Elemento eliminado!");
                    } else{
                        System.out.println("Elemento no encontrado!");
                    }
                    break;
            }
        }
    }
    
}
