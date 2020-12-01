
package Fuentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaPersonas {
    private List <Persona> personas;

    public ListaPersonas() {
        personas =new <Persona>ArrayList();
    }
    
    public void addPersona(Persona persona){
        personas.add(persona);
    }

    public void sortNombre(){
        Collections.sort(personas,new ComparadorNombre());
    }
    
    public void sortDireccion(){
        Collections.sort(personas,new ComparadorDireccion());
    }
    
    public String getDatos(Persona per){
        Iterator<Persona> it = personas.iterator();
        this.sortNombre();
        String salida="";
        while(it.hasNext()){
            String nombre=it.next().nombreCompleto();
            if(nombre.equalsIgnoreCase(per.nombreCompleto())){
                salida=it.toString();
            } 
        }
        return salida;
    }
    
    public boolean mismaDireccion(Persona per){
        Iterator<Persona> it = personas.iterator();
        this.sortDireccion();
        boolean op=false;
        while(it.hasNext()){
            String direc=it.next().getDreccion();
            if(direc.equalsIgnoreCase(per.getDreccion())){
                op=true;
            } 
        }
        return op;
    }
    
    public boolean mismoNombre(Persona per){
        Iterator<Persona> it = personas.iterator();
        this.sortNombre();
        boolean op=false;
        while(it.hasNext()){
            String nombre=it.next().nombreCompleto();
            if(nombre.equalsIgnoreCase(per.nombreCompleto())){
                op=true;
            } 
        }
        return op;
    }
    
    @Override
    public String toString() {
        String salida ="";
        for(Persona aux: personas){
            salida+=aux.nombreCompleto() + "\n";
        }
        return salida;
    }
    
}
