public class Livro {
    private String titulo = "O Cortiço";
    private String autor = "Aluisio de Azevedo";
    private boolean disponivel = true;

    public void emprestar() {
        if ( this.disponivel == true) {
            this.disponivel = false;
        } else {
            System.out.println("Fora de estoque");
        }
    }

    public void devolver() {
        if (this.disponivel == false) {
            this.disponivel = true;
        } else {
            System.out.println("Você não tem esse livro");
        }
    }

    public void exibirInformacoes() {
        if (this.disponivel == true) {
            System.out.println("O livro está em estoque");
        } else {
            System.out.println("O livro está fora de estoque");
        }
    }
}
