public class Retangulo {
    private double largura = 6;
    private double altura = 8;

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return (this.altura + this.largura) * 2;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void exibirInformacoes() {
        System.out.println("Altura: "+ getAltura());
        System.out.println("Largura: " + getLargura());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
