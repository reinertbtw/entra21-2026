public class Usuario {
    private String nome;
    private String matricula;

    public Usuario (String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirUsuario() {
        System.out.println(nome);
        System.out.println(matricula);
    }
}
