public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Cortiço", "Aluísio Azevedo", 5);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 3);

        Usuario usuario = new Usuario("Lucas", "0007");

        livro1.emprestarLivro(3);
        livro2.devolverLivro(1);
        livro1.exibirLivro();
        livro2.exibirLivro();
    }
}
