
package Fuentes;

public class Persona {
   private String nombre,apellido,dreccion;
   private long cedula,telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dreccion, long cedula, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dreccion = dreccion;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDreccion() {
        return dreccion;
    }

    public long getCedula() {
        return cedula;
    }

    public long getTelefono() {
        return telefono;
    }
    
    public String nombreCompleto(){
        String nomComp=this.getNombre()+" "+this.getApellido();
        return nomComp;
    }
    @Override
    public String toString() {
        return "Nombre=: " + nombre + " Apellido: " + apellido + "\nDireccion: " + dreccion + "\nCedula: " + cedula + "\nTelefono: " + telefono + "\n";
    }
    
}
