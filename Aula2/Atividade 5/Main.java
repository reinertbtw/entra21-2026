public class Main {
    public static void  main(String []args) {
        Livro livro = new Livro();

        livro.exibirInformacoes();
        livro.emprestar();
        livro.exibirInformacoes();
        livro.devolver();
        livro.exibirInformacoes();
    }
}
