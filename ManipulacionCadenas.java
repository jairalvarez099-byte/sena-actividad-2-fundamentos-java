/**
 * MODULO 10: Manipulacion de Cadenas (String)
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: procesar texto, el tipo de dato mas comun del software.
 */
import java.util.Arrays;

public class ManipulacionCadenas {

    public static void main(String[] args) {

        // ============ RETO 1: Limpieza y Tamano ============
        System.out.println("===== RETO 1: trim(), toUpperCase(), length() =====");
        String texto = "  Desarrollo de Software en Java  ";

        System.out.println("Original      : [" + texto + "]");
        String limpio = texto.trim();
        System.out.println("Con trim()    : [" + limpio + "]");
        System.out.println("En mayusculas : " + limpio.toUpperCase());
        System.out.println("Longitud      : " + limpio.length() + " caracteres");

        // ============ RETO 2: Busqueda y Reemplazo ============
        System.out.println("\n===== RETO 2: contains(), indexOf(), replace() =====");
        String frase = "Yo estudio Java en el SENA";

        System.out.println("Frase          : " + frase);
        System.out.println("Contiene Java? : " + frase.contains("Java"));
        System.out.println("Indice de Java : " + frase.indexOf("Java"));
        System.out.println("Reemplazada    : " + frase.replace("Java", "Spring Boot"));

        // ============ RETO 3: Subcadenas y Separacion ============
        System.out.println("\n===== RETO 3: substring() y split() =====");
        System.out.println("substring(11,15) de la frase: " + frase.substring(11, 15));

        String correos = "user1@gmail.com,user2@yahoo.com";
        String[] listaCorreos = correos.split(",");
        System.out.println("Cadena original : " + correos);
        System.out.println("Separados       : " + Arrays.toString(listaCorreos));
        for (int i = 0; i < listaCorreos.length; i++) {
            System.out.println("  Correo " + (i + 1) + ": " + listaCorreos[i]);
        }

        // ============ RETO 4: Demostracion de Inmutabilidad ============
        System.out.println("\n===== RETO 4: Inmutabilidad del String =====");
        String nombre = "jair";
        nombre.toUpperCase();      // esto NO cambia la variable, solo devuelve un texto nuevo
        System.out.println("Despues de llamar toUpperCase() sin asignar : " + nombre);

        nombre = nombre.toUpperCase();  // ahora si, porque se reasigna
        System.out.println("Despues de asignar el resultado             : " + nombre);
        System.out.println("Conclusion: un String NUNCA se modifica, se crea uno nuevo.");

        // ============ RETO 5: Uso de StringBuilder ============
        System.out.println("\n===== RETO 5: StringBuilder =====");
        String[] palabras = {"El", "desarrollo", "de", "software", "requiere",
                             "logica", "practica", "orden", "y", "disciplina."};

        StringBuilder parrafo = new StringBuilder();
        for (String palabra : palabras) {
            parrafo.append(palabra).append(" ");
        }
        System.out.println("Parrafo: " + parrafo.toString().trim());
        System.out.println("Longitud: " + parrafo.length());

        System.out.println("\nVentaja de StringBuilder sobre el operador + :");
        System.out.println("Con + dentro de un bucle Java crea un objeto String NUEVO en cada");
        System.out.println("vuelta (10 palabras = 10 objetos basura en memoria). StringBuilder");
        System.out.println("usa UN SOLO buffer modificable, por eso es mucho mas rapido y");
        System.out.println("consume menos memoria cuando se concatena muchas veces.");
    }
}
