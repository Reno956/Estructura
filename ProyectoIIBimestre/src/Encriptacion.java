
public class Encriptacion {


 public String cifradoCesar(String texto) {
        StringBuilder cifrado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + 3) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + 3 - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + 3));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + 3) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + 3 - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + 3));
                }
            }
            else if(texto.charAt(i)==' '){
            cifrado.append((char) (texto.charAt(i)));
            }
        }
        return cifrado.toString();
    }
 
 public String descifradoCesar(String texto) {
        StringBuilder cifrado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - 3) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - 3 + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - 3));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - 3) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - 3 + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - 3));
                }
            }
            else if(texto.charAt(i)==' '){
            cifrado.append((char) (texto.charAt(i)));
            }
        }
        return cifrado.toString();
    }

    
    
}
