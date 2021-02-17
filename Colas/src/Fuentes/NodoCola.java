
package Fuentes;

public class NodoCola {
    private int dato;
    private NodoCola enlace;
    
    public NodoCola(int dato) {
        this.dato = dato;
        this.enlace=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCola getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoCola enlace) {
        this.enlace = enlace;
    }
}
