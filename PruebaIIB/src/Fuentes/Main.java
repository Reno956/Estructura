
package Fuentes;

public class Main {

    public static void main(String[] args) {
        Ejercicio2 eje = new Ejercicio2();
        eje.insertar(0);
        eje.insertar(1);
        eje.insertar(2);
        eje.insertar(3);
        System.out.println("El tamaño actual es: "+eje.getTam());
        for(int i = 0;i<100;i++){
            eje.insertar(i);
        }
        System.out.println("El tamaño actual es: "+eje.getTam());
    }
}
