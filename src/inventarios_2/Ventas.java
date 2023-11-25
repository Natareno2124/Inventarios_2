package inventarios_2;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Ventas {
  public static void Ventas() {
      
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("/// Escogio Ventas ///");
        System.out.print("Ingrese el código del artículo: ");
        int cod_art = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Ingrese la cantidad de artículos vendidos: ");
        int cantidad_art = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Ingrese el precio del artículo: ");
        String precio = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de venta: ");
        String fecha = scanner.nextLine();

        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Código del artículo: " + cod_art);
        System.out.println("Cantidad de artículos: " + cantidad_art);
        System.out.println("Tipo de artículo: " + precio);
        System.out.println("fecha: " + fecha);
  }  
}
