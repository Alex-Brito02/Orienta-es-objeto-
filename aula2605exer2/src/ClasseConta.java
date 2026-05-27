public class ClasseConta {
    protected int numero;
     protected double saldo;

     public ClasseConta(int n, double s) {
        this.numero = n;
        this.saldo = s;

     }
      public void cobrarTarifa() {
        this.saldo = this.saldo - 15.0;

      }
}
