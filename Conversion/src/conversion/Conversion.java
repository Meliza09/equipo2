/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

/**
 *
 * @author carol
 */
import java.util.Scanner;

public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este es el menu primero\n 1.Temperatura\n 2.Longitud");
        Scanner primerMenu = new Scanner(System.in);
        
        
        switch(primerMenu){
            case 1:
                System.out.println("\n 1.Celcius a farenheit \n 2. Celcius a Kelvin \n 3.farenheit a Celsius\n 4. Kevin a Celsius");
                Scanner menuTemperatura = new Scanner(System.in);
                
            break;
            case 2:
                System.out.println("\n 1.Metros a Kilometros \n 2. Centimetros a metros");
                Scanner menuLongitud = new Scanner(System.in);
            break;
            
            default:
                break;
        }
        
        
        



    }
    
}
