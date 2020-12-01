
package Fuentes;

import java.util.Random;

public class Matriz {
    private int[][] matriz;

    public Matriz() {
    }

    public Matriz(int N, int M){
        this.matriz=new int[N][M];
    }
    
    public Matriz sumaMatriz(Matriz  matB){
        Matriz matC;
        matC=new Matriz(this.matriz.length,this.matriz[0].length);
        
        if(this.matriz[0].length==matB.matriz[0].length && this.matriz.length==matB.matriz.length){
            for(int i=0; i<this.matriz.length;i++){
               for(int j=0; j<this.matriz[0].length;j++){
                  matC.matriz[i][j]=this.matriz[i][j] + matB.matriz[i][j];
               }
           }   
       } else {
           matC=null;
        }
        return matC;
    }
    
     public void setMatriz(int a, int b){
        Random num=new Random();
        for(int contadorI=0; contadorI<this.matriz.length;contadorI++){
            for(int contadorJ=0; contadorJ<this.matriz[0].length;contadorJ++){
                 this.matriz[contadorI][contadorJ]= num.nextInt(b-a+1)+a;
            }
         }
    }

    @Override
    public String toString() {
        String salida="";
        for(int i=0; i<this.matriz.length;i++){
            for(int j=0; j<this.matriz[0].length;j++){
                salida+= this.matriz[i][j] + "  ";
            }
            salida+="\n";
         }
        return salida;
    }
}
