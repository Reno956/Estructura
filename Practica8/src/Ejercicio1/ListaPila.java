
package Ejercicio1;

public class ListaPila {
    NodoPila tope;

    public ListaPila() {
        tope=null;
    }
    
    public boolean pilaVacia(){
        return (tope==null);
    }
    
    public ListaPila insertar(String dato){
        NodoPila nuevo=new NodoPila(dato);
        nuevo.setEnlace(tope);
        tope=nuevo;
        return this;
    }
    
    public NodoPila quitar(){
        NodoPila actual=null;
        if(!pilaVacia()){
            actual=tope;
            tope=tope.getEnlace();
            actual.setEnlace(null);
        }
        return actual;
    }
    
    public String cimaPila(){
        String salida="Pila Vacia";
        if(!pilaVacia()){
            salida=tope.getDato();
        }
        return salida;
    }
    
    public void limpiarPila(){
        tope=null;
    }
    
    public String mostrar(){
        String salida="";
        if(pilaVacia()){
            salida="Pila Vacia";
        } else {
            NodoPila actual=tope;
            while(actual!=null){
                salida+=actual.getDato() + "\n";
                actual=actual.getEnlace();
            }
        }
        return salida;
    }
    
    @Override
    public String toString() {
        String salida="";
        if(pilaVacia()){
            salida="Pila Vacia";
        } else {
            NodoPila actual=tope;
            while(!pilaVacia()){
                actual=quitar();
                salida+=actual.getDato() + "\n";
            }
        }
        return salida;
    }
}
