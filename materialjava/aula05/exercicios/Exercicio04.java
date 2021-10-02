package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
    
        Scanner entrada = new Scanner(System.in);
        double [] notas = new double [10];
        double media;
        media = 0;
        double notasacima = 0;
        double [] notasdes = new double [10];


        for (int i = 0; i < notas.length - 1; i++) {
            System.out.printf("Digite a nota do %d aluno: ", i);
            notas[i] = entrada.nextDouble();
            media = media + notas[i];
        }
        
        media /= notas.length;

        System.out.println("Notas digitadas \n");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%2f : ", notas[i]);
        }

        System.out.printf("A media da turma é: %f\n", media);

        for (int i = 0; i < notas.length; i++) {
        if (notas[i] > media) {
            notasacima = notasacima + 1;
            notasdes[i] = notas[i];
        }
    }

        System.out.printf("A quantidade de notas acima da media sao: %f\n", notasacima);

        for (int i = 0; i < notasdes.length; i++) {
            if (notasdes[i] > 0) {
                System.out.printf("As Nota notas acima da media sao: %f \n", notasdes[i]); 
            }
            
        }

        entrada.close();
        }
    }


