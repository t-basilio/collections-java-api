package main.java.map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private final Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatos.put(nome, numero);
    }

    public Integer remove(String nome) {
        if(!contatos.isEmpty())
            return contatos.remove(nome);

        return null;
    }

    public String exibirContatos() {
        return this.contatos.toString();
    }

    public Integer pesquiarPorNome(String nome) {
        if(!contatos.isEmpty())
            return contatos.get(nome);

        return null;
    }

}
