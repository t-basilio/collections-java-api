package main.java.set.ordenacao;

public class OrdenacaoMain {

    public static void main(String[] args) {

        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1L, "Iphone", 1500d, 1);
        produtos.adicionarProduto(2L, "Samsung", 1100d, 2);
        produtos.adicionarProduto(1L, "Ipod", 300d, 3);
        produtos.adicionarProduto(9L, "Nokia", 100d, 4);

        System.out.println(produtos.getProdutos());

        //System.out.println("Ordenado por nome: \n" + produtos.exibirProdutosPorNome());

        System.out.println("Ordenado por preço: \n" + produtos.exibirProdutosPorPreco());
    }
}
