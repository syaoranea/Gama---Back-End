package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
    
        Scanner entrada = new Scanner(System.in);
        String [] nomes = new String [7];
    
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = entrada.nextLine();
        }
    
        for (int i = 6; i < nomes.length; i--) {
            System.out.println("o nome digitado: " + nomes[i]);
        }
        entrada.close();
        }
    }

