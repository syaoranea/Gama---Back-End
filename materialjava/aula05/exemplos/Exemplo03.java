package exemplos;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    int [] numeros = new int [5];

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite o numero: ");
        numeros[i] = entrada.nextInt();
    }

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("o numero: " + numeros[i]);
    }
    entrada.close();
    }
}