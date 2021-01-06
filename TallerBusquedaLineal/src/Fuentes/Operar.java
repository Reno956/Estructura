
package Fuentes;

import java.io.*;
import java.util.StringTokenizer;

public class Operar {
    String path = "C:\\Users\\Renato\\Documents\\GitHub\\Estructura\\TallerBusquedaLineal\\codigoProducto.txt";
    File archivo;
    BufferedReader entrada;

    public Operar() throws FileNotFoundException {
        archivo=new File(path);
        entrada= new BufferedReader(new FileReader(archivo));
    }
    
    public  int [] operar() throws FileNotFoundException, IOException{
        int [] array=new int[5];
        String linea;
        int i=0;
        String aux="";
        try{
            while(entrada.ready()){
                linea=entrada.readLine();
                StringTokenizer tokens= new StringTokenizer(linea," ");
                while (tokens.hasMoreTokens()) {
                    array[i]=Integer.parseInt(tokens.nextToken());
                    i++;
                    aux=tokens.nextToken();
                }
                
            }
        }
        catch(IOError e){
            e.printStackTrace();
        }
        return array;
    }
}
