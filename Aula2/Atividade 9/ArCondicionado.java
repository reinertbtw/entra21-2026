public class ArCondicionado {
    private int temperaturaAtual = 22;

    public int aumentarTemperatura(int temperatura) {
        if ((temperaturaAtual + temperatura) >= 30) {
            return this.temperaturaAtual = 30;
        } else {
            return this.temperaturaAtual + temperatura;
        }
    }

    public int diminuirTemperatura(int temperatura) {
        if ((temperaturaAtual - temperatura) <= 16) {
            return this.temperaturaAtual = 16;
        } else {
            return this.temperaturaAtual - temperatura;
        }
    }

    public void mostrarTemperatura() {
        System.out.println("Temperatura: " + temperaturaAtual + " C");
    }
}
