package exercicios.exercicio01.dao;

import java.util.ArrayList;
import exercicios.exercicio01.dominio.Conta;
import exercicios.exercicio01.dominio.ContaCorrente;
import exercicios.exercicio01.dominio.ContaEspecial;
import exercicios.exercicio01.dominio.ContaPoupanca;

public class GerenciamentoContas {
    private ArrayList<Conta> contas;

    public GerenciamentoContas(){
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor){
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor){
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.sacar(valor);
            }
        }
        return false;
    }

    public String saldo(int numeroConta){
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return ""+conta;
            }
        }
        return "Conta nao encontrada";
    }
}
