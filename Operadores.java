/**
 * MODULO 4: Operadores
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: hacer calculos y evaluar condiciones.
 */
public class Operadores {

    public static void main(String[] args) {

        // ============ RETO 1: Operadores Aritmeticos ============
        System.out.println("===== RETO 1: Operadores Aritmeticos =====");
        double a = 15.5;
        double b = 4.0;

        System.out.println("a = " + a + " | b = " + b);
        System.out.println("Suma           a + b = " + (a + b));
        System.out.println("Resta          a - b = " + (a - b));
        System.out.println("Multiplicacion a * b = " + (a * b));
        System.out.println("Division       a / b = " + (a / b));
        System.out.println("Modulo         a % b = " + (a % b) + "  <- el residuo");

        // ============ RETO 2: Prefijo vs Postfijo ============
        System.out.println("\n===== RETO 2: Prefijo (++n) vs Postfijo (n++) =====");
        int n = 5;
        System.out.println("n vale " + n);
        System.out.println("++n  imprime: " + (++n) + "  (primero suma, luego muestra)");

        n = 5; // se reinicia para comparar en igualdad de condiciones
        System.out.println("n vale " + n);
        System.out.println("n++  imprime: " + (n++) + "  (primero muestra, luego suma)");
        System.out.println("despues del n++ , n vale: " + n);

        // ============ RETO 3: Operadores Relacionales ============
        System.out.println("\n===== RETO 3: Operadores Relacionales =====");
        int x = 10;
        int y = 7;
        System.out.println("x = " + x + " | y = " + y);
        System.out.println("x >  y  -> " + (x > y));
        System.out.println("x <  y  -> " + (x < y));
        System.out.println("x >= y  -> " + (x >= y));
        System.out.println("x <= y  -> " + (x <= y));
        System.out.println("x == y  -> " + (x == y));
        System.out.println("x != y  -> " + (x != y));

        // ============ RETO 4: Operadores Logicos ============
        System.out.println("\n===== RETO 4: Operadores Logicos =====");
        int edad = 20;
        boolean tieneLicencia = true;

        boolean puedeConducir = (edad >= 18 && tieneLicencia);       // AND: ambas verdaderas
        boolean casoOr        = (edad >= 65 || tieneLicencia);       // OR: al menos una
        boolean negacion      = !tieneLicencia;                      // NOT: invierte

        System.out.println("edad = " + edad + " | tieneLicencia = " + tieneLicencia);
        System.out.println("edad >= 18 && tieneLicencia -> " + puedeConducir);
        System.out.println("edad >= 65 || tieneLicencia -> " + casoOr);
        System.out.println("!tieneLicencia              -> " + negacion);

        // ============ RETO 5: Operador Ternario ============
        System.out.println("\n===== RETO 5: Operador Ternario ( ? : ) =====");
        int numero = -8;
        double nota = 3.8;

        // sintaxis:  condicion ? valorSiEsVerdadero : valorSiEsFalso
        String signo = (numero >= 0) ? "Positivo" : "Negativo";
        String resultado = (nota >= 3.0) ? "Aprobo" : "Reprobo";

        System.out.println("El numero " + numero + " es: " + signo);
        System.out.println("Con nota " + nota + " el estudiante: " + resultado);
    }
}
