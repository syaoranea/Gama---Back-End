import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b, SOMA;

        
        a = entrada.nextInt();

        
        b = entrada.nextInt();

        SOMA = a + b;

        System.out.println("SOMA = " + SOMA);

        entrada.close();
    }
}