
package Fuentes;

public class Arbol {
    NodoArbol raiz;

    public Arbol() {
        this.raiz=null;
    }
    
    public boolean arbolVacio(){
        return this.raiz==null;
    }
    
    public void insertar(int dato){
        if(arbolVacio()){
            this.raiz = new NodoArbol(dato);
        } else{
            this.raiz.insertar(dato);
        }
    }
    
    public void preOrden(NodoArbol recorre){
        if(recorre!=null){
            System.out.print(recorre.getDato()+" ");
            preOrden(recorre.getIzquierda());
            preOrden(recorre.getDerecha());
        }
    }
    
    public void inOrden(NodoArbol recorre){
        if(recorre!=null){
            inOrden(recorre.getIzquierda());
            System.out.print(recorre.getDato()+" ");
            inOrden(recorre.getDerecha());
        }
    }
    
    public void posOrden(NodoArbol recorre){
        if(recorre!=null){
            posOrden(recorre.getIzquierda());
            posOrden(recorre.getDerecha());
            System.out.print(recorre.getDato()+" ");
        }
    }
}
