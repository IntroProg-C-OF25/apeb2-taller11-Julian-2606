/***
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. Se debe invocar a los procedimientos desde un 
 * método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 
 * se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 */
import java.util.Scanner;

public class Ejercicio2_AreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular area cuadrado");
        System.out.println("2. Calcular area triangulo");
        System.out.println("3. Calcular area rectangulo");
        System.out.print("Ingrese el numero de la opcion: ");
        int opcion = scanner.nextInt();
        double valor1 = 0, valor2 = 0;
        if (opcion == 1) {
            System.out.print("Ingrese el lado del cuadrado: ");
            valor1 = scanner.nextDouble();
        } else if (opcion == 2 || opcion == 3) {
            System.out.print("Ingrese base: ");
            valor1 = scanner.nextDouble();
            System.out.print("Ingrese la altura: ");
            valor2 = scanner.nextDouble();
        }
        double area = calcularArea(opcion, valor1, valor2);
        if (area >= 0) {
            System.out.println("El area calculada es: " + area);
        } else {
            System.out.println("Opcion no valida");
        }
        scanner.close();
    }
    public static double calcularArea(int opcion, double valor1, double valor2) {
        switch (opcion) {
            case 1: 
                return valor1 * valor1;
            case 2: 
                return (valor1 * valor2) / 2;
            case 3: 
                return valor1 * valor2;
            default:
                return -1; 
        }
    }
}
/***
 * run:
Seleccione una opcion:
1. Calcular area cuadrado
2. Calcular area triangulo
3. Calcular area rectangulo
Ingrese el numero de la opcion: 1
Ingrese el lado del cuadrado: 2
El area calculada es: 4.0
* run:
Seleccione una opcion:
1. Calcular area cuadrado
2. Calcular area triangulo
3. Calcular area rectangulo
Ingrese el numero de la opcion: 2
Ingrese base: 5
Ingrese la altura: 6
El area calculada es: 15.0
* run:
Seleccione una opcion:
1. Calcular area cuadrado
2. Calcular area triangulo
3. Calcular area rectangulo
Ingrese el numero de la opcion: 3
Ingrese base: 8
Ingrese la altura: 3
El area calculada es: 24.0
 */
  