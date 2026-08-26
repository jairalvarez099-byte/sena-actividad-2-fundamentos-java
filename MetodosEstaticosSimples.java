/**
 * MODULO 7: Metodos Estaticos Simples
 * Aprendiz: Jair Alvarez Alvarez
 *
 * Objetivo: dividir el codigo en bloques reutilizables (modularizar).
 */
public class MetodosEstaticosSimples {

    // ============ RETO 1: Metodo sin retorno (void) ============
    public static void imprimirEncabezado() {
        System.out.println("*******************************************");
        System.out.println("*      SISTEMA DE GESTION - SENA 2026      *");
        System.out.println("*******************************************");
    }

    // ============ RETO 2: Metodo con parametros ============
    public static String generarSaludo(String nombre, String rol) {
        return "Hola " + nombre + ", bienvenido como " + rol + ".";
    }

    // ============ RETO 3: Metodo de calculo ============
    public static double calcularIva(double precio, double porcentajeIva) {
        return precio * (porcentajeIva / 100);
    }

    // ============ RETO 4: Sobrecarga de metodos (Overloading) ============
    // Mismo nombre, diferente lista de parametros: Java elige el correcto solo.
    public static double calcularArea(double lado) {                 // cuadrado
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {  // rectangulo
        return base * altura;
    }

    // ============ RETO 5: Metodo booleano de validacion ============
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println("===== RETO 1: Metodo void =====");
        imprimirEncabezado();

        System.out.println("\n===== RETO 2: Metodo con parametros =====");
        System.out.println(generarSaludo("Jair Alvarez", "Aprendiz SENA"));
        System.out.println(generarSaludo("Jhon Fredy", "Instructor"));

        System.out.println("\n===== RETO 3: Metodo de calculo =====");
        double precio = 150000;
        double iva = calcularIva(precio, 19);
        System.out.println("Precio base : $" + precio);
        System.out.println("IVA (19%)   : $" + iva);
        System.out.println("Total       : $" + (precio + iva));

        System.out.println("\n===== RETO 4: Sobrecarga de metodos =====");
        System.out.println("Area del cuadrado (lado 5)          : " + calcularArea(5));
        System.out.println("Area del rectangulo (base 5, alt 3) : " + calcularArea(5, 3));
        System.out.println("Se llaman igual, pero Java diferencia por los parametros.");

        System.out.println("\n===== RETO 5: Metodo booleano =====");
        int[] pruebas = {4, 7, 10, 15};
        for (int num : pruebas) {
            System.out.println("El numero " + num + " es par? " + esPar(num));
        }
    }
}
