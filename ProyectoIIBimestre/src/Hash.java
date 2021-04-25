
public class Hash {

    public Hash() {
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
      }
      }
  
  return a;
  }  
    
    
    
}
