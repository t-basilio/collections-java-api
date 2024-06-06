package main.java.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
É comumente usada para criar ou fornecer novos objetos de um determinado tipo. */
public class SupplierExample {
    public static void main(String[] args) {

        //Instancia de Supplier(Functional interface): não recebe parametro e retorna uma frase<String>
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Gerando uma lista com Strem.genarate passando o Supplier
        List<String> saudacoes = Stream.generate(saudacao).limit(4).toList();

        saudacoes.forEach(System.out::println);

        //implementação do metodo get com lambda
        List<String> despedidas = Stream.generate(() -> "Até logo!").limit(3).toList();

        despedidas.forEach(System.out::println);
    }
}
