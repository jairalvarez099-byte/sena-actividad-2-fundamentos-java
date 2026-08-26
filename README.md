# Actividad 2 — Práctica Guiada de Fundamentos en Java (60 retos)

**Aprendiz:** Jair Alvarez Alvarez

12 módulos × 5 retos = **60 ejercicios**, todos compilados y probados.

## Los 12 módulos
| # | Archivo | Tema |
|---|---|---|
| 1 | `VariablesYConstantes.java` | Variables, camelCase, `final` |
| 2 | `TiposDeDatosPrimitivos.java` | Los 8 tipos primitivos y su tamaño |
| 3 | `ConversionDeTipos.java` | Casting implícito, explícito y overflow |
| 4 | `Operadores.java` | Aritméticos, relacionales, lógicos, ternario |
| 5 | `EstructurasCondicionales.java` | `if`, `else if`, `switch`, switch expression |
| 6 | `EstructurasDeRepeticion.java` | `while`, `do-while`, `for`, `break`, `continue` |
| 7 | `MetodosEstaticosSimples.java` | Métodos, parámetros, retorno, sobrecarga |
| 8 | `ArreglosUnidimensionales.java` | Arreglos, for-each, máximo/mínimo, promedio |
| 9 | `ArreglosBidimensionales.java` | Matrices, diagonal, transpuesta |
| 10 | `ManipulacionCadenas.java` | `trim`, `split`, inmutabilidad, `StringBuilder` |
| 11 | `ManejoBasicoExcepciones.java` | `try-catch-finally`, captura múltiple |
| 12 | `EntradaDeDatos.java` | `Scanner`, salto de buffer, try-with-resources |

## Cómo compilar y ejecutar

```bash
# Compilar los 12 archivos de una vez
javac -d out *.java

# Ejecutar cualquier módulo (ejemplos)
java -cp out VariablesYConstantes
java -cp out Operadores
java -cp out ArreglosBidimensionales
```

## Módulos interactivos (piden datos por teclado)
- `EstructurasDeRepeticion` → menú do-while. Escribe `1`, `2` y `0` para salir.
- `EntradaDeDatos` → pide nombre, edad, estatura, ciudad, calculadora y contraseña (`admin123`).

> **Nota:** los decimales se escriben con **punto** (1.75), no con coma.
> Se fijó `Locale.US` en el Scanner para que funcione igual en cualquier computador.
