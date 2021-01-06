
package Fuentes;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        //Renato Padilla
        Scanner sc = new Scanner(System.in);
        int[] arreglo={5,6,8,9,13,16,18,19,20,24};
        int numero;
        System.out.println("Lista inicial: " + imprimir(arreglo));
        System.out.println("Ingrese el elemento a buscar: ");
        numero=sc.nextInt();
        Buscar(arreglo, numero);
    }
    
    public static void Buscar(int [] arreglo,int num){
        int izq=0;
        int der=arreglo.length-1;
        int cen;
        boolean flag=false;
        while(izq<=der){
            cen=(der+izq)/2;
            if(num==arreglo[cen]){
                System.out.println("Bingo: " + cen);
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
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
