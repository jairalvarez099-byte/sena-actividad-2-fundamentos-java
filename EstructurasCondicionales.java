/**
 * MODULO 5: Estructuras Condicionales
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: que el programa tome decisiones segun los datos.
 */
public class EstructurasCondicionales {

    public static void main(String[] args) {

        // ============ RETO 1: If-Else Simple ============
        System.out.println("===== RETO 1: If-Else Simple =====");
        double temperatura = 38.2;

        if (temperatura > 37.5) {
            System.out.println("Temperatura " + temperatura + " C -> LA PERSONA TIENE FIEBRE");
        } else {
            System.out.println("Temperatura " + temperatura + " C -> Temperatura normal");
        }

        // ============ RETO 2: If-Else If Anidado ============
        System.out.println("\n===== RETO 2: If-Else If Anidado =====");
        double nota = 4.2;

        if (nota < 3.0) {
            System.out.println("Nota " + nota + " -> INSUFICIENTE");
        } else if (nota <= 3.9) {
            System.out.println("Nota " + nota + " -> ACEPTABLE");
        } else if (nota <= 4.5) {
            System.out.println("Nota " + nota + " -> SOBRESALIENTE");
        } else {
            System.out.println("Nota " + nota + " -> EXCELENTE");
        }

        // ============ RETO 3: Switch Tradicional ============
        System.out.println("\n===== RETO 3: Switch Tradicional =====");
        int dia = 4;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes";     break;
            case 2: nombreDia = "Martes";    break;
            case 3: nombreDia = "Miercoles"; break;
            case 4: nombreDia = "Jueves";    break;
            case 5: nombreDia = "Viernes";   break;
            case 6: nombreDia = "Sabado";    break;
            case 7: nombreDia = "Domingo";   break;
            default: nombreDia = "Numero invalido (solo del 1 al 7)";
        }
        System.out.println("El dia " + dia + " es: " + nombreDia);

        // ============ RETO 4: Switch Expression (Java 14+) ============
        System.out.println("\n===== RETO 4: Switch Expression con -> =====");
        String mes = "Febrero";

        int dias = switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> 31;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            case "Febrero" -> 28;
            default -> 0;
        };

        System.out.println(mes + " tiene " + dias + " dias.");
        System.out.println("Ventaja: no necesita break y devuelve un valor directamente.");

        // ============ RETO 5: Control de Acceso de Usuario ============
        System.out.println("\n===== RETO 5: Control de Acceso =====");
        String usuarioIngresado = "admin";
        String claveIngresada   = "1234";

        final String USUARIO_VALIDO = "admin";
        final String CLAVE_VALIDA   = "1234";

        if (usuarioIngresado.equals(USUARIO_VALIDO)) {
            if (claveIngresada.equals(CLAVE_VALIDA)) {
                System.out.println("ACCESO CONCEDIDO. Bienvenido, " + usuarioIngresado + "!");
            } else {
                System.out.println("ERROR: la contrasena es incorrecta.");
            }
        } else {
            System.out.println("ERROR: el usuario no existe en el sistema.");
        }
        System.out.println("Nota: en Strings se compara con .equals(), NO con == .");
    }
}
