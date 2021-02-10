
package Fuentes;

public class ListaCircularDoble {
    private Nodo primero;
    private Nodo ultimo;

    public ListaCircularDoble() {
        this.primero = null;
    }
    
    public boolean estaVacia(){
        return (this.primero==null);
    }
    
    public ListaCircularDoble añadirInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (!estaVacia()) {
            ultimo=primero.getAnterior();
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
        } 
        primero=nuevo;
        return this;
    }
    
    public ListaCircularDoble añadirFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero=nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
        }
        ultimo=nuevo;
        ultimo.setSiguiente(primero);
        primero.setAnterior(ultimo);
        return this;
    }
    
    public String imprimirPrimero() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=this.primero;
            do{
                salida+=p.getDato() + " ";
                p=p.getSiguiente();
            }while(p != this.primero);
            
        }
        return salida;
    } 
    
    public String imprimirUltimo() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=this.ultimo;
            do{
                salida+=p.getDato() + " ";
                p=p.getAnterior();
            }while(p!=this.ultimo);
        }
        return salida;
    } 
}
