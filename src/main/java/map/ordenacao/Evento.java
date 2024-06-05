package main.java.map.ordenacao;

public class Evento {

    private final String nome;
    private final String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Nome: %s Atraçao: %s%n".formatted(getNome(), getAtracao());
    }
}
