/**
 * MODULO 11: Manejo de Excepciones
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: que el programa NO se caiga cuando ocurre un error inesperado.
 */
public class ManejoBasicoExcepciones {

    public static void main(String[] args) {

        // ============ RETO 1: Try-Catch Basico ============
        System.out.println("===== RETO 1: ArithmeticException (division por cero) =====");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERROR CAPTURADO: no se puede dividir entre cero.");
            System.out.println("Mensaje tecnico: " + e.getMessage());
        }
        System.out.println("El programa CONTINUA normalmente.");

        // ============ RETO 2: Excepcion de Fuera de Rango ============
        System.out.println("\n===== RETO 2: ArrayIndexOutOfBoundsException =====");
        int[] arreglo = {1, 2, 3, 4, 5};   // indices validos: 0 a 4
        try {
            System.out.println("Intentando leer la posicion 10...");
            System.out.println(arreglo[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR CAPTURADO: la posicion 10 no existe.");
            System.out.println("El arreglo solo tiene " + arreglo.length + " elementos (indices 0-4).");
        }

        // ============ RETO 3: Conversion de Formato ============
        System.out.println("\n===== RETO 3: NumberFormatException =====");
        String textoNoNumerico = "ABC";
        try {
            int numero = Integer.parseInt(textoNoNumerico);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("ERROR CAPTURADO: '" + textoNoNumerico + "' no es un numero valido.");
        }

        // ============ RETO 4: Captura Multiple ============
        System.out.println("\n===== RETO 4: Captura Multiple =====");
        probarCapturaMultiple(1);   // provoca ArithmeticException
        probarCapturaMultiple(2);   // provoca NullPointerException
        probarCapturaMultiple(3);   // provoca otra excepcion (la generica)

        // ============ RETO 5: Bloque Finally ============
        System.out.println("\n===== RETO 5: try-catch-finally =====");
        try {
            System.out.println("Abriendo conexion con la base de datos...");
            int x = 5 / 0;   // se provoca el error a proposito
            System.out.println("Esta linea nunca se ejecuta. " + x);
        } catch (ArithmeticException e) {
            System.out.println("ERROR CAPTURADO en el bloque catch.");
        } finally {
            // el finally SIEMPRE se ejecuta: haya error o no lo haya
            System.out.println("FINALLY: cerrando recursos. Esto se ejecuta SIEMPRE.");
        }
    }

    // Metodo auxiliar del Reto 4
    public static void probarCapturaMultiple(int caso) {
        try {
            if (caso == 1) {
                int r = 100 / 0;
                System.out.println(r);
            } else if (caso == 2) {
                String texto = null;
                System.out.println(texto.length());
            } else {
                int[] datos = new int[2];
                datos[9] = 1;
            }
        } catch (ArithmeticException e) {
            System.out.println("Caso " + caso + " -> ArithmeticException: error de calculo.");
        } catch (NullPointerException e) {
            System.out.println("Caso " + caso + " -> NullPointerException: se uso un objeto nulo.");
        } catch (Exception e) {
            // La captura generica va SIEMPRE de ultima: atrapa todo lo demas.
            System.out.println("Caso " + caso + " -> Exception generica: " + e.getClass().getSimpleName());
        }
    }
}
