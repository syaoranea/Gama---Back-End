package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, concedido;

        System.out.println("Digite o salario bruto ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o valor da prestação");
        num2 = entrada.nextDouble();

        concedido = num1 * 0.3;

        if (num2 >= concedido) {
            System.out.println("Credito aprovado  ");
            
        }else {
            System.out.println("Creditado Reprovado ");
            
        }
        entrada.close();
    }
}
