package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private final List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if(!livros.isEmpty()) {
            return livros.stream().filter
                    (l -> l.getAutor().equalsIgnoreCase(autor)).toList();
        }
        return livros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if(!livros.isEmpty()) {
            return livros.stream().filter
                    (l -> l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal).toList();
        }
        return livros;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if(!livros.isEmpty()) {
            return livros.stream().filter
                    (l -> l.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElseThrow();
        }
        return null;
    }

}
