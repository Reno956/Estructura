
package Fuentes;


public class HanoiRecursivo {
    public void Hanoi(int n, char origen,  char destino, char auxiliar){
        if(n==1){
            System.out.println("Mover disco de " + origen + " a " + destino);
        } else {
           Hanoi(n-1, origen, auxiliar, destino);
           System.out.println("Mover disco de "+ origen + " a " + destino);
           Hanoi(n-1, auxiliar, destino, origen);
        }
    }
}
