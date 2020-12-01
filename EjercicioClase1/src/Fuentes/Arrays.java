
package Fuentes;

import java.util.Random;

public class Arrays {
    private int[] array;

    public Arrays() {
    }

    public Arrays(int N) {
        this.array = new int[N];
    }
    
    public void setArray(int a, int b){
        Random num=new Random();
        for(int i=0;i<array.length;i++){
            this.array[i]=num.nextInt(b-a+1)+a;
        }
    }

    @Override
    public String toString() {
        String salida="";
        for(int i=0;i<array.length;i++){
            salida+=this.array[i] + " ";
        }
        return salida;
    }
    
}
