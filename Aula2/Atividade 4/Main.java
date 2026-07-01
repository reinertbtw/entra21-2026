public class Main {
    public static void  main(String []args) {
        Funcionario funcionario = new Funcionario();

        System.out.println("Salario antigo: " + funcionario.getSalario());
        funcionario.aumentarSalario(15);
        funcionario.exibirDados();

    }
}
