package exemplos.exemplo01;

public class Funcionario {
    private  String nome;
    private double salario, ajustesalarial;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibir(){
        System.out.println(nome + " - " + salario );
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void ajusteSalario(double ajuste){
        double salarionovo;
       salarionovo =  salario * (1 + ajuste / 100);
       salario = salarionovo;
    }

    @Override
    public String toString(){
        return nome + ": R$ " + salario;
    }
}
