
package Fuentes;

public class Main {

    public static void main(String[] args) {
        ListaPila lista=new ListaPila();
        lista.añadir("Juan");
        lista.añadir("Maria");
        lista.añadir("Pedro");
        lista.añadir("Luis");
        System.out.println(lista.toString());
    }
    
}
