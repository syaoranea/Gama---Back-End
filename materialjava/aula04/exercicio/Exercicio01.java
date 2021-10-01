package exercicio;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        double a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro comprimento ");
        a = entrada.nextDouble();

        System.out.println("Digite o segundo comprimento ");
        b = entrada.nextDouble();

        System.out.println("Digite o terceiro comprimento ");
        c = entrada.nextDouble();

        if (a > b + c || b > a + c || c > b + a) {
            System.out.println("Os comprimentos não formaram um triangulo");
        } else if (a == b && a == c) {
            System.out.println("triangulo Equilatero");
        } else if (a == b || b == c || a == c) {
            System.out.println("triangulo isosceles");
            
        } else {
            System.out.println("triangulo escaleno");
        } 
            
        entrada.close();
    }
}