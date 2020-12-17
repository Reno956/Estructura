
package Fuentes;

import java.util.Scanner;

public class BinarySearch {
private int [] arrA;

    public static void main(String[] args) {
        //int [] arr = {2,5,8,10,14,44,77,78,99};
        int[] arr = {3,8,34,12,84,54,110,91};
        Scanner target = new Scanner(System.in);
        long end=0;
        long start = System.currentTimeMillis();
        System.out.println("Busqueda Binaria");
        System.out.print( "Ingrese el numero: " );
        int a1 = target.nextInt();    
        quickSort(arr, 0, arr.length-1);
        BinarySearch b = new BinarySearch(arr);
        System.out.println("El elemento "+ a1 + " esta presente en el array ?:" + b.Search(0, arr.length-1, a1));
        target.close();
        end+=(System.currentTimeMillis()-start);
        System.out.println("Tiempo: " + end + " ms");
    }
    
    public Boolean Search(int low,int high, int target){
        if(low>high){
            return false;
        }
        int mid = low + ((high - low) / 2);
        if(arrA[mid]==target)return true;
        else if (arrA[mid]>target) return Search(low,mid-1,target);
        else return Search(mid+1,high,target);
    }
    
    public BinarySearch(int [] arrA){
        this.arrA = arrA;
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
