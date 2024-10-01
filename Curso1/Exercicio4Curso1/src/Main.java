import calculadoraSala.CalculadoraSalaRetangular;
import conversorDolar.ConversorMoeda;
import conversorTemperatura.ConversorTemperaturaPadrao;
import tabuada.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(50);

        System.out.println();

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5,8);
        calculadora.calcularPerimetro(5,8);

        System.out.println();

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(2);

        System.out.println();

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celciusParaFahrenheit(5);
        conversorTemperatura.fahrenheitParaCelsius(5);
    }
}