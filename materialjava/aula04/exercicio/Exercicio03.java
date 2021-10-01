package exercicio;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;
        cont = 1;

        System.out.println("Digite um numero ");
        numero = entrada.nextInt();

        while (cont <= numero) {
           if (cont == 1) {
            System.out.print(cont);
            cont = cont + cont;
           }            
            System.out.print(", " + cont);
            cont = cont + cont;
           
        }

        entrada.close();
    }
}
