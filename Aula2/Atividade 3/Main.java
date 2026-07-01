public class Main {
    public static void  main(String []args) {
        Aluno aluno = new Aluno();

        System.out.println(aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}
