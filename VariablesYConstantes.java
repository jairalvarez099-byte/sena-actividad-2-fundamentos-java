/**
 * MODULO 1: Variables y Constantes
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: entender como Java guarda datos en memoria y como se
 * protege un dato para que no cambie (final).
 */
public class VariablesYConstantes {

    // Reto 3: constantes con final (van fuera del main para poder verlas en todo el programa)
    static final double PI = 3.14159;
    static final int VELOCIDAD_LUZ = 299792458;

    public static void main(String[] args) {

        // ============ RETO 1: Declaracion y Asignacion ============
        System.out.println("===== RETO 1: Declaracion y Asignacion =====");
        int edad = 20;
        double estatura = 1.75;
        String ciudad = "Medellin";
        boolean estaActivo = true;

        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Esta activo: " + estaActivo);

        // ============ RETO 2: Convenciones camelCase ============
        System.out.println("\n===== RETO 2: Convencion camelCase =====");
        // camelCase = primera palabra en minuscula, las siguientes con mayuscula inicial
        double saldoCuentaBancaria = 1500000.50;
        int cantidadEstudiantesCurso = 32;
        double precioProductoConIva = 23800.0;

        System.out.println("saldoCuentaBancaria: " + saldoCuentaBancaria);
        System.out.println("cantidadEstudiantesCurso: " + cantidadEstudiantesCurso);
        System.out.println("precioProductoConIva: " + precioProductoConIva);

        // ============ RETO 3: Constantes con final ============
        System.out.println("\n===== RETO 3: Constantes con final =====");
        System.out.println("PI = " + PI);
        System.out.println("VELOCIDAD_LUZ = " + VELOCIDAD_LUZ + " m/s");

        // PI = 3.15;
        // ^ LINEA COMENTADA A PROPOSITO.
        // Razon del error: "cannot assign a value to final variable PI".
        // Una variable declarada con 'final' solo se puede asignar UNA vez.
        // El compilador bloquea cualquier intento de reasignacion para
        // proteger el valor (por eso se llama CONSTANTE).

        // ============ RETO 4: Registro de Factura ============
        System.out.println("\n===== RETO 4: Registro de Factura =====");
        final double IVA = 0.19;
        int numeroFactura = 1001;
        String nombreCliente = "Ana Maria Ruiz";
        double subtotal = 250000.0;
        boolean pagada = false;

        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        System.out.println("Factura N: " + numeroFactura);
        System.out.println("Cliente  : " + nombreCliente);
        System.out.println("Subtotal : $" + subtotal);
        System.out.println("IVA (19%): $" + valorIva);
        System.out.println("TOTAL    : $" + total);
        System.out.println("Pagada   : " + pagada);

        // ============ RETO 5: Reasignacion de Variables ============
        System.out.println("\n===== RETO 5: Reasignacion de Variables =====");
        int contador = 0;
        System.out.println("Valor inicial      : " + contador);

        contador = contador + 5;      // tambien se puede escribir contador += 5;
        System.out.println("Despues de sumar 5 : " + contador);

        contador = contador * 2;
        System.out.println("Despues de x2      : " + contador);

        contador = contador - 1;
        System.out.println("Despues de restar 1: " + contador);
    }
}
