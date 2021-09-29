package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        double numero, conste, resultado;
        

        conste = 20;

        numero = entrada.nextDouble();

        if (numero > conste) {
            resultado = numero / 2;
            System.out.println("O resultado é: " + resultado);
        } else{
            System.out.println("O numero é menor que 20");
        }

        entrada.close();
    }
}
