public class App {
    public static void main(String[] args) throws Exception {
        Produtos p1 = new Produtos();
        p1.nome = "notebook";
        p1.preco = 1500.0;
        p1.quantidadeEstoque = 5;

        System.out.println("Valor em estoque " + p1.preco * p1.quantidadeEstoque);

        Produtos p2 = new Produtos();
        p2.nome = "mouse";
        p2.preco = 80;
        p2.quantidadeEstoque = 50;

        System.out.println("Valor em estoque" + p2.preco * p2.quantidadeEstoque);

        p1.adiconarEstoque(15);
        System.out.println("Quantidade Estoque P1:" + p1 quantidadeEstoque);
       
        p1.adiconarEstoque(15);
        System.out.println("Quantidade Estoque P2:"+ p2 quantidadeEstoque);
        
        p1.adiconarEstoque(15);
        System.out.println("Quantidade Estoque P2:" + p2 quantidadeEstoque);


    }
}
