package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
    double salario;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o salario");

    salario = entrada.nextDouble();

    if ( salario <= 600) {
        System.out.println("Isento ");
    } else if (salario <= 1200) {
        System.out.println("Desconto INSS é de 20% valor a ser descontado" + salario * 0.2);
    } else if(salario <= 1200){
        System.out.println("Desconto INSS 25% valor a ser descontado" + salario * 0.25);
    } else{
        System.out.println("Desconto INSS 30% valor a ser descontado" + salario * 0.35);
    }
    

    entrada.close();
    }
}
