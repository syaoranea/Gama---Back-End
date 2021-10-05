package exemplos.exemplo01;

public class Gerente extends Funcionario{
    private int numeroFuncionarios;
    public Gerente(String nome, double salario, int numeroFuncionarios){
        super(nome, salario);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    //overload
    public Gerente(String nome, double salario){
        super(nome, salario);
        
    }
    // override metodo sobrescrito
@Override
       public void exibir(){
        System.out.println(getNome() + " - " + getSalario() + " - " + numeroFuncionarios );
    }

    public void ajusteSalario(double ajuste){
    double salarionovo;
       salarionovo =  getSalario() * (1 + (2 * ajuste) / 100);
       setSalario(salarionovo);
    }

    @Override
    public String toString(){
        return super.getNome() + "numero funcionario: " + numeroFuncionarios;
    }
}
