package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

    
        if (numPar(num)) {
            System.out.println("O numero é Par");
        } else {
            System.out.println("O numero é Impar");
        }
        
        

        entrada.close();
    }

    static boolean numPar(int numero){

        if (numero % 2 == 0) {
            return true;
        }else{
            return false;
        }
        
    }

    static boolean numPar2(int numero){

        if (numero % 2 == 0) {
            return true;
        }
        return false;   
    }

    static boolean numPar3(int numero){

        return (numero % 2 == 0);
}
}