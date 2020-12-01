
package Fuentes;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        ListaPersonas listaPersonas = new ListaPersonas();
        Scanner sc=new Scanner(System.in);
        int opcion;
        int aux=0;
        while (aux==0){            
            System.out.println("Introduzca el nombre: ");
            String nombre=sc.nextLine();
            System.out.println("Introduzca el apellido: ");
            String apellido=sc.nextLine();
            System.out.println("Introduxca la direccion: ");
            String direc=sc.nextLine();
            System.out.println("Introduxca el numero de cedula: ");
            Long cedula=sc.nextLong();
            System.out.println("Introduxca el numero de telefono: ");
            Long telf=sc.nextLong();
            Persona newPersona=new Persona(nombre,apellido,direc,cedula,telf);
            listaPersonas.addPersona(newPersona);
            System.out.println("Si desea ingresar otra persona ingrese 0, caso contrario ingrese 1...");
            aux=sc.nextInt();
        } 
        System.out.println("1.- Verificar si dos personas tienen el mismo nombre y apellido.");
        System.out.println("2.- Visualizar los datos de una persona.");
        System.out.println("3.- Verificar si dos personas tiene la misma direccion.");
        opcion=sc.nextInt();
        while(opcion!=0){
            switch (opcion){
                case 1:
                    System.out.println("Introduzca el nombre: ");
                    String nombre=sc.nextLine();
                    System.out.println("Introduzca el apellido: ");
                    String apellido=sc.nextLine();
                    Persona auxPer=new Persona(nombre, apellido, "", 0, 0);
                    if(listaPersonas.mismoNombre(auxPer)){
                        System.out.println("Si existe coincidencia de nombres");
                    }else {
                        System.out.println("No existe coincidencia de nombres");
                    }
                    System.out.println("0.- Salir.");
                    opcion=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Introduzca el nombre: ");
                    nombre=sc.nextLine();
                    System.out.println("Introduzca el apellido: ");
                    apellido=sc.nextLine();
                    auxPer=new Persona(nombre, apellido, "", 0, 0);
                    System.out.println(listaPersonas.getDatos(auxPer));
                    System.out.println("0.- Salir.");
                    opcion=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Introduxca la direccion: ");
                    String direc=sc.nextLine();
                    auxPer=new Persona("", "", direc, 0, 0);
                    if(listaPersonas.mismaDireccion(auxPer)){
                        System.out.println("Si existe coincidencia de direccion");
                    }else {
                        System.out.println("No existe coincidencia de direccion");
                    }
                    System.out.println("0.- Salir.");
                    opcion=sc.nextInt();
                    break;
                default:;
            }
        }
    }
    
}
