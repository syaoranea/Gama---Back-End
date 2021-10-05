package exemplos.exemplo01;

/**
 * appFuncionario
 */
public class appFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Eduardo", 1500);
        Gerente g = new Gerente("Monica", 2200, 2);
        Gerente g2 = new Gerente("Erika", 3200);

        f.ajusteSalario(10);
        f.exibir();
        g.ajusteSalario(10);
        g.exibir();
        g2.exibir();

        System.out.println(g.toString());
    }
}