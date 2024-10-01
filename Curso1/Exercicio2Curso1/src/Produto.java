public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aplicarDesconto(double porcentagemDesconto){
        double Desconto = preco * (porcentagemDesconto / 100);
        preco -= Desconto;
        System.out.println("O desconto do produto " + nome + " é de " + porcentagemDesconto + " valor final = " + preco);
    }
}