public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void emprestarLivro(int emprestimo) {
        if (quantidadeDisponivel < emprestimo) {
            System.out.println("Não foi possivel realizar o emprestimo");
        } else {
            quantidadeDisponivel -= emprestimo;
            System.out.println("Emprestimo realizado");
        }
    }

    public void devolverLivro(int devolucao) {
        quantidadeDisponivel += devolucao;
        System.out.println("Devolução realizada");
    }

    public void exibirLivro() {
        System.out.println("Titulo         : " + titulo);
        System.out.println("Autor          : " + autor);
        System.out.println("Qtde disponivel: " + quantidadeDisponivel);
        System.out.println(" ");
    }
}
