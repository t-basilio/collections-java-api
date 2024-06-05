package main.java.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private final Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public String exibirAgenda() {
        return new TreeMap<>(eventos).toString();
    }

    public String obterProximoEvento() {
        LocalDate hoje = LocalDate.now();

        Map.Entry<LocalDate, Evento> evento = eventos.entrySet().stream()
                .filter(e -> e.getKey().equals(hoje) || e.getKey().isAfter(hoje))
                .findFirst().orElseThrow();

        return "(%s) %s".formatted(evento.getKey(), evento.getValue());
    }
}
