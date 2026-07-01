public class Aluno {
    private String nome = "Lucas";
    private double nota1 = 7;
    private double nota2 = 9;

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public void verificarSituacao() {
        if (calcularMedia() >= 7) {
            System.out.println("Aprovado");
        } else if (calcularMedia() >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public String getNome() {
        return this.nome;
    }
}
