
package Fuentes;

public class NodoArbol {
    NodoArbol izquierda;
    NodoArbol derecha;
    int dato;
    
    public NodoArbol(int dato) {
        this.izquierda = null;
        this.derecha = null;
        this.dato = dato;
    }
    
    public void insertar(int dato){
        if(dato<this.dato){
            if(this.izquierda==null){
                this.izquierda = new NodoArbol(dato);
            } else{
                this.izquierda.insertar(dato);
            }
        } 
        if(dato>this.dato){
            if(this.derecha==null){
                this.derecha = new NodoArbol(dato);
            } else{
                this.derecha.insertar(dato);
            }
        }
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
