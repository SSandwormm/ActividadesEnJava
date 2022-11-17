
package paroinpar;

import java.util.Scanner;

public class ParOInpar {

 
    public static void main(String[] args) {
               
        Scanner teclado = new Scanner(System.in);
       
        int numero;
       
        System.out.print("Por favor ingrese el número a evaluar: ");
        numero = teclado.nextInt();
       
        if(numero % 2 == 0) {
            System.out.println(numero+" es un número par.");
        }else {
            System.out.println(numero+" no es un número par.");
        }
    }
}
   
