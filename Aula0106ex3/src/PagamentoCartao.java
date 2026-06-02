public class PagamentoCartao extends Pagamento {
  public PagamentoCartao(double v) {
  super(v);

  }

  public void processarPagamento() {
    System.out.println("Enviando dados para operadora de cartao R$" + this.valor);
  }

}
