public class App {
    public static void main(String[] args) throws Exception {
        
        Arcondicionado ac = new Arcondicionado("LG");
        
        ac.aumentarTempertura();

        ac.ligar();
         ac.aumentarTempertura();
         ac.diminuirTemperatura();

         ac.desligar();

    }
}
