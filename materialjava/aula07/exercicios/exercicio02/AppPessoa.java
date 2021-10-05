package exercicios.exercicio02;

/**
 * AppPessoa
 */
public class AppPessoa {

    public static void main(String[] args) {
        // abstract não cria objeto 
       // Pessoa p = new Pessoa("Eduardo Rocha", "11 957080583");
        Estudante e = new Estudante("Erika", "11 27471073", "Contabilidade");
        Professor pro = new Professor("Marcelo", "1198787564", 2200);
       // System.out.println(p);
        System.out.println(e);
        System.out.println(pro);
    }
}