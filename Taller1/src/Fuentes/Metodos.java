
package Fuentes;

public class Metodos {
    private int arreglo[];
    
    public void bubleSort(){
        int aux;
        for(int i=0; i<this.arreglo.length; i++){
            for(int j=0; j<this.arreglo.length-1;j++){
                if(this.arreglo[j]>this.arreglo[j+1]){
                    aux=this.arreglo[j];
                    this.arreglo[j]=this.arreglo[j+1];
                    this.arreglo[j+1]=aux;
                }
            }
        }
    }

    public void selectSort(){
        int a,b, aux;
        for(int i=0; i<this.arreglo.length-1; i++){
            a=this.arreglo[i];
            b=i;
            for(int j=i+1; j<this.arreglo.length;j++){
                if(this.arreglo[j]<a){
                a=this.arreglo[j];
                b=j;
                }
            }
            aux=this.arreglo[i];
            this.arreglo[i]=a;
            this.arreglo[b]=aux;
        }
    }

    public void insertionSort(){
        int a;
        for(int i=0; i<this.arreglo.length-1; i++){
            for(int j=0; j<i+1; j++){
                if(this.arreglo[j]>this.arreglo[i+1]){
                a=this.arreglo[j];
                this.arreglo[j]=this.arreglo[i+1];
                this.arreglo[i+1]=a;
                }
            }

        }
    }
}
