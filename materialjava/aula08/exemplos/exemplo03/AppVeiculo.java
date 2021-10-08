package exemplos.exemplo03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Caminhao();
        Veiculo v2 = new Moto();

        IniciarVeiculo.ligar(v1);
        IniciarVeiculo.ligar(v2);

    }
}
