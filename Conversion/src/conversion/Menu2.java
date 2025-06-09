/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author angel
 */
public class Menu2 {
    
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
                        System.out.println("Resultado: " + temperatura.celsiusToFahrenheit(valor) + " °F");
                        break;
                    case 2:
                        System.out.println("Resultado: " + temperatura.celsiusToKelvin(valor) + " K");
                        break;
                    case 3:
                        System.out.println("Resultado: " + temperatura.fahrenheitToCelsius(valor) + " °C");
                        break;
                    case 4:
                        System.out.println("Resultado: " + temperatura.kelvinToCelsius(valor) + " °C");
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 5);

        System.out.println("Gracias por usar el conversor de temperatura.");
        scanner.close();
    }
    
}
