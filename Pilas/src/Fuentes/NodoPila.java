
package Fuentes;

public class NodoPila {
    private int dato;
    private NodoPila enlace;

    public NodoPila(int dato) {
        this.dato = dato;
        this.enlace=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoPila getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoPila enlace) {
        this.enlace = enlace;
    }
}
