public class Lampada {
    private boolean ligada = true;

    public void ligar() {
        if (this.ligada == true) {
            System.out.println("A lâmpada ja está ligada");
        } else {
            this.ligada = true;
        }
    }

    public void desligar() {
        if (this.ligada == false) {
            System.out.println("A lâmpada ja está desligada");
        } else {
            this.ligada = false;
        }
    }

    public void mostrarEstado() {
        if (this.ligada == true) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
