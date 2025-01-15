/***
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular 
 * el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre 
 * del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de 
 * kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 
 * debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca 
 * el 2% del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al 
 * procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author julia
 */
import java.util.Scanner;
public class Ejercicio4_ValorPlantillaLuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la cedula del cliente: ");
        String cedulaCliente = scanner.nextLine();
        System.out.print("Ingrese 1 para calcular el valor de la luz o 2 para calcular el valor del predio: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            calcularValorLuz(nombreCliente, cedulaCliente);
        } else if (opcion == 2) {
            calcularPredio(nombreCliente, cedulaCliente);
        } else {
            System.out.println("Opcion no valida");
        }
        scanner.close();
    }
    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del kilowatio: ");
        double valorKilowatio = scanner.nextDouble();
        System.out.print("Ingrese el numero de kilowatios del mes: ");
        double numeroKilowatios = scanner.nextDouble();
        double valorTotal = valorKilowatio * numeroKilowatios;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%.2f%n", 
                          nombreCliente, cedulaCliente, valorTotal);
    }
    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = scanner.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n", 
                          nombreCliente, cedulaCliente, valorInmueble, valorPredio);
    }
}
/***
 * run:
Ingrese el nombre del cliente: Julian
Ingrese la cedula del cliente: 1105597148
Ingrese 1 para calcular el valor de la luz o 2 para calcular el valor del predio: 1
Ingrese el valor del kilowatio: 30
Ingrese el numero de kilowatios del mes: 300
Cliente Julian con cedula 1105597148 debe cancelar el valor de $9000,00
 */