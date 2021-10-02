import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        media = ((a * 0.2) + (b * 0.3) + (c * 0.5)) / 3 ;

        System.out.printf("MEDIA = %.1f\n", media);
        

        entrada.close();
    }
}
