package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, novonumero;
        novonumero = -9999;

        for (int i = 1; i < 11; i++) {
            System.out.printf(" Digite o %d numero: ", i);

            numero = entrada.nextDouble();

            if (numero > novonumero) {
                novonumero = numero;
                
            }
        }
        System.out.printf("O maior numero digitado foi o %d", novonumero);

        entrada.close();
    }
}