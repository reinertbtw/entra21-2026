import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p = new Pessoa();
        p.nome = "Ana";
        p.email = "ana@gmail.com";
        pessoas.add(p);

        Pessoa p2 = new Pessoa();
        p2.nome = "Joao";
        p2.email = "joao@gmail.com";
        pessoas.add(p2);

        Pessoa p3 = new Pessoa();
        p3.nome = "Pedro";
        p3.email = "pedro@gmail.com";
        pessoas.add(p3);

        for (Pessoa x : pessoas) {
            x.display();
        }
    }
}

class Pessoa {
    String nome;
    String email;

    void display() {
        System.out.println(this.nome + " " + this.email);
    }
}
