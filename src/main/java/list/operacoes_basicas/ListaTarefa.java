package main.java.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private final List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public boolean removerTarefa(String descricao) {
        if(!tarefas.isEmpty())
            return tarefas.removeAll(tarefas.stream()
                .filter(t -> t.getDescricao().equalsIgnoreCase(descricao)).toList());
        return false;
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public String obterDescricoesTarefas() {
        if(!tarefas.isEmpty())
            return tarefas.stream().map(Tarefa::getDescricao)
                .reduce((desc, next) -> desc.concat("\n" + next)).orElseThrow();
        return "vazio!!!";
    }
}
