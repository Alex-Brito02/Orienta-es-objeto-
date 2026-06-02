public class ContaEstudante extends ClasseConta {
      public ContaEstudante(int n, double s) {
        super(n ,s);
      }
      @Override
      public void cobrarTarifa() {
        this.saldo = this.saldo - 0;
      }

      


}
