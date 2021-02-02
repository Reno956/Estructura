
package Ejercicio4;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo ( int dato ) {
        this.dato = dato;
        this.siguiente=null;
    } 
    
    public int getDato() {
        return this.dato;
    }
    
    public void setSiguiente( Nodo siguiente ) {
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente () {
        return this.siguiente;
    }
}
