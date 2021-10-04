import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        String senha = "2002";
        Scanner entrada = new Scanner(System.in);
        String acesso = "0";

        boolean validacao = false;

        while (validacao != true) {
            acesso = entrada.nextLine(); 
        if (acesso.equals(senha)) {
            System.out.println("Acesso Permitido");
            validacao = true;
        } else {
            System.out.println("Senha Invalida");
            validacao = false;
        }
        }
        entrada.close();
    }
}
