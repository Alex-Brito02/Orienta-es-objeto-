public class Produtos {

    String nome;
    double preco;
    int quantidadeEstoque;

    public void adiconarEstoque(int quantidade) {
        this.quantidadeEstoque = this.quantidadeEstoque + quantidade;

        System.out.println("Estoque atualizado!");
        
    }
        
    }


