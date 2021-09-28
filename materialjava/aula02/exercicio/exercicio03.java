package exercicio;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;
        System.out.println("Digite seu salario: ");

        salario = entrada.nextDouble();
        double aumento;
        aumento = salario * 1.25;

        System.out.println("Salario ajustado: R$" + aumento);
    }
}
