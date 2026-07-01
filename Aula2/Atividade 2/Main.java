public class Main {
    public static void  main(String []args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(900);
        conta.exibirDados();
    }
}
