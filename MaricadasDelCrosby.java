package maricadas.del.crosby;

import java.util.Scanner;

public class MaricadasDelCrosby {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;
        System.out.println("ingres su altura en Mts:");
        altura = entrada.nextDouble();
        System.out.println("ingres su peso en kg:");
        peso = entrada.nextDouble();

        double masaCorporal = peso / (Math.pow(altura,2));

        double IMC = (masaCorporal*100)/100;

        System.out.println(IMC);

    }
    
      

}
