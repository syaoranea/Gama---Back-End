package exercicio;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, impar, par;
        par = 0;
        impar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d numero ", i);
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Foi digitado " + par + " numeros pares");
        System.out.println("Foi digitado " + impar + " numeros impares");

        entrada.close();
    }
}
