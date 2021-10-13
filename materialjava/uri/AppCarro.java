

public class AppCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro("Volks", "Fusca", 7);
        Carro uno = new Carro("Fiat", "Uno", 20, 12, 100);

        fusca.abastecer(12);
        uno.abastecer(22);
        fusca.toString();
        uno.toString();
        System.out.println(uno.toString());

    }
}
