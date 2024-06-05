package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private final Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.put(cod, new Produto(nome, preco, quantidade));
    }

    public String exibirProdutos(){
        StringBuilder result = new StringBuilder();
        for (Long cod: produtos.keySet()) {
            result.append(cod).append(produtos.get(cod).toString());
        }
        return result.toString();
    }

    public Double calcularValorTotalEstoque() {
        if(!produtos.isEmpty())
            return produtos.values().stream().map(Produto::getValotTotal)
                    .reduce(Double::sum).orElseThrow();
        return null;
    }

    public Produto obterProdutoMaisCaro() {
        return produtos.values().stream()
                .max(Produto::compareTo).orElseThrow();
    }

    public Produto obterProdutoMaisBarato() {
        return produtos.values().stream()
                .min(Produto::compareTo).orElseThrow();
    }

    public Produto obterProdutoValorMaisCaro() {
        return produtos.values().stream()
                .max(new ComparatorPorValorTotal()).orElseThrow();
    }

    public Produto obterProdutoValorMaisBarato() {
        return produtos.values().stream()
                .min(new ComparatorPorValorTotal()).orElseThrow();
    }
}
