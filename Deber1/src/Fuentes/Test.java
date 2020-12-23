
package Fuentes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static String path = "C:\\Users\\Renato\\Documents\\GitHub\\Estructura\\Deber1\\estudiantes.txt";
    static Estudiante estudiante;
    static OperacionesArchivo operar;
    static File archivo;
    static BufferedWriter salida;
    
    public static void main(String[] args) throws IOException {
        ArrayList<Estudiante> lista=new ArrayList<Estudiante>();
        operar=new OperacionesArchivo();
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int opcion=0;
        while(flag==0){
            System.out.println("Ingrese los datos del estudiante");
            estudiante=Leer();
            lista.add(estudiante);
            System.out.println("Si desea agregar otro estudiante ingrese 0");
            flag=sc.nextInt();
        }
        flag=0;
        while(flag==0){
            System.out.println("1.- Ingresar los registros");
            System.out.println("2.- Imprimir los registros");
            System.out.println("3.- Modificar un registro");
            System.out.println("4.- Eliminar un registro");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    operar.Insert(lista);
                    System.out.println("Registros ingresados");
                    break;
                case 2:
                    System.out.println(operar.Imprimir());
                    break;
                case 3:
                    System.out.println("Ingrese el nombre");
                    String nombre=sc.next();
                    System.out.println("Ingrese el apellido");
                    String apellido=sc.next();
                    System.out.println("Ingrese la direccion");
                    String dir=sc.next();
                    operar.Modificar(lista, nombre,apellido,dir);
                    System.out.println("Registro modificado");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre");
                     nombre=sc.next();
                    System.out.println("Ingrese el apellido");
                     apellido=sc.next();
                    operar.Delete(lista, nombre, apellido);
                    System.out.println("Registro eliminado");
                    break;
            }
            System.out.println("Si desea continuar ingrese 0");
            flag=sc.nextInt();
        }
    }
    
    public static Estudiante Leer(){
        Scanner sc=new Scanner(System.in);
        Estudiante estudiante;
        String nombre,apellido,direccion;
        long tel,id;
        System.out.println("Ingrese el nombre:");
        nombre=sc.next();
        System.out.println("Ingrese el apellido:");
        apellido=sc.next();
        System.out.println("Ingrese su ID:");
        id=sc.nextLong();
        System.out.println("Ingrese su dirccion:");
        direccion=sc.next();
        System.out.println("Ingrese su telefono:");
        tel=sc.nextLong();
        estudiante=new Estudiante(nombre, apellido, direccion, id, tel);
        return estudiante;
    }
}
