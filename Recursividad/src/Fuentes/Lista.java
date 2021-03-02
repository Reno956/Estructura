
package Fuentes;

public class Lista {
    Nodo inicio;
    
    public Lista(){
        inicio=null;
    }
    
    public Lista insetar(int dato){
        Nodo nuevo=new Nodo(dato);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
        return this;
    }
    
    public void imprimirRecursivo(Nodo actual){
        if(actual==null){
            System.out.println("null");
        } else{
            System.out.println(actual.getDato());
            imprimirRecursivo(actual.getSiguiente());
        }
    }
    
    public Nodo obtenerNodo(){
        return inicio;
    }
}
