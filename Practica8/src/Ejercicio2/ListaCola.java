
package Ejercicio2;

public class ListaCola {
    NodoCola cabeza;
    NodoCola cola;
    int tam;

    public ListaCola() {
        cabeza=null;
        tam=0;
    }
    
    public boolean colaVacia(){
        return (tam==0);
    }
    
    public void insertar(String dato) {
        NodoCola nuevo = new NodoCola(dato);
        if (cabeza == null) {
          cabeza=nuevo;
          cola=nuevo;
        } else {
          cola.setEnlace(nuevo);
          cola=nuevo;
        }
        tam++;
    }
    
    public String quitar() {
        String salida="Cola Vacia";
        if (cabeza != null) {
            salida= cabeza.getDato();
            cabeza=cabeza.getEnlace();
            tam--;
        }
        return salida;
    }
    
    public String primero(){
        String salida="Pila Vacia";
        if(!colaVacia()){
            salida=cabeza.getDato();
        }
        return salida;
    }
    
    public int tam(){
        return tam;
    }
    
    public String mostrar(){
        String salida="";
        int i=0;
        if(colaVacia()){
            salida="Pila Vacia";
        } else {
            NodoCola actual=cabeza;
            while(actual!=null){
                salida+="Elemento " + i + " ";
                salida+=actual.getDato() + "\n";
                actual=actual.getEnlace();
                i++;
            }
        }
        return salida;
    }
}
