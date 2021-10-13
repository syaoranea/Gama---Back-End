public interface Veiculo {

    public boolean negativo(double valor);

    public double getConseguiAndar();

    public boolean combustivelSuficiente(double distancia);

    public void quilometragemVeiculo(double distancia);

    public void combustivelNoTanque(double distancia);

    public void abastecer(double valor);

    public String toString();
}
