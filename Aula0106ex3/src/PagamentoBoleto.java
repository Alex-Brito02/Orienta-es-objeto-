public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double v) {
        super(v);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando o codigo de barra para valor R$" + this.valor);
    }

}
