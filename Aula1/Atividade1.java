public class Atividade1 {
    public static void main(String[] args) {
        Produtos p = new Produtos();
        p.nome = "Pão";
        p.descricao = "alimento feito de farinha amassada";
        p.preco = 2;
        p.estoque = 10;
        p.unMedida = "G";
        p.display();
        System.out.println(p.concederAcrescimo(5));

        Produtos p2 = new Produtos();
        p2.nome = "Farinha";
        p2.descricao = "pó alimentício obtido pela moagem de grãos";
        p2.preco = 10;
        p2.estoque = 50;
        p2.unMedida = "KG";
        p2.display();
        System.out.println(p2.concederDesconto(10));
    }
}

class Produtos {
    String nome;
    String descricao;
    int preco;
    int estoque;
    String unMedida;

    public double concederAcrescimo(double taxa) {
        return this.preco + this.preco * (taxa / 100);
    }

    public double concederDesconto(double taxa) {
        return this.preco - this.preco * (taxa / 100);
    }

    void display() {
        System.out.println("Produto..........:   " + this.nome);
        System.out.println("Descrição........:   " + this.descricao);
        System.out.println("Preço............:   " + this.preco);
        System.out.println("Estoque..........:   " + this.estoque);
        System.out.println("Unidade de Medida:   " + this.unMedida);
    }
}
