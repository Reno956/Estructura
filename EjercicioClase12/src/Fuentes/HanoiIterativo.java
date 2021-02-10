
package Fuentes;

public class HanoiIterativo {
    char [] pilaO,pilaD,pilaX;
    int [] pilaN;

    public HanoiIterativo(int n) {
        pilaD = new char[n];
        pilaO = new char[n];
        pilaX = new char[n];
        pilaN = new int[n];
    }
    
    public void Hanoi(int n, char origen,  char destino, char auxiliar){
        int tope = 0;
        char aux;
        boolean flag = false;
        while(n>0 && flag==false){
            while(n>1){
                pilaN[tope]=n;
                pilaO[tope]=origen;
                pilaD[tope]=destino;
                pilaX[tope]=auxiliar;
                tope++;
                n--;
                aux=destino;
                destino=auxiliar;
                auxiliar=aux;
            }
            System.out.println("Mover disco de " + origen + " a " + destino);
            flag=true;
            if(tope>0){
                n=pilaN[tope-1];
                origen=pilaO[tope-1];
                destino=pilaD[tope-1];
                auxiliar=pilaX[tope-1];
                tope--;
                System.out.println("Mover disco de " + origen + " a " + destino);
                n--;
                aux=origen;
                origen=auxiliar;
                auxiliar=aux;
                flag=false;
            }
        }
    }
}
