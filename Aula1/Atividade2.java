import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir produto");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Aplicar Desconto");
            System.out.println("6 - Aplicar Acréscimo");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: // Inserir Produto
                    Produtos p = new Produtos();
                    System.out.print("Nome: ");
                    p.nome = sc.nextLine();
                    System.out.print("Preço: ");
                    p.preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Estoque: ");
                    p.estoque = sc.nextInt();
                    sc.nextLine();
                    produtos.add(p);
                    System.out.println("Produto adicionado!");
                    break;

                case 2: // Listar os Produtos
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produtos prod : produtos) {
                            prod.display();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3: // Excluir Produto
                    System.out.print("Nome do produto a excluir: ");
                    String nomeExcluir = sc.nextLine();
                    boolean removido = false;
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).nome.equalsIgnoreCase(nomeExcluir)) {
                            produtos.remove(i);
                            System.out.println("Produto removido!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4: // Alterar Produto
                    System.out.print("Nome do produto a alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean encontrado = false;
                    for (Produtos prod : produtos) {
                        if (prod.nome.equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Novo nome: ");
                            prod.nome = sc.nextLine();
                            System.out.print("Novo preço: ");
                            prod.preco = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Novo estoque: ");
                            prod.estoque = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Produto alterado!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5: // Aplicar Desconto
                    System.out.print("Nome do produto: ");
                    String nomeDesc = sc.nextLine();
                    boolean achouDesc = false;
                    for (Produtos prod : produtos) {
                        if (prod.nome.equalsIgnoreCase(nomeDesc)) {
                            System.out.print("Taxa de desconto (%): ");
                            double taxaDesc = sc.nextDouble();
                            sc.nextLine();
                            prod.preco = prod.concederDesconto(taxaDesc);
                            System.out.println("Novo preço: " + prod.preco);
                            achouDesc = true;
                            break;
                        }
                    }
                    if (!achouDesc) System.out.println("Produto não encontrado.");
                    break;

                case 6: // Aplicar Acréscimo
                    System.out.print("Nome do produto: ");
                    String nomeAcre = sc.nextLine();
                    boolean achouAcre = false;
                    for (Produtos prod : produtos) {
                        if (prod.nome.equalsIgnoreCase(nomeAcre)) {
                            System.out.print("Taxa de acréscimo (%): ");
                            double taxaAcre = sc.nextDouble();
                            sc.nextLine();
                            prod.preco = prod.concederAcrescimo(taxaAcre);
                            System.out.println("Novo preço: " + prod.preco);
                            achouAcre = true;
                            break;
                        }
                    }
                    if (!achouAcre) System.out.println("Produto não encontrado.");
                    break;
            }
        } while (opcao != 0);

        System.out.println("Encerrando...");
    }
}

class Produtos {
    String nome;
    double preco;
    int estoque;

    public double concederAcrescimo(double taxa) {
        return this.preco + this.preco * (taxa / 100);
    }

    public double concederDesconto(double taxa) {
        return this.preco - this.preco * (taxa / 100);
    }

    void display() {
        System.out.println("Produto..........:   " + this.nome);
        System.out.println("Preço............:   " + this.preco);
        System.out.println("Estoque..........:   " + this.estoque);
    }
}
