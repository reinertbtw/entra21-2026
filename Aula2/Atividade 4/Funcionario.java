public class Funcionario {
    private String nome = "Lucas";
    private double salario = 5000;

    public double aumentarSalario(double percentual) {
        this.salario = this.salario + (this.salario * percentual / 100);
        return this.salario;
    }

    public double calcularSalarioAnual() {
        this.salario = this.salario * 12;
        return this.salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário atual: " + this.salario);
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }

    public double getSalario() {
        return this.salario;
    }
}
