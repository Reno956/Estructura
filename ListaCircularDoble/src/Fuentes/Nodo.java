
package Fuentes;

public class Nodo {
    private int dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo ( int dato ) {
        this.dato = dato;
        this.siguiente=this;
        this.anterior=this;
    } 
    
    public int getDato() {
        return this.dato;
    }
    
    public void setSiguiente( Nodo siguiente ) {
        this.siguiente = siguiente;
    }
    
    public void setAnterior (Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Nodo getSiguiente () {
        return this.siguiente;
    }
    
    public Nodo getAnterior () {
        return this.anterior;
    }
}
