
public class Lista {
   public Nodo[] listaarchivos;

    public Lista() {
        
        this.listaarchivos = new Nodo[100];
        for (int j = 0; j < 100; j++) {
            listaarchivos[j] = null;
        }
    }
    
    public void ingresoDeDatos(Informacionarchivo ia) {
        Nodo nuevo = new Nodo(ia);
        Nodo q=new Nodo();
        int direccion = ObtenerHash(ia.tituloarchivo);
        //deteccion de colisiones
        if (listaarchivos[direccion] == null) {
            listaarchivos[direccion] = q;
            listaarchivos[direccion].siguiente = nuevo;
        } else {
            Nodo p = listaarchivos[direccion];
            while (p.siguiente != null) {
                p = p.siguiente;
            }
            p.siguiente=nuevo;
        }
    }
   
    
    
    
    public int ObtenerHash(String cadena){
      int a=0;
      char[] vectorcadena=cadena.toCharArray();
      int[] vector2=new int[vectorcadena.length];
      for (int i = 0; i <vectorcadena.length; i++) {
          vector2[i]=vectorcadena[i];
      }
      for (int i = 0; i <vector2.length; i++) {
      if(i%2==0){
      a+=vector2[i];
      a=a%100;
      a=a+1;
      }
      }
  
  return a;
  }  
    
    public boolean esUltimo(Nodo es){
        return es.siguiente==null;
    }
    
    
    
    public void borrarNodo(String numhab) {
        Nodo p,q,r;
        int direccion = ObtenerHash(numhab);
        
        if (listaarchivos[direccion] != null) {
            p = listaarchivos[direccion].siguiente;
            q = listaarchivos[direccion];
            do {
                if (p.infoa.tituloarchivo.equals(numhab)) {
                    if(!esUltimo(p)){
                        r=p.siguiente;
                        q.siguiente = r;
                    }
                    else{
                        q.siguiente = null;
                    }
                    break;
                } else {
                    q = p;
                    p = p.siguiente;
                }
            } while (p!= null);
            System.out.print("\n");
        }

    }
    
    public String Mostar() {
        Nodo p;
        String salida = "";
        for (int i = 0; i < listaarchivos.length; i++) {
            p = listaarchivos[i];
            if (listaarchivos[i] != null) {
                while (p.siguiente != null) {
                    p = p.siguiente;

                    salida += p.infoa.toString();
                }
            }

        }
        return salida;
    }
    
    public Nodo buscar(String titulo){
    Nodo p;
    Nodo q = new Nodo();
        for (int i = 0; i < listaarchivos.length; i++) {
            p = listaarchivos[i];
            if (listaarchivos[i] != null) {
                while (p.siguiente != null) {
                    p = p.siguiente;
                if(p.infoa.tituloarchivo.equals(titulo)){
                q=p;
                }
                }
            }

        }
        return q;
    }
    
    
   
   
   
   
}
