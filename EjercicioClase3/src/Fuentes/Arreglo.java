
package Fuentes;

import java.util.Random;

public class Arreglo {
    private int[] array;

    public Arreglo() {
    }

    public Arreglo(int N) {
        this.array = new int[N];
    }
    
    public void bubleSort(){
        int a;
        for(int i=0; i<this.array.length; i++){
            for(int j=0; j<this.array.length-1;j++){
                if(this.array[j]>this.array[j+1]){
                a=this.array[j];
                this.array[j]=this.array[j+1];
                this.array[j+1]=a;
                }
            }
        }
    }
    
    public void setArray(){
        Random num=new Random();
        for(int i=0;i<array.length;i++){
            this.array[i]=num.nextInt(100)+1;
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
