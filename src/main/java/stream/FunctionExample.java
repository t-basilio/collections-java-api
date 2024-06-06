package main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* Function<T, R>: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos. */
public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Instancia de uma Function(Functional interface): recebe 1 parametro e retorna um resultado
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Recebendo uma nova lista com o dobro dos numeros
        List<Integer> dobrados = numeros.stream()
                .map(dobrar).toList();
        dobrados.forEach(System.out::println);

        //implementando o metodo apply com lambda
        List<Integer> triplicados = numeros.stream()
                .map(n -> n * 3).toList();

        triplicados.forEach(System.out::println);
    }
}
