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
    
    public float celsiusToFahrenheit(float valorInsertado) {
        
        
        float resultado;
        
        resultado = (float) ((valorInsertado * 1.8) + 32.0);
        
        return (resultado);
    }

    public double celsiusToKelvin(float valorInsertado) {
        
        float resultado;
        
        resultado = (valorInsertado);
        
        return (resultado);
    }

    public double fahrenheitToCelsius(float valorInsetado, float valorInsertado) {
        return (valorInsertado - 32) * 5 / 9;
    }

    public double kelvinToCelsius(float valorInsetado, float valorInsertado) {
        return valorInsertado - 273.15;
    }
}
