package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CadastroProdutos {

    private final Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtos.add(new Produto(cod, nome, preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return produtos.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Produto> exibirProdutosPorPreco() {
        return produtos.stream().sorted(new ComparatorPorPreco())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
