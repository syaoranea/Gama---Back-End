package exercicio;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cont;
        cont = 0;

        System.out.println("Digite o numero da tabuada desejado ");
        numero = entrada.nextInt();

        while (cont < 11) {
            System.out.println( numero + " x " + cont + " = " + (numero * cont));
            cont++;
        }

        cont = 0;
        
        while (cont < 11) {
            System.out.printf( "%d x %2d = %02d\n", numero, cont, numero * cont);
            cont++;
        }
        entrada.close();
    }

}
