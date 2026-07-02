public class Produto {
    private String nome;
    private int preco;
    private int qtde;

    public void cadastrarValores(String nome, int preco, int qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public void aumentarEstoque(int deposito) {
        this.qtde += deposito;
        System.out.println("Quantidade atual: " + this.qtde);
    }

    public void diminuirEstoque(int saque) {
        if (this.qtde < saque) {
            System.out.println("Quantidade insuficiente");
        } else {
            this.qtde -= saque;
            System.out.println("Quantidade atual: " + this.qtde);

        }
    }

    public double calcularValorTotal() {
        return this.qtde * this.preco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + qtde);
        System.out.println("Valor total: " + calcularValorTotal());
        System.out.println(" ");
    }
}
