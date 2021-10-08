package exercicios.exercicio01.dominio;

/**
 * Conta
 */
public abstract class Conta {
    private int numeroConta;
    private double saldoConta;

    public Conta(int numero){
        this.numeroConta = numero;
        this.saldoConta = 0;
    }

    public int gerarConta(){
       return numeroConta += 1;
    }

    @Override
    public String toString(){
        return String.format("%d : R$ %.2f", numeroConta, saldoConta);
    }

    public double getSaldo(){
        return saldoConta;
    }

    public double getNumeroConta(){
        return numeroConta;
    }

    public void exibirDados(){
        System.out.printf("O numero da conta: %d Possui o Saldo: %f.2", numeroConta, saldoConta);
    }

    public boolean deposito(double dinheiro){
        if (dinheiro > 0) {
            saldoConta += dinheiro;
            return true;
        }
        return false;
    }

    public boolean sacar(double dinheiro){
        if (dinheiro > 0) {
            saldoConta -= dinheiro;
            return true;
        }
        return false;
    }

   
}