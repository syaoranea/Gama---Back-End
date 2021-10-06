package exemplos.exemplo01;

public class Endereco {
    private String logradouro;
    int numero;

    public Endereco(String logradoudo, int numero){
        this.logradouro = logradoudo;
        this.numero =  numero;
    }

    public void exibir(){
        System.out.println(logradouro + " , " + numero );
    }
}
