package exercicios.exercicio01;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int numeroConta;
        double limite = 0;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;
        Double valor;

        do{
            System.out.println(" 1 - Nova Conta Corrente");
            System.out.println(" 2 - Nova Conta Especial");
            System.out.println(" 3 - Nova Conta Poupança");
            System.out.println(" 4 - Depositar");
            System.out.println(" 5 - Sacar");
            System.out.println(" 6 - Consultar Saldo");
            System.out.println(" 7 - Sair");
            
            opcao = entrada.nextInt();

            switch(opcao){
                case 1: 
                    System.out.println("Digite numero da conta:");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    break;
                case 2: 
                    System.out.println("Digite numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Digite o limite da conta:");
                    limite = entrada.nextInt();
                    ce = new ContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Digite numero da conta poupança:");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Digite valor para deposito:");
                    valor = entrada.nextDouble();
                    if(cc.deposito(valor)){
                        System.out.println("Deposito Realizado com Sucesso");
                    }else{
                        System.out.println("Falha ao realizar a operação");   
                    }
                    break;
                case 5:
                    System.out.println("Digite valor para saque:");
                    valor = entrada.nextDouble();
                    if(cc.sacar(valor)){
                        System.out.println("Saque Realizado com Sucesso");
                    }else{
                        System.out.println("Falha ao realizar a operação");   
                    }
                    
                    break;
                case 6:
                    System.out.println(cc);
                    System.out.println(ce);
                    break;
                case 7:
                    break;

                default: System.out.println("Opção Invalida");
            }
        }while(opcao != 7);
        entrada.close();
    }
}
