
package Ejercicio2;

public class ListaSimple {
    Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }
    
    public boolean estaVacia(){
        return (inicio==null);
    }
    
    public void añadirInicio(int dato){
        if(estaVacia()){
            inicio=new Nodo(dato);
        } else{
            inicio=new Nodo(dato, inicio);
        }
    }
    
    public int buscarEnLista(int dato){
        int i=0;
        Nodo p=inicio;
        while(p!=null){
            if(p.getDato()==dato){
                i++;
            }
            p=p.enlace;
        }
        return i;
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
                p=p.enlace;
            }
        }
        return salida;
    }
}
