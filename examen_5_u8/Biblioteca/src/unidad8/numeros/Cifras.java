/*
 * @Autor: Adrian Carmona
 * @Grado: 1ºDAM
 * @Modulo: Programacion
 */
package unidad8.numeros;

public class Cifras {
    /*
     *  Funcion que comprueba un numero ingresado si tiene una cifra ingresada
     */
    public static boolean contieneCifra(int numeroLargo, int numero) {
        boolean contiene = false;
        // comprueba cada numero dividiendolo entre 10 en cada iteracion
        while (numeroLargo > 0) {
            // si el modulo de el numero es igual al ingresado esta aqui
            if (numeroLargo%10 == numero) {contiene = true;}
            numeroLargo/=10;
        }

        return contiene;
    }
}
