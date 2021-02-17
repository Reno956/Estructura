
package Ejercicio2;

public class NodoCola {
    private String dato;
    private NodoCola enlace;

    public NodoCola(String dato) {
        this.dato = dato;
        this.enlace=null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoCola getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoCola enlace) {
        this.enlace = enlace;
    }
}
