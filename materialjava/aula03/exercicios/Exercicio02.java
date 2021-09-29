package exercicios;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       double nota1, nota2, media;

       System.out.println("Digite nota um");
        nota1 = entrada.nextDouble();

        System.out.println("Digite nota dois");
        nota2 = entrada.nextDouble();

        media = (nota1 * 40 + nota2 * 60) / 100;
        if (media >= 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
        entrada.close();
    }
}
