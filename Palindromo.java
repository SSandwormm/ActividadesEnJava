
package palindromo;

public class Palindromo {

    
    public static void main(String[] args) {
        System.out.println(palindromo(borrar("anita lava la tina")));
        System.out.println(borrar("anita lava la tina"));
    }
    // Método para borrar espacios
    static String borrar(String F) {
        String w = "";
        for (int i = 0; i < F.length(); i++) {
            if (F.charAt(i) != ' ') {
                w = w + F.charAt(i);
            }
        }
        return w;
    }
    // Método para ver si una palabra es palindrome
    static boolean palindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {

            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
