package exemplos;

import java.util.Scanner;

public class Exemplos02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int numero;
        numero = entrada.nextInt();

        if (numero < 2) {
            System.out.println("valor 1");
        } else {
            System.out.println("valor 2");
        }
        entrada.close();
    }
    
}
