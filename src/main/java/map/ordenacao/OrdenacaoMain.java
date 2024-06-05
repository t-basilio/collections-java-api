package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class OrdenacaoMain {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 5),
                "Intercambio", "Conhecendo o Canadá");

        eventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),
                "Futebol", "Seleção brasileira");

        eventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 9),
                "Cinema", "Os Vingadores");

        eventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 6),
                "Viva melhor", "Palestra de saúde");

        eventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10),
                "Passeio", "Hoppy Hari");

        System.out.println("Eventos: \n" + eventos.exibirAgenda());

        System.out.println("Próximo evento " + eventos.obterProximoEvento());
    }
}
