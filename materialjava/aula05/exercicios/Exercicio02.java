package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media, mediat, mediag, Ti;
        Ti = 5;
        mediat = 0;
        mediag = 0;

        for (int T = 0; T < 5; T++) {
            
            mediat = 0;
            for (int A = 0; A < 20; A++) {
            
            System.out.printf("digite a nota media do aluno %d: ", (A+1));

            media = entrada.nextDouble();
            mediat += media;
            }
            mediat /= Ti;
            mediag = mediag + mediat;
            System.out.printf("A media da turma %d é: %f\n", T+1 , mediat);
        }
        System.out.printf("A media geral é: %f ", mediag / Ti);
        entrada.close();
    }
}
