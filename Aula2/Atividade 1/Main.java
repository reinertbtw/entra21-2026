public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.cadastrarValores("Pão", 2, 10);

        produto.aumentarEstoque(20);
        produto.diminuirEstoque(5);
        produto.exibirDados();
    }
}
