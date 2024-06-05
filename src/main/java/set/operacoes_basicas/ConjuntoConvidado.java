package main.java.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private final Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidados.add( new Convidado(nome,codigoConvidado));
    }

    public boolean removerConvidadoPorCodigoConvite(int codigoConvite) {
        return convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);
    }

    public String exibirConvidados() {
        return convidados.toString();
    }

    public int contarConvidados() {
        return convidados.size();
    }


}
