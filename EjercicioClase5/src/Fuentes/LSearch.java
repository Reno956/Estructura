
package Fuentes;

import java.util.Scanner;

public class LSearch {

    public static void main(String[] args) {
        //int arr [] = {20, 30, 40, 10, 5, 2, 60, 73};
        int[] arr = {3,8,34,12,84,54,110,91};
        Scanner target = new Scanner(System.in);
        long end=0;
        long start = System.currentTimeMillis();
        System.out.println("Busqueda Lineal");
        System.out.print( "Ingrese el numero: " );
        int a = target.nextInt();
        quickSort(arr, 0, arr.length-1);
        search(arr, a);
        target.close();
        end+=(System.currentTimeMillis()-start);
        System.out.println("Tiempo: " + end + " ms");
    }
    
    static void search(int [] arr, int target){
        for (int guess = 0;  guess <arr.length ;  guess++) {
            if(arr[ guess]==target) {
               System.out.println("Element " + target + " is found at pos: " +  guess);
               return;
            }
        }
        //if here means target is not found
        System.out.println("Element " + target + " is not found in array");
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
}
