package funciones;

public class funcionesArrays {

    /*
     * un generador de arrays aleatorios que le metes el tamaño minimo y maximo
     */
    public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {
        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * ((maximo + 1) - minimo) + minimo );
        }

        return array;
    }

    /*
     *  devuelve el numero minimo del array ingresado
     */
    public static int minimoArrayInt(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    /*
     *  devuelve el maximo del array ingresado
     */
    public static int maximoArrayInt(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    /*
     * la media del array ingresado
     */
    public static int mediaArrayInt(int[] array) {
        int media = 0;

        for (int i = 0; i < array.length; i++) {
            media = array[i];
        }

        return media/array.length;
    }

    /*
     *  dice si un numero esta en el array 
     */
    public static boolean estaEnArrayInt(int[] array, int numero) {
        boolean esta = false;

        for (int i = 0; i < array.length && esta == false; i++) {
            if (array[i] == numero)
                esta = true;
        }

        return esta;
    }

    /*
     * devuelve la posicion de un numero indicado en el array
     */
    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero)
                return i;
        }

        return -1;
    }

    /*
     * le da la vuelta a un array
     */
    public static int[] volteaArrayInt(int[] numero) {
        int logitudNumero = numero.length;
        int tmp[] = new int[logitudNumero];

        for (int i = 0; i < logitudNumero; i++) {
            tmp[(logitudNumero - 1) - i] = numero[i];
        }

        return tmp;
    }

    /*
     * rota n posiciones de la derecha el array indicado
     */
    public static int[] rotaDerechaArrayInt(int[] numero, int posicines) {
        int tmp[] = new int[numero.length];
        numero = volteaArrayInt(numero);

        for (int i = 0; i < posicines; i++) {
            tmp[(posicines - 1) - i] = numero[i];
        }

        for (int i = posicines; i < numero.length; i++) {
            tmp[i] = numero[i];
        }

        tmp = volteaArrayInt(tmp);
        return tmp;
    }

    /*
     * rota n posiciones de la izquierda el array indicado 
     */
    public static int[] rotaIzquierdaArrayInt(int[] numero, int posicines) {
        int logitudNumero = posicines;
        int tmp[] = new int[numero.length];

        for (int i = 0; i < logitudNumero; i++) {
            tmp[(logitudNumero - 1) - i] = numero[i];
        }

        for (int i = posicines; i < numero.length; i++) {
            tmp[i] = numero[i];
        }

        return tmp;
    }
}