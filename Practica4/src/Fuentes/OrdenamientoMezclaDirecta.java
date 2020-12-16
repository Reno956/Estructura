
package Fuentes;

import java.util.Scanner;

public class OrdenamientoMezclaDirecta {

    public static void main(String[] args) {
        //int[] arregloF = {25,33,15,18,21,07,12,36,84,90,19,38,40,22,64,77,29,36,11};
        int[] arregloF ={9,75,14,68,29,17,31,25,4,5,13,18,72,46,61};
        int longi = arregloF.length;
        int[] arregloF1=new int[longi/2+1];
        int[] arregloF2=new int[longi/2];
        
        System.out.println("Lista inicial: " + imprimir(arregloF) + "\n");
        OrdenarMezclaDirecta(arregloF, arregloF1, arregloF2, longi);
        System.out.println("Lista ordenada: " + imprimir(arregloF));
    }
    
    public static void OrdenarMezclaDirecta(int[] F,int[] F1,int[] F2,int N){
        int i=1;
        int j=1;
        while(i<=(N+1)/2){
            Particiona(F, F1, F2, i);
            Fusiona(F, F1, F2, i);
            System.out.println("Pasada: " + j);
            System.out.println("Lista 1: " + imprimir(F1));
            System.out.println("Lista 2: " + imprimir(F2));
            System.out.println("Lista : " + imprimir(F) + "\n");
            j++;
            i=i*2;
        }
    }
    
    public static void Particiona(int[] F,int[] F1,int[] F2,int N){
        int i=0;
        int k,l;
        int j=0;
        int m=0;
        while(i<F.length){
            k=0;
            while(k<N && i<F.length){
                intercambiar(F1, j, F[i]);
                k++;
                i++;
                j++;
            }
            l=0;
            while(l<N && i<F.length){
                intercambiar(F2, m, F[i]);
                l++;
                i++; 
                m++;
            }
        }
    }
    
    public static void Fusiona(int[] F,int[] F1,int[] F2,int N){
        boolean flag1=true;
        boolean flag2=true;
        int aux1=0;
        int aux2=0;
        int i=0;
        int j=0;
        int k,l;
        int m=0;
        if(i<F1.length){
            aux1=F1[i];
            flag1=false;
        }
        if(j<F2.length){
            aux2=F2[j];
            flag2=false;
        }
        while((i<F1.length || flag1==false) && (j<F2.length || flag2==false)){
            k=0;
            l=0;
            while((k<N && flag1==false) && (l<N && flag2==false)){
                if(aux1<=aux2){
                    intercambiar(F, m, aux1);
                    int a=F[m];
                    flag1=true;
                    k++;
                    m++;
                    i++;
                    if(i<F1.length){
                        aux1=F1[i];
                        flag1=false;
                    }
                } else {
                    intercambiar(F, m, aux2);
                    int a=F[m];
                    flag2=true;
                    l++;
                    m++;
                    j++;
                    if(j<F2.length){
                        aux2=F2[j];
                        flag2=false;
                    }
                }
            }
            while(k<N && flag1==false){
                intercambiar(F, m, aux1);
                int a=F[m];
                flag1=true;
                k++;
                m++;
                i++;
                if(i<F1.length){
                    aux1=F1[i];
                    flag1=false;
                }
            }
            while(l<N && flag2==false){
                intercambiar(F, m, aux2);
                int a=F[m];
                flag2=true;
                l++;
                m++;
                j++;
                if(j<F2.length){
                    aux2=F2[j];
                    flag2=false;
                }
            }
        }
        if(flag1==false){
            intercambiar(F, m, aux1);
            m++;
            i++;
        }
        if(flag2==false){
            intercambiar(F, m, aux2);
            m++;
            j++;
        }
        while(i<F1.length){
            intercambiar(F, m, F1[i]);
            m++;
            i++;
        }
        while(j<F2.length){
            intercambiar(F, m, F2[j]);
            m++;
            j++;
        }
    }
    
    public static void intercambiar(int[] arreglo,int i,int aux){
        arreglo[i]=aux;
    }
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
