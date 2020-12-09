
import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        int tamaño,opcion;
        long start, end;
      
      Scanner sc=new Scanner(System.in);
     System.out.println("Ingrese el tamaño del vector: ");
     tamaño=sc.nextInt();
     Arreglos ar=new Arreglos(tamaño);
     for(int j=0; j<tamaño;j++){
     System.out.print("ingrese el valor del indice "+j+": ");
     ar.arreglo[j]=sc.nextInt();
     }
     System.out.println("Seleccione el tipo de ordenamiento: ");
     System.out.println("1. Ordenamiento burbuja");
     System.out.println("2. Ordenamiento por seleccion");
     System.out.println("3. Ordenamiento por insercion");
     opcion=sc.nextInt();
     switch(opcion){
         case 1:
             start = System.nanoTime();
             ar.ordenamineto_burbuja();
             end = System.nanoTime();
             System.out.print("Arreglo ordenado por el metodo burbuja: ");
             for(int j=0; j<tamaño;j++){
                   System.out.print(ar.arreglo[j]+" ");
                    }
             System.out.println("\nTiempo de ejecucion: " + (end - start) + " nanosegundos");
             break;
         case 2:
             start = System.nanoTime();
             ar.ordenamientoporseleccion();
             end = System.nanoTime();
             System.out.print("Arreglo ordenado por el metodo de seleccion: ");
             for(int j=0; j<tamaño;j++){
                   System.out.print(ar.arreglo[j]+" ");
                    }
             System.out.println("\nTiempo de ejecucion: " + (end - start) + " nanosegundos");
             break;
         case 3:
             start = System.nanoTime();
             ar.ordenamientoporinsercion();
             end = System.nanoTime();
             System.out.print("Arreglo ordenado por el metodo de insercion: ");
             for(int j=0; j<tamaño;j++){
                   System.out.print(ar.arreglo[j]+" ");
                    }
             System.out.println("\nTiempo de ejecucion: " + (end - start) + " nanosegundos");
             break;
     }
    }
    
}
