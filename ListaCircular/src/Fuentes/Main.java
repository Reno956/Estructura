
package Fuentes;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaCircular lista=new ListaCircular();
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        int n;
        System.out.println("Ingrese el tamaño de la lista:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            lista.añadirInicio(rd.nextInt(n));
        }
        System.out.println(lista.toString());
    }
    
}
