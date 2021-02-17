
package Ejercicio1;

public class NodoPila {
    private String dato;
    private NodoPila enlace;

    public NodoPila(String dato) {
        this.dato = dato;
        this.enlace=null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoPila getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoPila enlace) {
        this.enlace = enlace;
    }
}
