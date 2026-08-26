/**
 * MODULO 9: Arreglos Bidimensionales (Matrices)
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: organizar datos en filas y columnas, como una tabla de Excel.
 */
public class ArreglosBidimensionales {

    public static void main(String[] args) {

        // ============ RETO 1: Creacion e Impresion de Matriz ============
        System.out.println("===== RETO 1: Matriz 3x3 =====");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.printf("%4d", matriz[fila][col]);
            }
            System.out.println();
        }

        // ============ RETO 2: Suma por Filas y Columnas ============
        System.out.println("\n===== RETO 2: Suma por Filas y Columnas =====");
        for (int fila = 0; fila < 3; fila++) {
            int sumaFila = 0;
            for (int col = 0; col < 3; col++) {
                sumaFila += matriz[fila][col];
            }
            System.out.println("Suma de la fila " + fila + " = " + sumaFila);
        }

        for (int col = 0; col < 3; col++) {
            int sumaCol = 0;
            for (int fila = 0; fila < 3; fila++) {
                sumaCol += matriz[fila][col];
            }
            System.out.println("Suma de la columna " + col + " = " + sumaCol);
        }

        // ============ RETO 3: Diagonal Principal ============
        System.out.println("\n===== RETO 3: Diagonal Principal (matriz 4x4) =====");
        int[][] m4 = {
            {10, 11, 12, 13},
            {14, 15, 16, 17},
            {18, 19, 20, 21},
            {22, 23, 24, 25}
        };
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            // la diagonal principal es donde fila == columna
            System.out.print(m4[i][i] + " ");
        }
        System.out.println();

        // ============ RETO 4: Busqueda de Elemento ============
        System.out.println("\n===== RETO 4: Busqueda de Elemento =====");
        int buscado = 6;
        boolean encontrado = false;

        for (int fila = 0; fila < 3 && !encontrado; fila++) {
            for (int col = 0; col < 3; col++) {
                if (matriz[fila][col] == buscado) {
                    System.out.println("El numero " + buscado + " esta en la posicion ["
                                       + fila + "][" + col + "]");
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El numero " + buscado + " NO existe en la matriz.");
        }

        // ============ RETO 5: Matriz Transpuesta ============
        System.out.println("\n===== RETO 5: Matriz Transpuesta (2x3 -> 3x2) =====");
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transpuesta = new int[3][2];   // se invierten las dimensiones

        for (int fila = 0; fila < 2; fila++) {
            for (int col = 0; col < 3; col++) {
                transpuesta[col][fila] = original[fila][col];
            }
        }

        System.out.println("Original (2x3):");
        imprimirMatriz(original);
        System.out.println("Transpuesta (3x2):");
        imprimirMatriz(transpuesta);
    }

    // Metodo auxiliar para no repetir codigo al imprimir
    public static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}
