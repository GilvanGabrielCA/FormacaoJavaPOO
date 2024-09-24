package calculadoraSala;

public class CalculadoraSalaRetangular implements CalculoGeometrico{


    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("Area da Sala: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perimetro da Sala: " + perimetro);
    }
}
