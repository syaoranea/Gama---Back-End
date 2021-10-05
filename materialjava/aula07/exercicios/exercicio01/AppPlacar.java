package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
       Placar P = new Placar(); 
       Placar P2 = new Placar("São Paulo", "Santos"); 
       Placar P3 = new Placar("São Paulo", "Santos", 3, 0); 

       System.out.println(P);
       System.out.println(P2);
       System.out.println(P3);
    }
}
