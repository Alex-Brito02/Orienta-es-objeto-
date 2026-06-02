public class Imovel implements Tributavel {

    protected double valorVenal;

    public Imovel(Double vv) {
        this.valorVenal = vv;
    }
    @Override
    public double calcularImposto() {
        return this.valorVenal / 100;
    }
    
}
