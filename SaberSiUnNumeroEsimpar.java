package sabersiunnumeroesimpar;

import java.util.Scanner;

public class SaberSiUnNumeroEsimpar {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el valor: ");
        int numero;
        numero = keyboard.nextInt();

        // int n = 9;
        System.out.println(si_y_no(numero));

    }
    static boolean si_y_no(int numero) {
        if (numero == 0) {
            System.out.println(" el numero es par");
            return true;
        }
        else if (numero == 1 || numero == -1) {
            System.out.println("el numero no es par");        
            return false;
        }
        else if (numero > 1) {
            return si_y_no(numero - 2);
        }
        else {
            return si_y_no(numero + 2);
        }
    }
}
