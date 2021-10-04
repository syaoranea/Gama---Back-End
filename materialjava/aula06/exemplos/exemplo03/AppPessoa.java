package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("Pedro", 27, 1.80, 79);
        Pessoa maria = new Pessoa("Maria", 30, 1.60, 69);

        pedro.apresentar();

        maria.apresentar();
    }
}
