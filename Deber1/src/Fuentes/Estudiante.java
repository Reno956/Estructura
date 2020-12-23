
package Fuentes;

public class Estudiante {
    private String nombre,aplellido,direccion;
    private long id, telefono;

    public Estudiante(String nombre, String aplellido, String direccion, long id, long telefono) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.direccion = direccion;
        this.id = id;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAplellido(String aplellido) {
        this.aplellido = aplellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAplellido() {
        return aplellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getId() {
        return id;
    }

    public long getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", aplellido=" + aplellido + ", direccion=" + direccion + ", id=" + id + ", telefono=" + telefono + '}';
    }
}
