package exercicios.exercicio01.dominio;

public class ContaEspecial extends Conta {
   private double limite;
    public ContaEspecial(int numero, double limite){
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double dinheiro){
        if ((getSaldo() + limite) >= dinheiro) {
            return super.sacar(dinheiro);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Conta Especial: " + super.toString() + " limite:" + limite;
    }
}
