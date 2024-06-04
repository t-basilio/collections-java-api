import main.java.list.operacoes_basicas.CarrinhoDeCompra;
import main.java.list.operacoes_basicas.ListaTarefa;

public class OperacoesBasicasMain {
    public static void main(String[] args) {
        System.out.println("\n------------Lista De Tarefas-----------------\n");
        ListaTarefa tarefas = new ListaTarefa();

        tarefas.adicionarTarefa("Dar comida pro pet");
        tarefas.adicionarTarefa("Dar Comida pro pet");
        tarefas.adicionarTarefa("Varrer a casa");
        tarefas.adicionarTarefa("Lavar a louça");
        tarefas.adicionarTarefa("Fazer a lição de casa");
        System.out.println("Numero de tarefas: " + tarefas.obterNumeroTotalTarefas());

        boolean removeTarefa = tarefas.removerTarefa("dar comida pro pet");

        if (removeTarefa)
            System.out.println("tarefas restantes: " + tarefas.obterNumeroTotalTarefas());

        System.out.println("Tarefas: \n" + tarefas.obterDescricoesTarefas());


        System.out.println("\n------------Carrinho De Compras-----------------\n");
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem("Laranja", 5.0, 10);
        carrinho.adicionarItem("Arroz", 30.0, 2);
        carrinho.adicionarItem("Feijão", 9.0, 4);

        boolean removeItem = carrinho.removerItem("Feijão");

        if (removeItem)
            System.out.println(carrinho.exibirItens());

        System.out.printf("%nValor Total do carrinho: R$%.2f", carrinho.calcularValorTotal());
    }
}