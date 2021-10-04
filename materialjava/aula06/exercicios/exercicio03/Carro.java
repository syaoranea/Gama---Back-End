package exercicios.exercicio03;

/**
 * Carro
 */
public class Carro {

    String modelo, marca;
    private Double consumo;

    Carro( String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void exibirDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }

    double consumoCarro(){
        return consumo;
    }

    public void alterarConsumo(double novoConsumo){
        if (novoConsumo > 0) {
            consumo = novoConsumo;
        }
        
    }
}