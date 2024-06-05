package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private final Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatos.add(new Contato(nome,numero));
    }

    public String exibirContatos() {
        return this.contatos.toString();
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        return contatos.stream()
                .filter(c -> c.getNome().startsWith(nome)).collect(Collectors.toSet());
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
         Contato atual = contatos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nome)).findFirst().orElseThrow();

         atual.setNumero(novoNumero);
         return atual;
    }
}
