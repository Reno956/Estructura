
package Lineal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BusquedaLineal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc=new Scanner(System.in);
        Operar op=new Operar();
        int key;
        int [] arreglo=op.operar();
        System.out.println("Lista inicial: " + imprimirRegistros(arreglo));
        System.out.println("Ingrese el elemnto a buscar");
        key=sc.nextInt();
        imprimirRegistroEncontrado(busquedaLineal(arreglo, key));
    }
    
    public static void imprimirRegistroEncontrado(int pos){
        if(pos==-1){
            System.out.println("El elemnto no ha sido encontrado");
        } else {
            System.out.println("El elemnto se encuentra en el indice: " + (pos));
        }
    } 
    
    public static int busquedaLineal(int [] arreglo,int key){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static String imprimirRegistros(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
