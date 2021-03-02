
package Fuentes;

public class Ejercicio2 {
    int inicio;
    int fin;
    int tam;
    int[] cola;
    private static final int capacidad = 120;
    
    public Ejercicio2(){
        cola=new int[capacidad];
        inicio=0;
        fin=0;
        tam=0;
    }
    
    public void insertar(int dato){
        if(tam==capacidad){
            System.out.println("COLA LLENA");
        }
        else{
            tam++;
            cola[fin]=dato;
            if(fin==cola.length-1)
                fin=0;
            else
                fin++;
        }
    }
    
    public int getTam(){
        return tam;
    }
}
