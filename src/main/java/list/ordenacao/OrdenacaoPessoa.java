package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {

    private final List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        return pessoas.stream().sorted().toList();
    }
    public List<Pessoa> ordenarPorAltura() {
        return pessoas.stream().sorted(new ComparatorPorAltura()).toList();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
