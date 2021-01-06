
package Lineal;

import java.io.*;
import java.util.StringTokenizer;

public class Operar {
    String path = "C:\\Users\\Renato\\Documents\\GitHub\\Estructura\\Practica5\\Registros.txt";
    File archivo;
    BufferedReader entrada;
    
    public Operar() throws FileNotFoundException {
        archivo=new File(path);
        entrada= new BufferedReader(new FileReader(archivo));
    }
    
    public  int [] operar() throws FileNotFoundException, IOException{
        int [] array=new int[10];
        String linea;
        int i=0;
        try{
            while(entrada.ready()){
                linea=entrada.readLine();
                StringTokenizer tokens= new StringTokenizer(linea,",");
                while (tokens.hasMoreTokens()) {
                    array[i]=Integer.parseInt(tokens.nextToken());
                    i++;
                }
                
            }
        }
        catch(IOError e){
            e.printStackTrace();
        }
        return array;
    }
}
