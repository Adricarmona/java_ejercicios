/*
 * @Autor: Adrian Carmona
 * @Grado: 1ºDAM
 * @Modulo: Programacion
 */
package unidad8.arrays2d;

public class Elementos {
    /*
     * Funcion que devuelve un numero aleatorio del array bidimensional ingresado
     */
    public static int aletorioDeArray2D(int[][] arrayBi) {
        // para coger la logitud de la lineas y las columnas del array
        int linea = (int)(Math.random() * arrayBi.length);
        int columna = (int)(Math.random() * arrayBi[0].length);

        int l = arrayBi.length;

        // devuelve el numero conseguido
        return arrayBi[linea][columna];
    }
    
}
