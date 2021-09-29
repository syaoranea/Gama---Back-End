package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
    double nota;

    Scanner entrada = new Scanner(System.in);

    nota = entrada.nextDouble();

    if ( nota >= 7) {
        System.out.println("Aluno Aprovado");
    } else if (nota >= 5) {
        System.out.println("Exame necessário");
    } else{
        System.out.println("Aluno Reprovado");
    }
    

    entrada.close();
}
}
