public class Main {
    public static void  main(String []args) {
        Lampada lampada = new Lampada();

        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
    }
}
