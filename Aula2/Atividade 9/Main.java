public class Main {
    public static void  main(String []args) {
        ArCondicionado ar = new ArCondicionado();

        ar.mostrarTemperatura();
        ar.aumentarTemperatura(4);
        ar.mostrarTemperatura();
        ar.diminuirTemperatura(10);
        ar.mostrarTemperatura();
    }
}
