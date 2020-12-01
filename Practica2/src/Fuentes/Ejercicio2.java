
package Fuentes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] meses = new double[12];
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.####");
        System.out.println("Ingrese los valores mensuales correspondientes: ");
        for(int i=0;i<meses.length;i++){
            System.out.println("Mes numero: " + (i+1));
            meses[i]=sc.nextDouble();
        }
        System.out.println("El promedio es: " + df.format(calcularPromedio(meses)));
        System.out.println("El numero de meses superiores al promedio es: " + (calcularSup(meses)));
    }
    
    public static double calcularPromedio(double aux[]){
        double suma=0;
        for(int i=0;i<aux.length;i++){
            suma+=aux[i];
        }
        return suma/aux.length;
    }
    
    public static int calcularSup(double aux[]){
        int j=0;
        for(int i=0;i<aux.length;i++){
            if(aux[i]>calcularPromedio(aux)){
                j++;
            }
        }
        return j;
    }
}
