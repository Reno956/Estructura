
package Fuentes;

import java.util.Scanner;


public class OrdenamientoQuickSort {

   
    public static void main(String[] args) {
        int[] arreglo={79,21,15,99,88,65,75,85,76,46,84,24};
        
        System.out.println("Lista inicial: " + imprimir(arreglo));
        quickSort(arreglo, 0, arreglo.length-1);
        System.out.println("Lista ordenada: " + imprimir(arreglo));
    }
    
    public static void quickSort(int[] arreglo,int i,int j){
        int posCent=(i+j)/2;
        int pivote=arreglo[posCent];
        int ini=i;
        int fin=j;
        do{
            while (arreglo[j]>pivote) {                
                j--;
            }
            while (arreglo[i]<pivote) {                
                i++;
            }
            if(i<=j){
                intercambiar(arreglo, i, j);
                i++;
                j--;
                System.out.println(imprimir(arreglo));
            }
        }while(i<=j);
        if(ini<j){
            quickSort(arreglo, ini, j);
        }
        if(i<fin){
            quickSort(arreglo, i, fin);
        }
    }
    
    public static void intercambiar(int[] arreglo,int i,int j){
        int aux=arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=aux;
    }
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
