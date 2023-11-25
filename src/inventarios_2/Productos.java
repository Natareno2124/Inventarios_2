package inventarios_2;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Productos {
    public static void Productos() {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("/// Escogio Productos ///");
        
        System.out.print("Ingrese el código del artículo: ");
        int cod_art = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Ingrese la cantidad de artículos: ");
        int cantidad_art = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Ingrese el tipo de artículo: ");
        String tipo_art = scanner.nextLine();
        
        System.out.print("Ingrese la talla: ");
        int talla = scanner.nextInt();

        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Código del artículo: " + cod_art);
        System.out.println("Cantidad de artículos: " + cantidad_art);
        System.out.println("Tipo de artículo: " + tipo_art);
        System.out.println("Talla: " + talla);
    }
    
    
}
