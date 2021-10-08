package exemplos.exemplo03;

public class Moto implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("Ligando o  Moto...");
    }
    @Override
    public void desligar(){
        System.out.println("Desligando  o  Moto...");
    }
}
