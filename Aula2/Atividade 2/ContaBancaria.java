public class ContaBancaria {
    private int numero = 171;
    private String titular = "Lucas";
    private double saldo = 33333;

    public double depositar(double valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println(this.saldo);
        } else {
            System.out.println("Saque não autorizado.");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void exibirDados() {
        System.out.println("Numero : " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo  : " + this.saldo);
    }
}
