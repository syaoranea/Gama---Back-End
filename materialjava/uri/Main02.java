import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, PROD;
        

        a = entrada.nextInt();
        b = entrada.nextInt();
        
        PROD = a * b;

            System.out.println("PROD = " + PROD);
        

        entrada.close();
    }
}