public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String n, double pb) {
        this.nome = n;
        this.precoBase = pb;
        
    }

    public double calcularPrecofinal() {
        return this.precoBase * 1.1;
       
    }
}
