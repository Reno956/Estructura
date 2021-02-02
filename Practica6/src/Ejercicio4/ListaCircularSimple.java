
package Ejercicio4;

public class ListaCircularSimple {
    private Nodo inicio;
    private Nodo ultimo;

    public ListaCircularSimple() {
        this.inicio=null;
        this.ultimo = null;
    }
    
    public boolean estaVacia(){
        return (inicio==null);
    }
    
     public void añadirInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setSiguiente(inicio);
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
    }
     
    public boolean eliminaDato(int dato){
        boolean flag=false;
        if (inicio.getDato()== dato) {
            inicio = inicio.getSiguiente();
            ultimo.setSiguiente(inicio); 
            flag=true;
        } else{
            Nodo p = inicio;
            while(p.getSiguiente().getDato()!= dato){
                p = p.getSiguiente();
            }
            if (p.getSiguiente() == ultimo) {
                p.setSiguiente(inicio);
                ultimo = p;
            } else {
                Nodo siguiente = p.getSiguiente();
                p.setSiguiente(siguiente.getSiguiente());  
            }
            flag=true;
        }
        return flag;
    }
     
    @Override
    public String toString() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=this.inicio;
            do{
                salida+=p.getDato() + " ";
                p=p.getSiguiente();
            }while(p != inicio);
            
        }
        return salida;
    } 
}
