
package Fuentes;

import java.util.Comparator;

public class ComparadorDireccion implements Comparator{
    @Override
    public int compare(Object t1, Object t2) {
        Persona per1,per2;
        per1= (Persona)t1;
        per2= (Persona)t2;
        return (per1.getDreccion().compareTo(per2.getDreccion()));
    }
}
