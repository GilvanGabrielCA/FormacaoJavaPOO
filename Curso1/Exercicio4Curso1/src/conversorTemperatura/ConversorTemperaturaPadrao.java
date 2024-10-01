package conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celciusParaFahrenheit(double celcius) {
        double fahrenheit = (celcius * (9.0/5.0) + 32);
        System.out.println(String.format("%.1f", celcius) + "ºC correspondem a " + String.format("%.1f", fahrenheit) + "ºF");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celcius = ((fahrenheit - 32) * (5.0/9.0));
        System.out.println(String.format("%.1f", fahrenheit) + "ºF correspondem a " + String.format("%.1f", celcius) + "ºC");
    }
}
