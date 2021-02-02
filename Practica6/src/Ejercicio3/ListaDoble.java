
package Ejercicio3;

public class ListaDoble {
    private Nodo ini;
    private Nodo fin;
    
    public ListaDoble() {
        this.ini = null;
        this.fin = null;
    }
    
    public boolean estaVacia(){
        return (ini==null&&fin==null);
    }
    
    public void añadirInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            ini=nuevo;
            fin=nuevo;
        } else {
            nuevo.setSiguiente(ini);
            ini.setAnterior(nuevo);
            ini=nuevo;
        }
    }
    
    public boolean eliminaDato(int dato){
        boolean flag=false;
        if (ini != null){
            Nodo aux = ini;
            Nodo ant = null;
            while (aux != null){
                if (aux.getDato() == dato ){
                    if (ant == null){
                        ini = ini.getSiguiente();
                        aux.setSiguiente(null);
                        aux= ini;
                    }else {
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                    }
                    flag=true;
                }else{
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
        return flag;
    }
    
    @Override
    public String toString() {
        String salida="";
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=ini;
            while(p!=null){
                salida+=p.getDato() + " ";
                p=p.getSiguiente();
            }
        }
        return salida;
    }
}
