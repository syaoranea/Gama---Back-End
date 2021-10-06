package exemplos.exemplo02;

public class AppPrintable {
    public static void main(String[] args) {
        Printable e = new EscritaTela();
        EscreverResposta resposta = new EscreverResposta();
        e.print();

        resposta.gravar(new EscritaArquivo());
    }
}
