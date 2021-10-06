package exercicios.exercicio02;

public class AppAnimal {
    public static void main(String[] args) {

        Proprietario p = new Proprietario( "Eduardo", 1127471073 );
        Animal a = new Animal("Tatu ", "Bola ", 2020, p);

        a.exibir();
    }
}
