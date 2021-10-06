package exercicios.exercicio02;

public class Proprietario {
    private String nome;
    private int telefone;

    public Proprietario(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public void exibirPropri(){
        System.err.println(nome  + " " + telefone);
    }

    public String getNome(){
        return  nome;
    }

    public int getTelefone(){
        return telefone;
    }
}
