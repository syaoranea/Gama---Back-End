package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String senha = "R10p5";

        String senhaacesso;
        Scanner entrada = new Scanner(System.in);

        senhaacesso = entrada.nextLine();

        if (senha.equals(senhaacesso)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
