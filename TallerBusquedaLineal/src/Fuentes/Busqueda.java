
package Fuentes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //int[] arreglo={5,8,6,9,14,18,13,17,20,24};
        //int[] arreglo={5,6,8,9,13,16,18,19,20,24};
        Scanner sc=new Scanner(System.in);
        Operar op=new Operar();
        int key;
        int [] arreglo=op.operar();
        //op.operar();
        System.out.println("Lista inicial: " + imprimir(arreglo));
        System.out.println("Ingrese el elemnto a buscar");
        key=sc.nextInt();
        int pos=searchLineal(arreglo, key);
        if(pos==-1){
            System.out.println("El elemnto no ha sido encontrado");
        } else {
            System.out.println("El elemnto se encuentra en la posicion: " + (pos+1));
        }
        
    }

    public static int searchLineal(int [] arreglo,int key){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
