
package Fuentes;

import java.util.Scanner;

public class OrdenamientoIntercalado {

    public static void main(String[] args) {
        int[] arregloF1={6,9,18,20,35};
        int[] arregloF2={10,16,25,28,66,82,87};
        int[] arregloF = new int[arregloF1.length+arregloF2.length];
        int longi;
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Ingrese el tamaño del arreglo: ");
        longi=sc.nextInt();
        arreglo=new int[longi];
        System.out.println("Ingrese los elementos del arreglo: ");
        for(int i=0;i<longi;i++){
            arreglo[i]=sc.nextInt();
        }*/
        System.out.println("Lista 1: " + imprimir(arregloF1));
        System.out.println("Lista 2: " + imprimir(arregloF2));
        inrcalacion(arregloF1, arregloF2, arregloF);
        System.out.println("Lista ordenada: " + imprimir(arregloF));
    }
    
    public static void inrcalacion(int[] F1,int [] F2, int [] F){
        boolean flag1=true;
        boolean flag2=true;
        int i=0;
        int j=0;
        int k=0;
        int aux1=0;
        int aux2=0;
        int a=0;
        while((i<F1.length || flag1==false)&&(j<F2.length || flag2==false)){
            if(flag1==true){
                aux1=F1[i];
                flag1=false;
            }
            if(flag2==true){
                aux2=F2[j];
                flag2=false;
            }
            if(aux1<aux2){
                intercambiar(F, k, aux1);
                flag1=true;
                a=F[k];
                k++;
                i++;
            } else {
                intercambiar(F, k, aux2);
                flag2=true;
                a=F[k];
                k++;
                j++;
            }
        }
        
        if(flag1==false){
            intercambiar(F, k, aux1);
            a=F[k];
            k++;
            while(i<F1.length-1){
                i++;
                aux1=F1[i];
                intercambiar(F, k, aux1);
                a=F[k];
                k++;
            }
        }
        if(flag2==false){
            intercambiar(F, k, aux2);
            a=F[k];
            k++;
            while(j<F2.length-1){
                j++;
                aux2=F2[j];
                intercambiar(F, k, aux2);
                a=F[k];
                k++;
            }
        }
    }
    
    public static void intercambiar(int[] arreglo,int i,int aux){
        arreglo[i]=aux;
    }
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
