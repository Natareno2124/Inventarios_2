package inventarios_2;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Devoluciones {
    public static void Devoluciones() {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("/// Escogio Devoluciones ///");
        System.out.print("Ingrese el código del artículo: ");
        int cod_art = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Ingrese el codigo de venta: ");
        String codigoVenta = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de devolucion: ");
        String fecha = scanner.nextLine();

        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Código del artículo: " + cod_art);
        System.out.println("Codigo venta: " + codigoVenta);
        System.out.println("fecha: " + fecha);
    }
    
}
