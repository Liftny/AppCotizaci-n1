/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package appCotizaProducto;

import java.util.Scanner;
import modelos.CotizaProducto;

public class App {
    
    public static void main(String[] args) {
       int opcion,cantidad;
       Scanner scanner=new Scanner(System.in);
        System.out.println("Bienvenido a tu app que cotiza tus productos");
        System.out.println("1. Monitor");
        System.out.println("2. Teclado");
        System.out.println("3. Mouse");
        System.out.print("Escoge una opci�n: ");
        opcion=scanner.nextInt();
        System.out.print("Ingrese la cantidad que va a adquirir: ");
        cantidad=scanner.nextInt();
        CotizaProducto cotizaProducto=new CotizaProducto(opcion);
        cotizaProducto.setCantidad(cantidad);
        System.out.print(cotizaProducto);
    }
}
