package main.java.list.pesquisa;

import java.util.*;

public class SomaNumeros {

    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        return numeros.stream().reduce(Integer::sum).orElseThrow();
    }

    public int encontrarMaior() {
        return numeros.stream().reduce(Integer::max).orElseThrow();
    }

    public int encontrarMenor() {
        return numeros.stream().reduce(Integer::min).orElseThrow();
    }

    public String exibirNumeros() {
        return numeros.toString();
    }
}
