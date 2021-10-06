package exemplos.exemplo01;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void exibir(){
        System.out.println(nome);
    }
}   
