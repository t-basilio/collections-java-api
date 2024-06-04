package main.java.list.pesquisa;

public class PesquisaMain {

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Drama 1", "José", 2021);
        catalogo.adicionarLivro("Drama 1", "João", 2020);
        catalogo.adicionarLivro("Romance", "João", 2022);
        catalogo.adicionarLivro("Ação", "Maria", 2023);
        catalogo.adicionarLivro("Ficção", "Ana", 2024);

        System.out.println("\nLivros por autor");
        System.out.println(catalogo.pesquisarPorAutor("João"));

        System.out.println("\nLivros por intervalo de ano");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2021));

        System.out.println("\nLivro por titulo");
        System.out.println(catalogo.pesquisarPorTitulo("Drama 1"));

        System.out.println("\n--------------Soma de Numeros--------------");
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(7);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(4);

        System.out.println("Numeros: " + numeros.exibirNumeros());
        System.out.println("Soma: " + numeros.calcularSoma());
        System.out.println("Maior: " +numeros.encontrarMaior());
        System.out.println("Menor: " +numeros.encontrarMenor());
    }
}
