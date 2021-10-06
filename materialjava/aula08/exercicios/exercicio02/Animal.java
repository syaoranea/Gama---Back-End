package exercicios.exercicio02;

public class Animal {
    private String nome, raca;
    private int anonascimento;
    private Proprietario proprietario;
    
    public Animal(String nome, String raca, int anonascimento, Proprietario proprietario){
        this.nome = nome;
        this.raca = raca;
        this.anonascimento =  anonascimento;
        this.proprietario = proprietario;
    }

    public void exibir(){
        System.out.println(nome + " " + raca  + " " + anonascimento  + " " + proprietario.getNome()  + " " + proprietario.getTelefone());
    }
}
