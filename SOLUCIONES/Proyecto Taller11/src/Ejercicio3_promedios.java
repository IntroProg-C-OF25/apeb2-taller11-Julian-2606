
/** *
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio
 * cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados
 * solicitados al usuario.
 *
 * @author julia
 */
import java.util.Scanner;
public class Ejercicio3_promedios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las cuatro notas:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();
        String resultado = promedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.println("El promedio cualitativo es: " + resultado);
        scanner.close();
    }
    public static String promedioCualitativo(double nota1, double nota2, double nota3, double nota4) {
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}
/***
 * run:
Ingrese las cuatro notas:
Nota 1: 5
Nota 2: 8
Nota 3: 4,5
Nota 4: 3
El promedio cualitativo es: Bueno
 */