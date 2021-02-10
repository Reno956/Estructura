
package Fuentes;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaCircularDoble lista=new ListaCircularDoble();
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int n;
        System.out.println("Ingrese el tamaño de la lista:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            lista=lista.añadirInicio(rd.nextInt(n)+1);
        }
        System.out.println(lista.imprimirPrimero());
    }
}
