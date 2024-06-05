package main.java.set.operacoes_basicas;

public class OperacoesBasicasMain {

    public static void main(String[] args) {
        ConjuntoConvidado convidados =  new ConjuntoConvidado();

        convidados.adicionarConvidado("Carlos", 1234);
        convidados.adicionarConvidado("Marcos", 1235);
        convidados.adicionarConvidado("Joana", 1235);
        convidados.adicionarConvidado("Karen", 1236);

        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());

        if(convidados.removerConvidadoPorCodigoConvite(1236))
            System.out.println(convidados.exibirConvidados());
    }
}
