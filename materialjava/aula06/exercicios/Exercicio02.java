package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
       System.out.println(numMenor(1, 2, 3));
       System.out.println(numMenor(3, 1, 2));
       System.out.println(numMenor(3, 2, 1));
        

    }

    static int numMenor(int num1, int num2, int num3){
       if (num1 <= num2 && num1 <= num3) {
           return num1;
       } else if (num2 <= num1 && num2 <= num3) {
           return num2;
       }
        return num3;
    }
    }