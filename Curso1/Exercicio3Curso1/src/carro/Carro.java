package carro;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
