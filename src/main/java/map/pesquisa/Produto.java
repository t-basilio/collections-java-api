package main.java.map.pesquisa;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return Double.compare(this.preco, p.getPreco());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValotTotal() {
        return getQuantidade() * getPreco();
    }

    @Override
    public String toString() {
        return "%nNome: %s%nPreço: %.2f%nQuantidade: %d%n".formatted(nome, preco, quantidade);
    }

}
class ComparatorPorValorTotal implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getValotTotal(), p2.getValotTotal());
    }
}

