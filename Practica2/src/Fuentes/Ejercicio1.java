
package Fuentes;

public class Ejercicio1 {
    public static void main(String[] args) {
        int arreglo1[] = {1,2,3,4,5};
        int arreglo2[]= new int[5]; 
        int j=0;
        for(int i=arreglo1.length-1;i>=0;i--){
            arreglo2[j]=arreglo1[i];
            j++;
        } 
        System.out.println("Arreglo 1:");
        for(int i=0;i<arreglo1.length;i++){
            System.out.println(" " + arreglo1[i] + " ");
        }
        System.out.println("Arreglo 2:");
        for(int i=0;i<arreglo2.length;i++){
            System.out.println(" " + arreglo2[i] + " ");
        }
    }
   
}
