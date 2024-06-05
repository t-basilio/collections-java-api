package main.java.set.pesquisa;

public class PesquisaMain {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Thiago", 123456);
        contatos.adicionarContato("Thiago", 5665);
        contatos.adicionarContato("Thiago Basilio", 111111);
        contatos.adicionarContato("Thiago DIO", 654987);
        contatos.adicionarContato("Camila Cavalcante", 111111);

        System.out.println(contatos.exibirContatos());

        System.out.println("\nPesquisando: \n" + contatos.pesquisarPorNome("Thi"));

        System.out.println("\nAtualizando: " + contatos
                .atualizarNumeroContato("Thiago Basilio", 222222));

    }
}
