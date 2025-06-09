/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Menu2 {
   int valorInsertado, valorInsertado1, valor1,valor2,valor3, valor4, valor5, valor6;
  Temperatura temperatura = new Temperatura();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        

        do {
            System.out.println("\n--- Conversor de Temperatura ---");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Fahrenheit a Celsius");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el valor de temperatura: ");
                float valor = scanner.nextFloat();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + temperatura.celsiusToFahrenheit(valorInsertado, valorInsertado1) + " °F");
                        break;
                    case 2:
                        System.out.println("Resultado: " + temperatura.celsiusToKelvin(valor1, valor2) + " K");
                        break;
                    case 3:
                        System.out.println("Resultado: " + temperatura.fahrenheitToCelsius(valor3,valor4) + " °C");
                        break;
                    case 4:
                        System.out.println("Resultado: " + temperatura.kelvinToCelsius(valor5, valor6) + " °C");
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
      
    }while(opcion != 4);
        
    
    
}
