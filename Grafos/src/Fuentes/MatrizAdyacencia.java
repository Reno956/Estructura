
package Fuentes;

public class MatrizAdyacencia {
    int nVertices;
    int [][] matriz;

    public MatrizAdyacencia(int nVertices) {
        this.nVertices = nVertices;
        this.matriz = new int[nVertices][nVertices];
        for(int i=0;i<nVertices-1;i++){
            for(int j=0;j<nVertices-1;j++){
                matriz[i][j]=0;
            }
        }
    }
    
    public void insrtarArista(int u, int v){
        matriz[u][v]=1;
        matriz[v][u]=1;
    }
    
    public void eliminarArista(int u, int v){
        matriz[u][v]=0;
        matriz[v][u]=0;
    }
    
    public boolean hayArista(int u, int v){
        return matriz[u][v]==1;
    }
    
    public void imprimir(){
        String salida="";
        for(int i=0;i<nVertices;i++){
            salida+="\t";
            for(int j=0;j<nVertices;j++){
                
                salida+=matriz[i][j]+"  ";
            }
            salida+="\n";
        }
        System.out.println(salida);
    }
}
