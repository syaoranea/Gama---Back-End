package exercicios.exercicio03;

public class AppCarro {
    public static void main(String[] args) {
        Carro f = new Carro("Spin", "Fiat", 9);
        f.alterarConsumo(11);
        f.exibirDados();
        System.out.println("O consumo do carro é " + f.consumoCarro() + " Km/l");
    }
}
