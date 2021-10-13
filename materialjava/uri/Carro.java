/**
 * Carro
 */
public class Carro implements Veiculo{

    private String marca;
    private String modelo;
    private double qtdCombustivel;
    private double consumoMedio;
    private double quilometragem;


    public Carro(String marca, String modelo, double consumoMedio){
        this.marca = marca;
        this.marca = modelo;
        this.consumoMedio = consumoMedio;
        this.qtdCombustivel = 0;
        this.quilometragem = 0;
    }

    public Carro(String marca, String modelo, double qtdCombustivel, double consumoMedio, double quilometragem){
        
        if(negativo(qtdCombustivel)){
        this.marca = marca;
        this.marca = modelo;
        this.qtdCombustivel = qtdCombustivel;
            if (negativo(consumoMedio)) {
                this.consumoMedio = consumoMedio;
            } else {
                System.out.println("informe um valor positivo");
            }
            if(negativo(quilometragem)){
                this.quilometragem = quilometragem;
            }else{
                System.out.println("informe um valor positivo");
            }
        }else{
            System.out.println("informe um valor positivo");
        }
    }
        

    public double getQtdCombustivel(){
        return qtdCombustivel;
    }

    public boolean negativo(double valor){
        if (0 <= valor) {
            return true;
        } else {
            return false;
        }

    }

    public double getConseguiAndar(){
        double conseguiAndar = qtdCombustivel * consumoMedio;
        return conseguiAndar;
    }

    public boolean combustivelSuficiente(double distancia){
        if (distancia <= getConseguiAndar()) {
            return true;
        } else {
            return false;
        }
    }

    public void quilometragemVeiculo(double distancia){
        quilometragem += distancia;
    }

    public void combustivelNoTanque(double distancia){
        qtdCombustivel -= distancia / consumoMedio;
    }

    public void abastecer(double valor){
        qtdCombustivel += valor;
    }

    @Override
    public String toString(){
        return modelo + " " + marca + " " + consumoMedio + "L/km " + quilometragem + " Km " +  qtdCombustivel + " L ";
    }

    public void andar(double distancia){
        if (negativo(distancia)) {
            if (combustivelSuficiente(distancia)) {
                quilometragemVeiculo(distancia);
                combustivelNoTanque(distancia); 
            }else{
                System.out.println("Não ha combustivel suficiente para percorrer a distancia");
            }
        } else {
            System.out.println("informe uma distancia valida");
        }
    }

}