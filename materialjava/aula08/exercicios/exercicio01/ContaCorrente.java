package exercicios.exercicio01;

public class ContaCorrente extends Conta{
    final double TAXA_DEPOSITO = 0.1;
    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public boolean sacar(double dinheiro){
        if (dinheiro <= getSaldo()) {
            return super.sacar(dinheiro);
        }
        return false;
    }

    @Override
    public boolean deposito(double valor){
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString(){
        return "Conta Corrente: " + super.toString();
    }
}
