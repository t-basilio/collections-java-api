package main.java.map.pesquisa;

public class PesquisaMain {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        produtos.adicionarProduto(1L, "Iphone", 5500d, 1);
        produtos.adicionarProduto(2L, "Samsung", 4100d, 1);
        produtos.adicionarProduto(3L, "Dell", 3500d, 2);
        produtos.adicionarProduto(4L, "Lenovo", 2100d, 2);
        produtos.adicionarProduto(5L, "LG", 1000d, 1);

        System.out.println(produtos.exibirProdutos());

        System.out.println("Valor do estoque: " + produtos.calcularValorTotalEstoque());
        System.out.println("\nProduto mais barato: " + produtos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + produtos.obterProdutoMaisCaro());

        System.out.println("Produto com valor mais caro: " + produtos.obterProdutoValorMaisCaro());
        System.out.println("Produto com valor mais barato: " + produtos.obterProdutoValorMaisBarato());

    }
}
