
package Fuentes;

public class ListaPila {
    NodoPila tope;

    public ListaPila() {
        tope=null;
    }
    
    public boolean estaVacia(){
        return (tope==null);
    }
    
    public ListaPila añadir(String nombre){
        NodoPila nuevo=new NodoPila(nombre);
        nuevo.enlace=tope;
        tope=nuevo;
        return this;
    }
    
    @Override
    public String toString() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            NodoPila p=tope;
            while(p!=null){
                salida+=p.nombre + " ";
                p=p.enlace;
            }
        }
        return salida;
    }
}
