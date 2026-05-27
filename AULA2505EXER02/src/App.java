public class App {
    public static void main(String[] args) throws Exception {
        
        ReinoAnimal r1 = new ReinoAnimal("horacio", 10);

        r1.domir();

        Cachorro r2 = new Cachorro("thor", 2);
        r2.domir();
        r2.latir();

        Gato r3 = new Gato("manteiguinha", 8);
        r3.dormir();
        
        r3.miar();
    }
}
