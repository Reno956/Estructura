
public class Informacionarchivo {
    public String tituloarchivo;
    public int hashdeltexto;

    public Informacionarchivo(String archivo, int hashdeltexto) {
        this.tituloarchivo = archivo;
        this.hashdeltexto = hashdeltexto;
    }

    @Override
    public String toString() {
        return tituloarchivo+".txt,"+hashdeltexto+"\n";
    }
    
    
    
    
}
