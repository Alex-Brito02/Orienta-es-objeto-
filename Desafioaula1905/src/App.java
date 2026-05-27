public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta1 = new ContaBancaria("Alex");

        double saldo = conta1.getSaldo();
        System.out.println("Saldo ataual" + saldo);

        conta1.depositadar(200.0);
        saldo = conta1.getSaldo();
        System.out.println(" Saldo atual: " + saldo);

        conta1.sacar(500);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual:" + saldo);

        conta1.sacar(50.0);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual:" + saldo);

    }
}