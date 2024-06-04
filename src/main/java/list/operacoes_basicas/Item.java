package main.java.list.operacoes_basicas;

public class Item {

    private final String nome;
    private final Double preco;
    private final Integer quantidade;

    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double valorTotal() {
        return getQuantidade() * getPreco();
    }

    @Override
    public String toString() {
        return "Nome: %s %nPreço: R$%.2f %nQuantidade: %d".formatted(nome, preco, quantidade);
    }
}
