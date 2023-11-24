/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventarios_2;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class Inventarios_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Proveedores pv=new Proveedores();
        Pedidos pd=new Pedidos();
        int opcion;
        do {
            menu();
            System.out.print("Porfavor, elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----- Proveedores -----");
                    pv.Proveedores();break;
                case 2:
                    System.out.println("----- Pedidos -----");
                    pd.Pedidos();break;
                case 3:
                    System.out.println("----- Productos -----");
                    Productos();
                    break;
                case 4:
                    System.out.println("----- Ventas -----");
                    Ventas();
                    break;
                case 5:
                    System.out.println("----- Devoluciones -----");
                    Devoluciones();
                    break;
                case 6:
                    System.out.println("Pase un lindo dia!");
                    break;
                default:
                    System.out.println("Invalido, porfavor intente nuevamente.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
        
    }
     /// MENU PRINCIPAL
    private static void menu() {
        System.out.println("Zapateria El callo feliz");
        System.out.println("Bienvenido/a a Control de Inventario!");
        System.out.println("\n*--- Menu ---*");
        System.out.println("1. Proveedores");
        System.out.println("2. Pedidos");
        System.out.println("3. Productos");
        System.out.println("4. Ventas");
        System.out.println("5. Devoluciones");
        System.out.println("6. Salir");
    }

    private static void Productos() {
        
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

    private static void Ventas() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("/// Escogio Ventas ///");
        
    }

    private static void Devoluciones() {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("/// Escogio Devoluciones ///");
        
        
    }

}
