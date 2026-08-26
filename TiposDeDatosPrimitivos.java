/**
 * MODULO 2: Tipos de Datos Primitivos
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: conocer los 8 tipos basicos de Java y cuanto ocupa cada uno.
 */
public class TiposDeDatosPrimitivos {

    public static void main(String[] args) {

        // ============ RETO 1: Enteros y sus Rangos ============
        System.out.println("===== RETO 1: Enteros y sus Rangos =====");
        System.out.println("byte  -> min: " + Byte.MIN_VALUE + " | max: " + Byte.MAX_VALUE);
        System.out.println("short -> min: " + Short.MIN_VALUE + " | max: " + Short.MAX_VALUE);
        System.out.println("int   -> min: " + Integer.MIN_VALUE + " | max: " + Integer.MAX_VALUE);
        System.out.println("long  -> min: " + Long.MIN_VALUE + " | max: " + Long.MAX_VALUE);

        // ============ RETO 2: Flotantes y Precision ============
        System.out.println("\n===== RETO 2: Flotantes y Precision =====");
        float precioFloat = 19.99f;          // la 'f' final es obligatoria en float
        double precioDouble = 19.99999999;

        System.out.println("float  : " + precioFloat);
        System.out.println("double : " + precioDouble);
        System.out.println("Conclusion: float guarda ~7 digitos de precision y double ~15,");
        System.out.println("por eso para dinero y calculos exactos se prefiere double.");

        // ============ RETO 3: Caracteres y Codigo ASCII ============
        System.out.println("\n===== RETO 3: Caracteres y Codigo ASCII =====");
        char letra = 'A';
        char letraDesdeAscii = 65;   // 65 es el codigo ASCII de 'A'

        System.out.println("letra           = " + letra);
        System.out.println("letraDesdeAscii = " + letraDesdeAscii);
        System.out.println("Son iguales?    = " + (letra == letraDesdeAscii));

        // ============ RETO 4: Valores Booleanos ============
        System.out.println("\n===== RETO 4: Valores Booleanos =====");
        boolean luzEncendida = true;
        boolean esMayorDeEdad = true;
        int numero = 8;
        boolean esPar = (numero % 2 == 0);

        System.out.println("luzEncendida  : " + luzEncendida);
        System.out.println("esMayorDeEdad : " + esMayorDeEdad);
        System.out.println("El numero " + numero + " es par? " + esPar);

        // ============ RETO 5: Tabla de Memoria ============
        System.out.println("\n===== RETO 5: Tabla de Memoria =====");
        byte    unByte    = 100;
        short   unShort   = 30000;
        int     unInt     = 2000000;
        long    unLong    = 9000000000L;   // la 'L' final es obligatoria en long
        float   unFloat   = 3.14f;
        double  unDouble  = 3.141592653589;
        boolean unBoolean = true;
        char    unChar    = 'J';

        System.out.printf("%-10s %-20s %-10s%n", "TIPO", "VALOR", "TAMANO");
        System.out.println("--------------------------------------------");
        System.out.printf("%-10s %-20s %-10s%n", "byte",    unByte,    "1 byte  (8 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "short",   unShort,   "2 bytes (16 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "int",     unInt,     "4 bytes (32 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "long",    unLong,    "8 bytes (64 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "float",   unFloat,   "4 bytes (32 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "double",  unDouble,  "8 bytes (64 bits)");
        System.out.printf("%-10s %-20s %-10s%n", "boolean", unBoolean, "1 bit (logico)");
        System.out.printf("%-10s %-20s %-10s%n", "char",    unChar,    "2 bytes (16 bits)");
    }
}
