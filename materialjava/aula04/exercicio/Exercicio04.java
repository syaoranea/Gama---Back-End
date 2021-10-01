package exercicio;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, conte, soma;
        conte = 1;
        limite = 1;
        while (limite != 0) {
            System.out.println("Digite o " + conte + " numero ");
            
            limite = entrada.nextInt();
            conte++;
        }
        entrada.close();
    }
}
