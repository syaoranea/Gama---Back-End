import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media, notas; 
         nota1 = -1;
         nota2 = -1;
            notas = entrada.nextDouble();
            if (notas >= 0 && notas <= 10) {
                nota1 = notas;
            }else{
                
                while (notas < 0 || notas > 10) {
                    System.out.println("nota invalida");
                    notas = entrada.nextDouble();
                    nota1 = notas;
                    
                }
            }
            notas = entrada.nextDouble();
            if (notas >= 0 && notas <= 10) {
                nota2 = notas;
            }else{
                
                while (notas < 0 || notas > 10) {
                    System.out.println("nota invalida");
                    notas = entrada.nextDouble();
                    nota2 = notas;
                    
                }
            }
            media = (nota1 + nota2) / 2;
            System.out.printf("media = %2.2f", media);
            entrada.close();
    }
}
