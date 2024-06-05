package main.java.map.operacoes_basicas;

public class OperacoesBasicasMain {

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Thiago", 123456);
        contatos.adicionarContato("Thiago", 5665);
        contatos.adicionarContato("Thiago Basilio", 111111);
        contatos.adicionarContato("Camila DIO", 654987);
        contatos.adicionarContato("Maria Silva", 111111);
        contatos.adicionarContato("Thiago", 444444);
        System.out.println(contatos.exibirContatos());

        System.out.println("Removido: " + contatos.remove("Maria Silva"));
        System.out.println(contatos.exibirContatos());

        System.out.println("Perquisado: " + contatos.pesquiarPorNome("Thiago"));
    }
}

