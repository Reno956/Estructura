
package Fuentes;

import java.util.Random;

public class Arreglo {
    private int[] Ar;
    Random rd;

    public Arreglo(int n) {
        Ar=new int[n];
        rd=new Random();
        for(int i=0;i<n;i++){
            Ar[i]=rd.nextInt(n)+1;
        }
    }
    
    public int getTamaño(){
        return Ar.length-1;
    }
    
    public void ordVector(int i,int j){
        int posCent=(i+j)/2;
        int pivote=Ar[posCent];
        int ini=i;
        int fin=j;
        do{
            while (Ar[j]>pivote) {                
                j--;
            }
            while (Ar[i]<pivote) {                
                i++;
            }
            if(i<=j){
                intercambiar(Ar, i, j);
                i++;
                j--;
            }
        }while(i<=j);
        if(ini<j){
            ordVector( ini, j);
        }
        if(i<fin){
            ordVector( i, fin);
        }
    }
    
    public String buscarSuma(int num){
        String salida;
        boolean flag=false;
        int a=0;
        int b=0;
        for(int i=0;i<Ar.length-1;i++){
            for(int j=i+1;j<Ar.length;j++){
                if(Ar[i]+Ar[j]==num){
                    flag=true;
                    a=i;
                    b=j;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            salida="Numero encontrados: " + Ar[a] + " + " + Ar[b] + " = " + num;
        }else{
            salida="No existen dos numeros que sumados den como resultado: " + num;
        }
        return salida;
    }
    
    public static void intercambiar(int[] arreglo,int i,int j){
        int aux=arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=aux;
    }

    @Override
    public String toString() {
        String salida="";
        for(int i=0;i<Ar.length;i++){
            salida+=Ar[i];
            salida+=" ";
        }
        return salida;
    }
}
