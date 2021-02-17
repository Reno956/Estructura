
package Fuentes;

public class ListaCola {
    NodoCola cabeza;
    
    public ListaCola(){
        cabeza=null;
    }
    
    public boolean colaVacia(){
        return (cabeza==null);
    }
}
