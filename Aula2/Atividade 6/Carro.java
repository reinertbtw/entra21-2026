public class Carro {
    private String modelo = "Jetta GLI";
    private String marca = "Volkswagen";
    private int velocidadeAtual = 100;

    public int acelerar(int velocidade) {
        this.velocidadeAtual += velocidade;
        return velocidadeAtual;
    }

    public int frear(int velocidade) {
        this.velocidadeAtual -= velocidade;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
            return velocidadeAtual;
        } else {
            return velocidadeAtual;
        }
    }

    public void exibirVelocidade() {
        System.out.println("Sua velocidade atual é de: " + velocidadeAtual + " KM/h");
    }
}
