/*
 * @Autor: Adrian Carmona
 * @Grado: 1ºDAM
 * @Modulo: Programacion
 */
package unidad8.arrays1d;

import unidad8.numeros.Cifras;// contiene cifra (numero largo, numero)

public class Filtros {
    /*
     * Una funcion que comprueba que los numeros del array contengan el numero indicado y 
     * devuelve un array con los numeros que tengan el indicado
     */
    public static int[] filtraConCifra(int[] array, int numero) {
        int logitud = 0;
        // bucle para medir la logitud del numero
        for (int i = 0; i < array.length; i++) {
            if (Cifras.contieneCifra(array[i], numero)) {logitud++;}
        }

        // generamos un array de la logitud necesaria y reseteamos logitud para volver a utilizarlo
        int[] arrayTmp = new int[logitud];
        logitud = 0;

        //comrpobamos que numero es valido y lo iteramos con logitud 
        for (int i = 0; i < array.length; i++) {
            if (Cifras.contieneCifra(array[i], numero)) {
                arrayTmp[logitud] = array[i];
                logitud++;
            }
        }

        return arrayTmp;
    }
}
