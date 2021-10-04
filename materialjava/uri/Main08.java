import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        
        double media, positivos;
        double [] valor = new double[6];
        positivos = 0;
        media = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < valor.length; i++) {
            valor[i] = entrada.nextDouble();
            if (valor[i] >= 0) {
                media += valor[i];
                positivos++;
            }
        }
        media = media / positivos;
        System.out.printf("%1.0f valores positivos\n", positivos);
        System.out.printf("%2.1f", media);

        entrada.close();
    }
}
