/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author rafaelbravo
 */
public class Temperatura {
    
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
