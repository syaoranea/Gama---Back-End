

import java.util.Scanner;

import exercicios.exercicio01.dao.GerenciamentoContas;
import exercicios.exercicio01.dominio.ContaCorrente;
import exercicios.exercicio01.dominio.ContaEspecial;
import exercicios.exercicio01.dominio.ContaPoupanca;

public class AppContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GerenciamentoContas contas = new GerenciamentoContas();
        int opcao;
        int numeroConta;
        double limite, valor;


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
                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2: 
                    System.out.println("Digite numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Digite o limite da conta:");
                    limite = entrada.nextInt();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Digite numero da conta poupança:");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Digite o numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Digite valor para deposito:");
                    valor = entrada.nextDouble();
                    if(contas.depositar(numeroConta, valor)){
                        System.out.println("Deposito Realizado com Sucesso");
                    }else{
                        System.out.println("Falha ao realizar a operação");   
                    }
                    break;
                case 5:
                    System.out.println("Digite o numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Digite valor para saque:");
                    valor = entrada.nextDouble();
                    if(contas.sacar(numeroConta, valor)){
                        System.out.println("Saque Realizado com Sucesso");
                    }else{
                        System.out.println("Falha ao realizar a operação");   
                    }
                    
                    break;
                case 6:
                    System.out.println("Digite o numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println(contas.saldo(numeroConta));
                    break;
                case 7:
                    break;

                default: System.out.println("Opção Invalida");
            }
        }while(opcao != 7);
        entrada.close();
    }
}
