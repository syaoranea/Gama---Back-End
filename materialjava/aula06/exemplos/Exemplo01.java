package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Meu Programa v.1");
        linha();
        System.out.println("Opções");
        int tamanho = "Opções".length();
        linha2(tamanho);

        linha3(10, '*');
    }
    
    static void linha(){   // void não tem retorno 
        System.out.println("----------");
    }

    static void linha2(int tamanho){   // void não tem retorno 
        for(int i = 0; i < tamanho; i++){
        System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char letra){   // void não tem retorno 
        for(int i = 0; i < tamanho; i++){
        System.out.print(letra);
        }
        System.out.println();
    }
}