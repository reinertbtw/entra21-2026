public class Celular {
    private String modelo = "samgung";
    private int bateria = 60;

    public int carregar(int percentual) {
        if ((bateria + percentual) >= 100) {
            return this.bateria = 100;
        } else {
            return this.bateria += percentual;
        }
    }

    public int usar(int percentual) {
        if ((bateria - percentual) <= 0) {
            return this.bateria = 0;
        } else {
            return this.bateria -= percentual;
        }
    }

    public void mostrarBateria() {
        System.out.println(this.bateria);
    }
}
