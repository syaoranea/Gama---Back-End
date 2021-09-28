package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String peso;

        System.out.println("Qual seu peso:");
        peso = entrada.nextLine();

        System.out.println("Olá seu peso é " + peso);
        entrada.close();
    }
}
