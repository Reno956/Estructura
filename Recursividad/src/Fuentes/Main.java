
package Fuentes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista=new Lista();
        Nodo nuevo;
        
        int num;
        System.out.println("Ingrese un numero: ");
        num=sc.nextInt();
        System.out.println("\nFactorial de un numero");
        System.out.println("El factorial es : " + factorial(num));
        System.out.println("\nFibonacci de un numero");
        System.out.println("El Fibonacci es: " + fibonacci(num));
        System.out.println("\nLista Recursiva");
        for(int i=0;i<num;i++){
            lista.insetar(i);
        }
        nuevo=lista.obtenerNodo();
        lista.imprimirRecursivo(nuevo);
        System.out.println("\nBusqueda Binaria Recursiva");
    }
    
    public static long fibonacci(long num){
        if (num == 0 || num == 1){ //caso base
            return num;
        }else {
            return fibonacci(num-1) + fibonacci(num-2);  //caso recursiva
        }
        
    }
    
    public static long factorial(long num){
        if(num==0){
            return 1;
        } else{
            return num*factorial(num-1);
        }
    }
    
    
    public static String imprimir(int [] arreglo){
        String salida="";
        for(int i=0;i<arreglo.length;i++){
            salida+=arreglo[i] + " ";
        }
        return salida;
    }
}
