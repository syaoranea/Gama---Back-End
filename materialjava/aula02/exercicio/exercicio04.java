package exercicio;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, quilowatts, salario;

        System.out.println("Digite o salario");

        salario = entrada.nextDouble();

        System.out.println("Digite o quantidade quilowatts");

        quilowatts = entrada.nextDouble();

        valor = salario * 0.002;
        System.out.println("O valor em reais de cada quilowatts " + valor);

        valor = valor * quilowatts;
        System.out.println("O valor a ser pago " + valor);

        valor = valor * 0.85;
        System.out.println("O valor a ser pago com desconto " + valor);
        entrada.close();
    }
}
