
package Fuentes;

import java.util.ArrayList;

public class ListaEstudiante {
    private ArrayList<Estudiante> lista;

    public ListaEstudiante() {
        lista=new ArrayList<Estudiante>();
    }
    
    public void addEstudisnte(Estudiante estudiante){
        lista.add(estudiante);
    }

    @Override
    public String toString() {
        String salida="";
        for(Estudiante aux: lista){
            salida+= aux.toString() +"\n";
        }
        return salida;
    }
    
}
