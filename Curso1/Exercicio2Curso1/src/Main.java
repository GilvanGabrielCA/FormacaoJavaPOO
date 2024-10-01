public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(123);
        contaBancaria.setSaldo(1000);
        contaBancaria.titular = "João";

        System.out.println("Numero Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        System.out.println("Titular: " + contaBancaria.titular);

        contaBancaria.setSaldo(1500);
        System.out.println("Numero Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        System.out.println("Titular: " + contaBancaria.titular);

        System.out.println();

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carol");
        pessoa1.setIdade(27);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Jamile");
        pessoa2.setIdade(11);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        pessoa1.verificaIdade();
        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        pessoa2.verificaIdade();

        System.out.println();

        Produto produto = new Produto();
        produto.setNome("TV 4K");
        produto.setPreco(2000);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        produto.aplicarDesconto(10);

        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("Gilvan");
        aluno.setNota1(7);
        aluno.setNota2(9);
        aluno.setNota3(6);
        aluno.calcularMedia();

        System.out.println();

        Livro livro = new Livro();
        livro.setAutor("Rick Riordan");
        livro.setTitulo("Percy Jakson e o Ladrão de Raios");

        livro.exibirDetalhes();
    }
}