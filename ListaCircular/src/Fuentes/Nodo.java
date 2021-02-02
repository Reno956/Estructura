
package Fuentes;

public class Nodo {
    private int dato;
    private Nodo enlace;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = this;
    }
    
    public int getDato(){
        return this.dato;
    }
    
    public Nodo getEnlace(){
        return this.enlace;
    }
    
    public void setDato(int dato){
        this.dato=dato;
    }
    
    public void setEnlace(Nodo enlace){
        this.enlace=enlace;
    }
}
