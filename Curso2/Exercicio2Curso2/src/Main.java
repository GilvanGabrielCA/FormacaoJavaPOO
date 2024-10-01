import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        //Inserindo produtos
        Produto produto1 = new Produto("Tv 4K", 4000.00, 15);
        Produto produto2 = new Produto("Notebook Dell", 6500.00, 50);
        Produto produto3 = new Produto("Microondas", 640.00, 5);
        Produto produto4 = new Produto("Cafeteira", 100.00, 2);
        Produto produto5 = new Produto("Ferro de Passa", 250.50, 1);
        Produto produto6 = new Produto("Iphone 16", 8499.00, 32);
        Produto produto7 = new Produto("Umidificador", 249.00, 21);

        //Colocando produtos no ArrayList
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);
        listaProdutos.add(produto6);
        listaProdutos.add(produto7);

        //Mostrando o tamanho da lista de Produtos
        System.out.println("A lista contem " + listaProdutos.size() + " produtos");

        //Imprimindo todos os itens da lista
        System.out.println(listaProdutos);

        //Buscando item na lista pelo Index
        System.out.println(listaProdutos.get(3));

        //Inserindo produtos Pereciveis
        ProdutoPerecivel item1 = new ProdutoPerecivel("Leite", 4.50, 10, "01/10/2024");
        ProdutoPerecivel item2 = new ProdutoPerecivel("Queijo", 12.00, 5, "15/09/2024");
        ProdutoPerecivel item3 = new ProdutoPerecivel("Iogurte", 3.75, 20, "10/10/2024");
        ProdutoPerecivel item4 = new ProdutoPerecivel("Pão", 6.00, 15, "25/09/2024");
        ProdutoPerecivel item5 = new ProdutoPerecivel("Carne", 35.00, 8, "30/09/2024");
        ProdutoPerecivel item6 = new ProdutoPerecivel("Frango", 20.00, 12, "02/10/2024");
        ProdutoPerecivel item7 = new ProdutoPerecivel("Peixe", 25.50, 7, "05/10/2024");

        ArrayList<ProdutoPerecivel> listaProdutosPereciveis = new ArrayList<>();

        //Colocando produtos no ArrayList
        listaProdutosPereciveis.add(item1);
        listaProdutosPereciveis.add(item2);
        listaProdutosPereciveis.add(item3);
        listaProdutosPereciveis.add(item4);
        listaProdutosPereciveis.add(item5);
        listaProdutosPereciveis.add(item6);
        listaProdutosPereciveis.add(item7);

        //Mostrando o tamanho da lista de Produtos
        System.out.println("A lista contem " + listaProdutosPereciveis.size() + " produtos");

        //Imprimindo todos os itens da lista
        System.out.println(listaProdutosPereciveis);

        //Buscando item na lista pelo Index
        System.out.println(listaProdutosPereciveis.get(3));
    }
}