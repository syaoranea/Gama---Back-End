package exercicio;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double resultado;

        System.out.println("Digite a primeira nota");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = entrada.nextDouble();

        resultado = (nota1 + nota2) / 2;
        System.out.println("A media é ");
        System.out.println(resultado);
        entrada.close();
        
    }
}
