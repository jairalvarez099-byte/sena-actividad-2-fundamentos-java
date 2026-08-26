/**
 * MODULO 8: Arreglos Unidimensionales
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: guardar muchos datos del mismo tipo en una sola variable.
 */
import java.util.Arrays;

public class ArreglosUnidimensionales {

    // ============ RETO 4: metodo que invierte un arreglo ============
    public static int[] invertirArreglo(int[] original) {
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            // el ultimo del original va de primero en el nuevo
            invertido[i] = original[original.length - 1 - i];
        }
        return invertido;
    }

    public static void main(String[] args) {

        // ============ RETO 1: Recorrido For-Each ============
        System.out.println("===== RETO 1: Recorrido For-Each =====");
        String[] lenguajes = {"Java", "Python", "JavaScript", "C#", "Kotlin"};
        for (String lenguaje : lenguajes) {
            System.out.println("- " + lenguaje);
        }

        // ============ RETO 2: Busqueda de Maximo y Minimo ============
        System.out.println("\n===== RETO 2: Maximo y Minimo =====");
        int[] numeros = {45, 12, 89, 3, 67, 23, 90, 8, 55, 31};
        System.out.println("Arreglo: " + Arrays.toString(numeros));

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }
        System.out.println("Valor mayor : " + mayor);
        System.out.println("Valor menor : " + menor);

        // ============ RETO 3: Promedio de Calificaciones ============
        System.out.println("\n===== RETO 3: Promedio de Calificaciones =====");
        double[] notas = {4.5, 3.8, 2.9, 5.0, 4.1, 3.5};
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;
        System.out.println("Notas    : " + Arrays.toString(notas));
        System.out.printf("Promedio : %.2f%n", promedio);

        // ============ RETO 4: Inversion de Arreglo ============
        System.out.println("\n===== RETO 4: Inversion de Arreglo =====");
        int[] original = {1, 2, 3, 4, 5, 6};
        int[] alReves = invertirArreglo(original);
        System.out.println("Original  : " + Arrays.toString(original));
        System.out.println("Invertido : " + Arrays.toString(alReves));

        // ============ RETO 5: Conteo de Pares e Impares ============
        System.out.println("\n===== RETO 5: Conteo de Pares e Impares =====");
        int[] quince = {3, 8, 12, 7, 5, 20, 33, 44, 51, 6, 19, 28, 11, 2, 17};
        int pares = 0;
        int impares = 0;

        for (int n : quince) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Arreglo : " + Arrays.toString(quince));
        System.out.println("Pares   : " + pares);
        System.out.println("Impares : " + impares);
        System.out.println("Total   : " + quince.length);
    }
}
