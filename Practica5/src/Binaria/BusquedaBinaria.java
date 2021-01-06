
package Binaria;

import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] arreglo={5,6,8,9,13,16,18,19,20,24};
        int[] arreglo = {3,8,34,12,84,54,110,91};
        int numero;
        System.out.println("Lista inicial: " + imprimirLista(arreglo));
        ordenarLista(arreglo, 0, arreglo.length-1);
        System.out.println("Lista ordenada: " + imprimirLista(arreglo));
        System.out.println("Ingrese el elemento a buscar: ");
        numero=sc.nextInt();
        busquedaBinaria(arreglo, numero);
    }
    
    public static void busquedaBinaria(int [] arreglo,int num){
        int izq=0;
        int der=arreglo.length-1;
        int cen;
        boolean flag=false;
        while(izq<=der){
            cen=(der+izq)/2;
            if(num==arreglo[cen]){
                System.out.println("El elemento se encuentra en el indice: " + cen);
                flag=true;
                break;
            } else{
                if(num>arreglo[cen]){
                    izq=cen+1;
                } else{
                    der=cen-1;
                }
            }
        }
        if(flag==false){
            System.out.println("Elemento no encontrado");  
        }
    }
    
    public static void ordenarLista(int[] arreglo,int i,int j){
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
            ordenarLista(arreglo, ini, j);
        }
        if(i<fin){
            ordenarLista(arreglo, i, fin);
        }
    }
    
    public static String imprimirLista(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
    
    public static void intercambiar(int[] arreglo,int i,int j){
        int aux=arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=aux;
    }
}
