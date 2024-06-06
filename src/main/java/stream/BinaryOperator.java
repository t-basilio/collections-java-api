package main.java.stream;

/* BinaryOperator<T>: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo
 tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.*/

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> palavras = Arrays.asList("Hoje", "o", "céu", "está", "tão", "lindo");

        //Intancia de um BinaryOperator(Functional interface): recebe 2 parametro e retorna outro do mesmo tipo
        java.util.function.BinaryOperator<Integer> somar = Integer::sum;

        //Obtendo a soma de todos os numeros da lista
        int resultado = numeros.stream().reduce(0 ,somar);
        System.out.println("Soma: " + resultado);

        //Implementando o metodo apply com lambda
        String frase = palavras.stream()
                .reduce("** ", (p, next) -> p.concat(" " + next));

        System.out.println(frase);
    }
}
