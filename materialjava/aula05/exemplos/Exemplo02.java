package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
   
    Scanner entrada = new Scanner(System.in);
    int numero, nume;
    nume = 3;

    do{
        System.out.println("Digite um numero positivo");
        numero = entrada.nextInt();
        nume--;
    }while(numero < 0 && nume > 0) ;
    
    entrada.close();
} }

