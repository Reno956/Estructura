
package Fuentes;

import java.util.Scanner;

public class OrdenamientoInterno {

    public static void main(String[] args) {
        int[] arreglo;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        c=sc.nextInt();
        arreglo=new int[c];
        System.out.println("Ingrese los elementos del arreglo: ");
        for(int i=0;i<c;i++){
            arreglo[i]=sc.nextInt();
        }
        System.out.println("Lista inicial: " + imprimir(arreglo));
        //bubleSort(arreglo);
        //selectSort(arreglo);
        insertSort(arreglo);
    }
    
    public static void insertSort(int [] arreglo){
        int aux,j;
        for(int i=1; i<arreglo.length; i++){
            aux=arreglo[i];
            j=i-1;
            while (j>=0 && arreglo[j]>aux){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=aux;
            System.out.println(imprimir(arreglo));
        }
        System.out.println("Lista ordenada Insercion: " + imprimir(arreglo));
    }
    
    public static void selectSort(int[] arreglo){
        int pos;
        for(int i=0; i<arreglo.length-1; i++){
            pos=i;
            for(int j=i+1; j<arreglo.length;j++){
                if(arreglo[j]<arreglo[pos]){
                pos=j;
                }
            }
            if(i!=pos){
                intercambiar(arreglo, i, pos);
                System.out.println(imprimir(arreglo));
            }
        }
        System.out.println("Lista ordenada Seleccion: " + imprimir(arreglo));
    }
    
    public static void bubleSort(int [] arreglo){
        for(int i=0; i<arreglo.length-1; i++){
            for(int j=i+1; j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    intercambiar(arreglo, i, j);
                    System.out.println(imprimir(arreglo));
                }
            }
        }
        System.out.println("Lista ordenada Burbuja: " + imprimir(arreglo));
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
    
    public static void insertSortRev(int [] aux){
        int extra,j;
        int[] arreglo=new int[aux.length];
        System.arraycopy(aux, 0, arreglo, 0, aux.length);
        for(int i=1; i<arreglo.length; i++){
            extra=arreglo[i];
            j=i-1;
            while (j>=0 && arreglo[j]>extra){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=extra;
            System.out.println(imprimir(arreglo));
        }
        j=aux.length-1;
        for(int i=0; i<aux.length; i++){
            aux[j]=arreglo[i];
            j--;
        }
        System.out.println("Lista ordenada Insercion: " + imprimir(aux));
    }
    
    public static void selectSortRev(int[] aux){
        int pos;
        int[] arreglo=new int[aux.length];
        System.arraycopy(aux, 0, arreglo, 0, aux.length);
        for(int i=0; i<arreglo.length-1; i++){
            pos=i;
            for(int j=i+1; j<arreglo.length;j++){
                if(arreglo[j]<arreglo[pos]){
                    pos=j;
                }
            }
            if(i!=pos){
                intercambiar(arreglo, i, pos);
                System.out.println(imprimir(arreglo));
            }
        }
        pos=aux.length-1;
        for(int i=0; i<aux.length; i++){
            aux[pos]=arreglo[i];
            pos--;
        }
        System.out.println("Lista ordenada Seleccion: " + imprimir(aux));
    }
    
    public static void bubleSortRev(int [] arreglo){
        int[] aux=new int[arreglo.length];
        int k=arreglo.length-1;
        System.arraycopy(arreglo, 0, aux, 0,arreglo.length);
        for(int i=0; i<aux.length-1; i++){
            for(int j=i+1; j<aux.length;j++){
                if(aux[i]>aux[j]){
                    intercambiar(aux, i, j);
                }
            }
            System.out.println(imprimir(aux));
        }
        for(int i=0; i<aux.length; i++){
            arreglo[k]=aux[i];
            k--;
        }
        System.out.println("Lista ordenada Burbuja: " + imprimir(arreglo));
    }
    
    public static void bubleSortMod(int [] arreglo){
        int j,k;
        for(int i=0; i<arreglo.length-1; i++){
            j=i+1;
            k=0;
            while(j<arreglo.length){
                if(arreglo[i]>arreglo[j]){
                    intercambiar(arreglo, i, j);
                } else {
                    k++;
                }
                j++;
                if(k==arreglo.length-1){
                    i=arreglo.length;
                }
            }
            System.out.println(imprimir(arreglo));
        }
        System.out.println("Lista ordenada Burbuja: " + imprimir(arreglo));
    }
}
