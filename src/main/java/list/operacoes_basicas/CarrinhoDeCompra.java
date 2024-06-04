package main.java.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private final List<Item> carrinho;

    public CarrinhoDeCompra() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public boolean removerItem(String nome) {
        if(!carrinho.isEmpty())
            return carrinho.removeAll(carrinho.stream()
                .filter(i -> i.getNome().equalsIgnoreCase(nome)).toList());
        return false;
    }

    public Double calcularValorTotal() {
        if(!carrinho.isEmpty())
            return carrinho.stream().map(Item::valorTotal)
                .reduce(Double::sum).orElseThrow();
        return 0D;
    }

    public String exibirItens() {
        if(!carrinho.isEmpty())
            return carrinho.stream().map(Item::toString)
                .reduce((item, next) -> item.concat("\n\n" + next)).orElseThrow();
        return "vazio!!!";
    }
}
