/**
 * MODULO 12: Entrada de Datos con Scanner
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: interactuar con el usuario por consola.
 */
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {

        // Reto 5: try-with-resources. El Scanner se cierra SOLO al terminar el bloque.
        try (Scanner sc = new Scanner(System.in)) {

            // Se fija el formato de EE.UU. para que los decimales se escriban
            // con PUNTO (1.75) y no con coma. Sin esto, en un equipo configurado
            // en espanol el nextDouble() lanzaria InputMismatchException.
            sc.useLocale(Locale.US);

            // ============ RETO 1: Lectura de Datos Primitivos ============
            System.out.println("===== RETO 1: Lectura de datos =====");
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese su estatura en metros (ej 1.75): ");
            double estatura = sc.nextDouble();

            // ============ RETO 2: Solucion al salto de buffer ============
            sc.nextLine();
            // ^ ESTA LINEA ES LA SOLUCION.
            // Problema: nextInt() y nextDouble() leen el numero pero DEJAN el
            // Enter (\n) en el buffer. El siguiente nextLine() lee ese Enter
            // vacio y "se salta" la pregunta. Con este nextLine() extra se
            // limpia el buffer y todo vuelve a funcionar.

            System.out.print("Ingrese su ciudad (prueba del buffer): ");
            String ciudad = sc.nextLine();

            System.out.println("\n--- FICHA DE RESUMEN ---");
            System.out.println("Nombre   : " + nombre);
            System.out.println("Edad     : " + edad + " anios");
            System.out.println("Estatura : " + estatura + " m");
            System.out.println("Ciudad   : " + ciudad);
            System.out.println("------------------------");

            // ============ RETO 3: Calculadora Interactiva ============
            System.out.println("\n===== RETO 3: Calculadora =====");
            System.out.print("Primer numero: ");
            double n1 = sc.nextDouble();
            System.out.print("Segundo numero: ");
            double n2 = sc.nextDouble();

            System.out.println("1. Suma  2. Resta  3. Multiplicacion  4. Division");
            System.out.print("Operacion: ");
            int op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Resultado: " + (n1 + n2));
                case 2 -> System.out.println("Resultado: " + (n1 - n2));
                case 3 -> System.out.println("Resultado: " + (n1 * n2));
                case 4 -> {
                    if (n2 == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + (n1 / n2));
                    }
                }
                default -> System.out.println("Operacion no valida.");
            }
            sc.nextLine(); // limpiar buffer otra vez

            // ============ RETO 4: Validacion de Entrada en Bucle ============
            System.out.println("\n===== RETO 4: Validacion de contrasena =====");
            final String CLAVE_CORRECTA = "admin123";
            String claveIngresada;
            int intentos = 0;

            do {
                System.out.print("Ingrese la contrasena: ");
                claveIngresada = sc.nextLine();
                intentos++;

                if (!claveIngresada.equals(CLAVE_CORRECTA)) {
                    System.out.println("Contrasena incorrecta. Intente de nuevo.");
                }
            } while (!claveIngresada.equals(CLAVE_CORRECTA));

            System.out.println("ACCESO CONCEDIDO en el intento numero " + intentos + ".");

        }
        // ============ RETO 5: cierre seguro ============
        // Al salir del try-with-resources Java llama automaticamente a sc.close().
        System.out.println("\nScanner cerrado automaticamente (try-with-resources).");
    }
}
