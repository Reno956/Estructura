
package Fuentes;

public class ListaCircular {
    Nodo inicio;

    public ListaCircular() {
        this.inicio = null;
    }
    
    public boolean estaVacia(){
        return (inicio==null);
    }
    
    public ListaCircular añadirInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        if(inicio!=null){
            nuevo.setEnlace(inicio.getEnlace());
            inicio.setEnlace(nuevo);
        }
        inicio=nuevo;
        return this;
    }
    
    @Override
    public String toString() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=inicio;
            while(p!=null){
                salida+=p.getDato() + " ";
                p=p.getEnlace();
            }
        }
        return salida;
    }
}
