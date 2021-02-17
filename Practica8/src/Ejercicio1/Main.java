
package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        ListaPila lista=new ListaPila();
        lista.insertar("Lorena");
        lista.insertar("Isabela");
        lista.insertar("Andrea");
        lista.insertar("Patricia");
        System.out.println("Elementos de la pila:");
        System.out.println(lista.mostrar());
        System.out.println("Elementos despues de quitar un elemento:");
        System.out.println("Elementos de la pila:");
        lista.quitar();
        System.out.println(lista.mostrar());
        System.out.println("El elemento que esta en la cima es:");
        System.out.println(lista.cimaPila());
        System.out.println("\nElementos despues de limpiar la Pila:");
        System.out.println("Elementos de la pila:");
        lista.limpiarPila();;
        System.out.println(lista.mostrar());
    }
}
