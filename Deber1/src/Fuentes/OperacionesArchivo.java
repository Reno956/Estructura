
package Fuentes;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OperacionesArchivo {
    String path = "C:\\Users\\Renato\\Documents\\GitHub\\Estructura\\Deber1\\estudiantes.txt";
    File archivo;
    BufferedReader entrada;
    BufferedWriter salida;
    Estudiante estudiante;

    public OperacionesArchivo() throws IOException {
        archivo = new File (path);
        salida = new BufferedWriter(new FileWriter(archivo));
    }
    
    public void Insert(ArrayList<Estudiante> lista) throws IOException{
        int i=1;
        for(Estudiante aux: lista){
            salida.write("Estudiante No: " + i + "\n");
            salida.write("Nombre: " + aux.getNombre() + "\n");
            salida.write("Apellido: " + aux.getAplellido() + "\n");
            salida.write("ID: " + aux.getId() + "\n");
            salida.write("Direccion: " + aux.getDireccion() + "\n");
            salida.write("Telefono: " + aux.getTelefono() + "\n\n");
            i++;
        }
        salida.close();
    }
    
    public String Imprimir(){
        String retorno="";
        File toString;
        try{
            toString =new File(path);
            entrada= new BufferedReader(new FileReader(toString));
            while(entrada.ready()){
            retorno+=entrada.readLine() + "\n";
            }
            entrada.close();
        }
        catch(IOError e){
            e.printStackTrace();
        } catch (FileNotFoundException ex) { 
            retorno="Archivo no existe";
        } catch (IOException ex) {
        }
        return retorno;
    }
    
    public void Modificar(ArrayList<Estudiante> lista,String nombre,String apellido,String dir){
        for(Estudiante aux: lista){
            if(nombre.equalsIgnoreCase(aux.getNombre())&&apellido.equalsIgnoreCase(aux.getAplellido())){
                aux.setDireccion(dir);
                break;
            }
        }
    }
    
    public void Delete(ArrayList<Estudiante> lista,String nombre,String apellido){
        Iterator<Estudiante> it = lista.iterator();
        while(it.hasNext()){
            String nom=it.next().getNombre();
            String ape=it.next().getAplellido();
            if(nombre.equalsIgnoreCase(nom)&&apellido.equalsIgnoreCase(ape)){
                it.remove();
            }
        }
        
    }
}
