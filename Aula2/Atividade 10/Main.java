public class Main {
    public static void  main(String []args) {
        Celular celular = new Celular();

        celular.mostrarBateria();
        celular.usar(80);
        celular.mostrarBateria();
        celular.carregar(220);
        celular.mostrarBateria();
    }
}
