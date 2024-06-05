package main.java.list.ordenacao;

public class OrdenacaoMain {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Thiago",20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Thais",30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Thifany",25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Thaize",17, 1.59);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        System.out.println(ordenacaoPessoa.getPessoas());
    }
}
