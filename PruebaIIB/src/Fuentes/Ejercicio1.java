package Fuentes;

public class Ejercicio1 {
    public static void main(String[] args){
        boolean a = esPalindromo("reconocer");
        if(a){
            System.out.println("Si es plindromo");
        } else{
            System.out.println("No es plindromo");
        }
    }
    
    public static boolean esPalindromo(String texto){
      char [] cad = texto.toCharArray();
      int tam = cad.length-1;
      if(tam <= 1){
        return true;
      } else{
        if(cad[0]==cad[tam]){
          return esPalindromo(texto.substring(1,tam));
        } else{
             return false;
          }
        }  
    }
}
