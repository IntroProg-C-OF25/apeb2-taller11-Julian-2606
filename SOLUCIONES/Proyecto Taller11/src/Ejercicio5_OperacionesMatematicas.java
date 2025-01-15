/***
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author julia
 */
import java.util.Random;
public class Ejercicio5_OperacionesMatematicas {
    public static void main(String[] args) {
        int dimension = 4; 
        int limiteInferior = 1; 
        int limiteSuperior = 10; 
        int[][] matriz = generarMatrizAleatoria(dimension, limiteInferior, limiteSuperior);
        System.out.println("Matriz aleatoria generada:");
        imprimirMatriz(matriz);
        System.out.println("Suma de la matriz: " + sumaMatriz(matriz));
        System.out.println("Resta de la matriz: " + restaMatriz(matriz));
        System.out.println("Multiplicacion de la matriz: " + multiplicacionMatriz(matriz));
    }
    public static int[][] generarMatrizAleatoria(int dimension, int limiteInferior, int limiteSuperior) {
        Random random = new Random();
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }
    public static int restaMatriz(int[][] matriz) {
        int resta = matriz[0][0]; // Inicializar con el primer elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0) continue; // Saltar el primer elemento ya usado
                resta -= matriz[i][j];
            }
        }
        return resta;
    }
    public static int multiplicacionMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                multiplicacion *= elemento;
            }
        }
        return multiplicacion;
    }
}
