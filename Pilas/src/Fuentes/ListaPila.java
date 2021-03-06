
package Fuentes;

public class ListaPila {
    NodoPila tope;

    public ListaPila() {
        tope=null;
    }
    
    public boolean pilaVacia(){
        return (tope==null);
    }
    
    public ListaPila añadir(int dato){
        NodoPila nuevo=new NodoPila(dato);
        nuevo.setEnlace(tope);
        tope=nuevo;
        return this;
    }
    
    public NodoPila quitarPila(){
        NodoPila actual=null;
        if(!pilaVacia()){
            actual=tope;
            tope=tope.getEnlace();
            actual.setEnlace(null);
        }
        return actual;
    }
    
    @Override
    public String toString() {
        String salida="";
        if(pilaVacia()){
            salida="Pila Vacia";
        } else {
            NodoPila actual=tope;
            while(!pilaVacia()){
                actual=quitarPila();
                salida+=actual.getDato() + "\n";
            }
        }
        return salida;
    }
}
