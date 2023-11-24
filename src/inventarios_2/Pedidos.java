/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarios_2;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Pedidos {

    public static void Pedidos(){
        System.out.println("/// Escogio Pedidos ///");
        Scanner sc =new Scanner(System.in);
        int opc=1;
        while(opc==1) 
        {
            System.out.print("Proveedor: ");
            String prov_nombre = sc.nextLine();
            System.out.print("Producto solicitado: ");
            String produc = sc.nextLine();
            System.out.print("Talla solicitada: ");
            int talla = sc.nextInt();
            System.out.print("Cantidad solicitada: ");
            int cant = sc.nextInt();
            System.out.println("\n--- Datos del Pedido ---");
            System.out.println("Proveedor: " + prov_nombre);
            System.out.println("Producto : " + produc);
            System.out.println("Talla: " + talla);
            System.out.println("Cantidad : " + cant);
            
            System.out.print("Deseas agregar otro producto al pedido? (1)Si/(2)No: ");
            opc=sc.nextInt();
            sc.nextLine();
            while(opc!=1 && opc!=2) {
                System.out.print("Opcion invalida, vuelve a intentar: ");
                opc=sc.nextInt();
            }

        }
    
    }
}
