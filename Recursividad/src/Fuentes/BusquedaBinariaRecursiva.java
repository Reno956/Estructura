
package Fuentes;

public class BusquedaBinariaRecursiva {

    public static void main(String[] args) {
        int[] arreglo={5,6,8,9,13,16,18,19,20,24};
    }
    
    public static int busquedaBinaria(int [] arreglo,int num,int der,int izq){
        int cen=(der+izq)/2;
        if(izq > der){
            return -1;
        }
        if(num==arreglo[cen]){
            return cen;
        } else{
            if(num>arreglo[cen]){
                return busquedaBinaria(arreglo, num, der, cen+1);
            } else{
                return busquedaBinaria(arreglo, num, cen-1, izq);
            }
        }
    }
}
