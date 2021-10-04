package exemplos.exemplo03;

public class Pessoa {
    // atributo 
    String nome;
    double altura, peso;
    int idade;

    // metodo construtor

    Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // metodos
    void apresentar(){
        System.out.println("Olá! Sou " + nome);
    }

}
