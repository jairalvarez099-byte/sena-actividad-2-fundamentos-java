/**
 * MODULO 3: Conversion de Tipos (Casting)
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: transformar un dato de un tipo a otro sin perder el control.
 */
public class ConversionDeTipos {

    public static void main(String[] args) {

        // ============ RETO 1: Casting Implicito (Ensanchamiento) ============
        System.out.println("===== RETO 1: Casting Implicito (Widening) =====");
        // Java lo hace SOLO porque el destino es mas grande: no se pierde nada.
        byte b = 50;
        int deByteAInt = b;

        int i = 1500;
        long deIntALong = i;

        float f = 9.75f;
        double deFloatADouble = f;

        System.out.println("byte 50    -> int    : " + deByteAInt);
        System.out.println("int 1500   -> long   : " + deIntALong);
        System.out.println("float 9.75 -> double : " + deFloatADouble);

        // ============ RETO 2: Casting Explicito (Estrechamiento) ============
        System.out.println("\n===== RETO 2: Casting Explicito (Narrowing) =====");
        double valorDecimal = 99.98;
        int valorEntero = (int) valorDecimal;   // se obliga con (int)

        System.out.println("double original : " + valorDecimal);
        System.out.println("int convertido  : " + valorEntero);
        System.out.println("Explicacion: la parte decimal (.98) se TRUNCA, no se redondea.");

        // ============ RETO 3: Fenomeno de Overflow ============
        System.out.println("\n===== RETO 3: Fenomeno de Overflow =====");
        int numeroGrande = 300;
        byte desbordado = (byte) numeroGrande;

        System.out.println("int  : " + numeroGrande);
        System.out.println("byte : " + desbordado);
        System.out.println("Causa: byte solo llega hasta 127. Al pasarse, el valor");
        System.out.println("da la vuelta (300 - 256 = 44). Se llama DESBORDAMIENTO / OVERFLOW.");

        // ============ RETO 4: Conversion de Caracteres ============
        System.out.println("\n===== RETO 4: Conversion de Caracteres =====");
        char caracter = 'a';
        int codigoAscii = caracter;              // implicito: char -> int

        int codigo = 97;
        char deVuelta = (char) codigo;           // explicito: int -> char

        System.out.println("char 'a' -> int  : " + codigoAscii);
        System.out.println("int 97   -> char : " + deVuelta);

        // ============ RETO 5: Casting en Operaciones Aritmeticas ============
        System.out.println("\n===== RETO 5: Casting en Operaciones Aritmeticas =====");
        double divisionSinCasting = 7 / 2;         // se calcula como enteros: 3, luego pasa a 3.0
        double divisionConCasting = (double) 7 / 2; // 7 pasa a 7.0 ANTES de dividir

        System.out.println("7 / 2            = " + divisionSinCasting + "  <- division entera");
        System.out.println("(double) 7 / 2   = " + divisionConCasting + "  <- division real");
        System.out.println("Leccion: si los dos operandos son int, Java divide como int.");
    }
}
