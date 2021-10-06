package exercicios.exercicio01;

public class ContaPoupanca extends Conta{
    private static double taxaSaque = 0.1;

    public ContaPoupanca(int numero){
        super(numero);
    }

    @Override
    public boolean sacar(double dinheiro){
        if (dinheiro + taxaSaque <= getSaldo() ) {
            return super.sacar(dinheiro + taxaSaque);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Conta Poupança: " + super.toString();
    }

    public static void setTaxa(double novataxa){
        if (novataxa >= 0) {
            taxaSaque = novataxa;
        }
    }

}
