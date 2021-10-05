package exercicios.exercicio02;

public abstract class Pessoa {
    //abstract nao cria objetivo serve somente de modelo 
    private String nome, telefone;

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return nome + " Telefone: " + telefone; 
    }

    public String getNome(){
        return nome;
    }

    public String gettelefone(){
        return telefone;
    }
}
