/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarios_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Proveedores {
    int opc=1;

    public static void Proveedores() {
        int opc=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("/// Escogio Proveedores ///");
        while(opc==1) 
        {
            System.out.print("Ingrese el nombre del proveedor: ");
            String prov_nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del proveedor: ");
            String prov_apell = scanner.nextLine();
            System.out.print("Ingrese el DPI del proveedor: ");
            String dpi = scanner.nextLine();
            System.out.println("\n--- Datos del Proveedor ---");
            System.out.println("Nombre: " + prov_nombre);
            System.out.println("Apellido: " + prov_apell);
            System.out.println("DPI: " + dpi);
            System.out.print("Deseas agregar otro proveedor? (1)Si/(2)No: ");
            opc=scanner.nextInt();
            scanner.nextLine();
            while(opc!=1 && opc!=2) {
                System.out.print("Opcion invalida, vuelve a intentar: ");
                opc=scanner.nextInt();
            }

        }
    }
    
}
