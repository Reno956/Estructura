
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class NewMain {

public static Lista lista=new Lista();
      public static void main(String[] args) throws IOException{
        String linea;
        String titulo;
        int txt;
        int hash;
        File fe=new File("documento.txt");
        Informacionarchivo ia;
     BufferedReader entrada = new BufferedReader(new FileReader(fe));
        while(entrada.ready()){
            linea=entrada.readLine();
            StringTokenizer st=new StringTokenizer(linea,",");
            titulo=st.nextToken();
            txt=titulo.length();
            txt=txt-3;
            titulo=titulo.substring(0,txt);
            hash=Integer.parseInt(st.nextToken());
            ia=new Informacionarchivo(titulo, hash);
            lista.ingresoDeDatos(ia); 
            }
        
        
        
        CrearDoc cd=new CrearDoc();
        cd.setVisible(true);
        
        
  }
    
}
