/***
*Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de 
 gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
 */
import java.util.Scanner;

public class Ejercicio1_ProcesoDeArreglo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFilas = 0, limCol = 0;
        System.out.print("dame limFilas y limCol: ");
        limFilas = tcl.nextInt(); limCol = tcl.nextInt();
        int matriz[][] = new int[limFilas][limCol];
        gererarMatriz(matriz);
        System.out.println("MATRIZ GENERADA: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedioMatriz(matriz);
    }
    public static void gererarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                
            }
        }
    }
    public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");              
            }
            System.out.println("");
        }
    }
    public static void presentarParImparMatriz(int matriz[][]){
        System.out.println("ELEMENTOS PARES DE LA MATRIZ: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 == 0) ? matriz[i][j] + (" ") : "");
                /*if ((matriz[i][j]%2) == 0);
                System.out.print(matriz[i][j]+" "); */             
            }
            System.out.println("");
        }
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2 != 0) ? matriz[i][j] + (" ") : "");
                /*if ((matriz[i][j]%2) == 0);
                System.out.print(matriz[i][j]+" "); */             
            }
            System.out.println("");
        }
    }
    public static void presentarPromedioMatriz(int matriz[][]){
        int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];             
            }
            promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
            System.out.println("PROMEDIO MATRIZ: " + promedioMatriz);
        }
    }
}
/***
 * dame limFilas y limCol: 5
5
MATRIZ GENERADA: 
8 9 9 8 3 
7 4 6 0 9 
0 5 3 6 7 
2 4 6 0 2 
2 8 9 8 4 
ELEMENTOS PARES DE LA MATRIZ: 
8 8 
4 6 0 
0 6 
2 4 6 0 2 
2 8 8 4 
ELEMENTOS IMPARES DE LA MATRIZ: 
9 9 3 
7 9 
5 3 7 

9 
PROMEDIO MATRIZ: 1
PROMEDIO MATRIZ: 2
PROMEDIO MATRIZ: 3
PROMEDIO MATRIZ: 3
PROMEDIO MATRIZ: 5
 */