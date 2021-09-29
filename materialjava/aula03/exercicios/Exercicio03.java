package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2;

        System.out.println("Digite o primeiro numero");
        num1 = entrada.nextFloat();

        System.out.println("Digite o primeiro numero");
        num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.println("Os numeros em ordem não crescente: ");
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println("Os numeros em ordem não crescente: ");
            System.out.println(num2);
            System.out.println(num1);
        }
        entrada.close();
    }
}
