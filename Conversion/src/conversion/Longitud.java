package conversion;

public class Longitud {

    public float celsiusToFahrenheit(float valorInsetado, float valorInsertado) {
        return (valorInsertado * 9 / 5) + 32;
    }

    public double celsiusToKelvin(float valorInsetado, float valorInsertado) {
        return valorInsertado + 273.15;
    }

    public double fahrenheitToCelsius(float valorInsetado, float valorInsertado) {
        return (valorInsertado - 32) * 5 / 9;
    }

    public double kelvinToCelsius(float valorInsetado, float valorInsertado) {
        return valorInsertado - 273.15;
    }

}
