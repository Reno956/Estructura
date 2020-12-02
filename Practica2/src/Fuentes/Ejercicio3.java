
package Fuentes;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] proveedores={"Alvear","Betancourt","Cadena","Donoso","Riofrio"};;
        String[] ciudad={"Quito","Ambato","Riobamba","Cuenca","Guayaquil"};
        int[] articulos={14,23,69,10,32};
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        System.out.println("Sistema de visualizacion y modificaion de proveedores.");
        do {            
            String aux;
            int index;
            System.out.println("\nLista de proveedores\n" + printAreglo(proveedores) + "\n");
            System.out.println("1.- Visualizar la informacion de un proveedor.");
            System.out.println("2.- Actualizar la ciudad de residencia de un proveedor.");
            System.out.println("3.- Actualizar el numero de articulos de un proveedor.");
            System.out.println("4.- Eliminar un proveedor.");
            System.out.println("5.- Incorporar un proveedor.");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    aux=sc.next();
                    index=indice(proveedores, aux);
                    if(index==-1){
                        System.out.println("El proveedor no existe");
                    } else{
                        System.out.println("La ciudad del proveedor es: " + ciudad[index]);
                        System.out.println("El numero de articulos es: " + articulos[index]);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    aux=sc.next();
                    index=indice(proveedores, aux);
                    System.out.println("Ingrese la ciudad: ");
                    aux=sc.next();
                    ciudad[index]=aux;
                    System.out.println("La ciudad del proveedor es: " + ciudad[index]);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    aux=sc.next();
                    index=indice(proveedores, aux);
                    System.out.println("Ingrese la cantidad de articulos: ");
                    aux=sc.next();
                    articulos[index]=Integer.parseInt(aux);
                    System.out.println("El numero de articulos es: " + articulos[index]);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    aux=sc.next();
                    index=indice(proveedores, aux);
                    delete(proveedores, ciudad, articulos, aux,index);
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del proveedor: ");
                    aux=sc.next();
                    System.out.println("Ingrese la ciudad: ");
                    String ciu=sc.next();
                    System.out.println("Ingrese la cantidad de articulos:");
                    int art=sc.nextInt();
                    add(proveedores, ciudad, articulos, aux, ciu,art);
            }
            System.out.println("Ingrese 0 si desea finalizar...");
            opcion=sc.nextInt();
        } while (opcion!=0);
    }
    public static void add(String[] arr,String[] ciu,int [] art,String nom,String ciud,int arti){
        String[] newProv=new String[arr.length+1];
        String[] newCiu=new String[arr.length+1];
        int[] newArt=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
                newProv[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
                newCiu[i]=ciu[i];
        }
        for(int i=0;i<arr.length;i++){
                newArt[i]=art[i];
        }
        newProv[arr.length]=nom;
        newCiu[arr.length]=ciud;
        newArt[arr.length]=arti;
        System.out.println("Lista de proveedores: \n" + printAreglo(newProv));
        System.out.println("Lista de ciudades: \n" + printAreglo(newCiu));
        System.out.println("Numero de articulos: \n" + printArrInt(newArt));
    }
    
    public static void delete(String[] arr,String[] ciu,int [] art,String aux,int index){
        int j=0;
        String[] newProv=new String[arr.length-1];
        String[] newCiu=new String[arr.length-1];
        int[] newArt=new int[art.length-1];
        for(int i=0;i<arr.length;i++){
            if(i!=index){
                newProv[j]=arr[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<ciu.length;i++){
            if(i!=index){
                newCiu[j]=ciu[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<art.length;i++){
            if(i!=index){
                newArt[j]=art[i];
                j++;
            }
        }
        System.out.println("Lista de proveedores: \n" + printAreglo(newProv));
        System.out.println("Lista de ciudades: \n" + printAreglo(newCiu));
        System.out.println("Numero de articulos: \n" + printArrInt(newArt));
    }
    
    public static String printAreglo(String[] arr){
        String salida="";
        for(String aux: arr){
            salida+=aux+" ";
        }
        return salida;
    }
    
    public static String printArrInt(int [] arr){
        String salida="";
        for(int aux: arr){
            salida+=aux+" ";
        }
        return salida;
    }
    
    public static int indice(String[] arr,String nom){
        int n=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(nom)){
                n=i;
                break;
            } else{
                n=-1;
            }
        }
        return n;
    }
}
