package exercicios.exercicio01;

public class AppConta {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(4321);
        ContaEspecial ce = new ContaEspecial(100, 1000);
        ContaPoupanca cp = new ContaPoupanca(2220);
        ContaPoupanca cp2 = new ContaPoupanca(2220);
        cc.deposito(1000);
        System.out.println(cc);
        cc.sacar(5000);
        System.out.println(cc);

        ce.deposito(1000);
        System.out.println(ce);
        ce.sacar(1500);
        System.out.println(ce);

        ContaPoupanca.setTaxa(0.2);
        cp.deposito(1000);
        System.out.println(cp);
        cp.sacar(100);
        System.out.println(cp);

        
        cp2.deposito(1000);
        System.out.println(cp2);
        cp2.sacar(100);
        System.out.println(cp2);
    }
}
