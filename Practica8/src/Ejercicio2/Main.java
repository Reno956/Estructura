
package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        ListaCola lista= new ListaCola();
         lista.insertar("Lorena");
        lista.insertar("Isabela");
        lista.insertar("Andrea");
        lista.insertar("Patricia");
        System.out.println("Elementos de la cola:");
        System.out.println(lista.mostrar());
        System.out.println("Elementos despues de quitar un elemento:");
        System.out.println("Elementos de la cola:");
        lista.quitar();
        System.out.println(lista.mostrar());
        System.out.println("El elemento que esta en el frente es:");
        System.out.println(lista.primero());
        System.out.println("\nTamaño de la cola: " + lista.tam());
    }
}
