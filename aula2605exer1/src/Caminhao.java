//passo 4 - criar classe filha (subclasse)caminhao
//passo 5 - herdar veiculos
public class Caminhao extends Veiculo {

    // passo 6 - criar atributos exclussivos
    protected double capacidadeCarga;

    // passo 7 - criar construto com parametros

    public Caminhao(String p, int a, double c) {
     // passo 8 repassar pra classe mãe
    super(p, a);
    // passo 9 - definir o valor dos meus atributos
    this.capacidadeCarga = c;

    }
}