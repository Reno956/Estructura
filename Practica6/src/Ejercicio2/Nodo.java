
package Ejercicio2;

public class Nodo {
    int dato;
    Nodo enlace;

    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = null;
    }
    
    public Nodo(int dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }
    
    public int getDato(){
        return dato;
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}
