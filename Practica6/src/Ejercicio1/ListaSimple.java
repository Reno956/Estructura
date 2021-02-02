
package Ejercicio1;

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
    
    public String numPar(){
        String salida="";
        int i=0;
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=inicio;
            while(p!=null){
                if(p.getDato()%2==0){
                    salida+=p.getDato() + " ";
                    p=p.enlace;
                    i++;
                    if(i==14){
                        i=0;
                        salida+="\n";
                    }
                }else{
                    p=p.enlace;
                }
            }
        }
        return salida;
    }
    
    public String salida(){
        String salida="";
        int i=0;
        if(estaVacia()){
            salida="Lista Vacia";
        } else {
            Nodo p=inicio;
            while(p!=null){
                salida+=p.getDato() + " ";
                p=p.enlace;
                i++;
                if(i==14){
                    i=0;
                    salida+="\n";
                }
            }
        }
        return salida;
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
