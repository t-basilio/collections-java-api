package main.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* Consumer<T>: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar
ou retornar um valor. */
public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Instancia de um Consumer(Fuctional interface): recebe 1 parametro e não retorna nada, void
        Consumer<Integer> printNumerosPares = numero -> {
            if(numero % 2 == 0)
                System.out.print(numero + " ");
        };
        numeros.forEach(printNumerosPares);

        //implementação do metodo apply com lambda
        System.out.println();
        numeros.forEach( n -> {
            if(n % 2 == 1)
                System.out.print(n + " ");

        });
    }
}
