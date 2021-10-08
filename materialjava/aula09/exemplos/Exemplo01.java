package exemplos;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        try {
            System.out.println("Digite um número inteiro");
         //  numero = entrada.nextInt();
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("Voce digitou " + numero);
        }catch (InputMismatchException ex) {
            System.out.println("Erro de digitação ");
        }catch (NumberFormatException ex) {
            System.out.println("Erro de conversão  ");
            System.out.println(ex.getMessage());
        }finally{

        System.out.println("Fim do programa ");

        entrada.close();
        }
    
}
}