
package Fuentes;


public class QuickSort {

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        //int a[] = { 5, 3, 1, 6, 4, 7, 2 };
        int arreglo[] = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        System.out.println("Lista inicial: " + imprimir(arreglo));
        quickSort(arreglo, 0, arreglo.length - 1);
        System.out.println("Lista ordenada: " + imprimir(arreglo));
        //long end = System.currentTimeMillis();
        System.out.println(start + " ");
        System.out.println("Tiempo: " + (System.currentTimeMillis() - start));
    }
    
    public static void quickSort(int[] areeglo ,int inicio, int fin){
        // condicion base
        if (inicio >= fin) {
            return;
        }
        // Reorganizar los elementos a trav�s de pivote.
        int pivot = partition(areeglo, inicio, fin);
        // recursivamente se obtiene la partici�n con los elementos menores que pivot
        quickSort(areeglo, inicio, pivot - 1);
        // recursivamente se obtiene la partici�n con los elementos mayores que pivot
        quickSort(areeglo, pivot + 1, fin);
    }
    
    public static int partition(int[] arreglo, int inicio, int fin){
        // Pick rightmost element as pivot from the array
        int pivot = arreglo[fin];
        // los elementos menores que el pivote ser�n ubicados a la izquierda de pIndex
        // Los elementos m�s que pivote ser�n ubicados a la derecha de pIndex
        // Observaci�n:  elementos iguales pueden ir en cualquier direcci�n
        int pIndex = inicio;
        // cada vez que encontramos un elemento menor o igual a pivote,
        // pIndex se incrementa y ese elemento ser�a ubicado antes del pivote.
        for (int i = inicio; i < fin; i++){
            if (arreglo[i] <= pivot) {
                intercambiar(arreglo, i, pIndex); //mismo proceso con sublista izqda
                pIndex++;
            }
        }
        // Intrcambia pIndex con Pivot
        intercambiar(arreglo, fin, pIndex);
        // devolver pIndex (�ndice del elemento pivote)
        return pIndex;
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
