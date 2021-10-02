import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d;
        boolean ehVerdadeiro;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        ehVerdadeiro = b > c && d > a && c + d > a + b && c > -1 && d > -1 & a % 2 == 0;

        if (ehVerdadeiro) {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();
    }
}
