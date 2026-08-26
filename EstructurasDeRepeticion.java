/**
 * MODULO 6: Estructuras de Repeticion (Bucles)
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: automatizar tareas repetitivas.
 */
import java.util.Scanner;

public class EstructurasDeRepeticion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============ RETO 1: Bucle While ============
        System.out.println("===== RETO 1: Bucle While (cuenta regresiva) =====");
        int cuenta = 10;
        while (cuenta >= 1) {
            System.out.print(cuenta + " ");
            cuenta--;
        }
        System.out.println("\n¡Despegue!");

        // ============ RETO 3: Bucle For ============
        System.out.println("\n===== RETO 3: Bucle For (suma de pares 1 a 100) =====");
        int sumaPares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de todos los pares entre 1 y 100 es: " + sumaPares);

        // ============ RETO 4: For Anidado ============
        System.out.println("\n===== RETO 4: For Anidado (tablas del 1 al 5) =====");
        for (int tabla = 1; tabla <= 5; tabla++) {
            System.out.println("--- Tabla del " + tabla + " ---");
            for (int mult = 1; mult <= 10; mult++) {
                System.out.printf("%d x %2d = %3d%n", tabla, mult, (tabla * mult));
            }
            System.out.println();
        }

        // ============ RETO 5: Control de Bucles (break y continue) ============
        System.out.println("===== RETO 5: break y continue =====");
        for (int i = 1; i <= 20; i++) {
            if (i == 17) {
                System.out.println("\nLlegue al 17 -> BREAK: se detiene el bucle.");
                break;                 // sale del bucle por completo
            }
            if (i % 3 == 0) {
                continue;              // salta esta vuelta y sigue con la siguiente
            }
            System.out.print(i + " ");
        }

        // ============ RETO 2: Bucle Do-While (menu interactivo) ============
        System.out.println("\n\n===== RETO 2: Do-While (menu interactivo) =====");
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Saludar");
            System.out.println("2. Ver hora");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println(">> ¡Hola Jair, bienvenido al programa!");
                case 2 -> System.out.println(">> Hora actual: " + java.time.LocalTime.now().withNano(0));
                case 0 -> System.out.println(">> Saliendo del menu...");
                default -> System.out.println(">> Opcion no valida, intente de nuevo.");
            }
            // el do-while SIEMPRE ejecuta al menos una vez antes de preguntar
        } while (opcion != 0);

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
