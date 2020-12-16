
package Fuentes;

public class Ordenamiento {

    public static void main(String[] args) {
        int[] arreglo={15,67,8,16,44,27,12,35};
        long end=0;
        long start = System.currentTimeMillis();
        System.out.println("Lista inicial: " + imprimir(arreglo));
        Ordenamiento(arreglo);
        System.out.println("\nLista ordenada: " + imprimir(arreglo));
        end+=(System.currentTimeMillis()-start);
        System.out.println("Tiempo: " + end + " ms");
    }
    
    public static void Ordenamiento(int[] arreglo){
        int izq=0;
        int der=arreglo.length-1;
        int k=arreglo.length-1;
        int m=1;
        boolean aux=true;
        while(der>=izq){
           for(int l=der; l>izq;l--){
               if(arreglo[l-1]>arreglo[l]){
                   intercambiar(arreglo, l-1, l);
                   k=l;
                   aux=false;
               }
           } 
           if(aux){
               break;
           }
           System.out.println("\nPasada: " + m);
           System.out.println("Etapa 1: \n" + imprimir(arreglo));
           izq=k;
           for(int l=izq;l<=der;l++){
               if(arreglo[l-1]>arreglo[l]){
                   intercambiar(arreglo, l-1, l);
                   k=l;
               }
           }
           System.out.println("Etapa 2: \n" + imprimir(arreglo));
           der=k-1;
           m++;
           aux=true;
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
