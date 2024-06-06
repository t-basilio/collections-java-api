package main.java.stream;

/* Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
(verdadeiro ou falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Instancia de um Predicate(Functional interface): recebe 1 parametro e retorna um bolleano
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Stream na lista de palavras paa filtrar com o predicate instanciado
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        System.out.println();
        //Implementando o metodo test com lambda
        palavras.stream().filter(p -> p.contains("a")).forEach(System.out::println);
    }
}
