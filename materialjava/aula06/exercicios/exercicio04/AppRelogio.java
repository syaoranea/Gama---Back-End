package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio(15, 40, 30);
        r.setHoras(11);
        r.horaAtual();
        r.rodarRelogio();

    }
}
