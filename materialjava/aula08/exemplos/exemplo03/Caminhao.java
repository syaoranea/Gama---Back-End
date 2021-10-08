package exemplos.exemplo03;

public class Caminhao implements Veiculo {
    @Override
    public void ligar(){
        System.out.println("Ligando o  Caminhão...");
    }
    @Override
    public void desligar(){
        System.out.println("Desligando  o  Caminhão...");
    }
}
