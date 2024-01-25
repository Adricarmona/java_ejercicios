import funciones.funcionesArrays;

public class funcionesArraysBi {
    public static void main(String[] args) throws Exception {
        int[][] test = {{1,1,1,1},{8,8,4,8},{1,1,1,1},{1,1,1,1}};
        esPuntoDeSilla(test, 2, 1);
    }

    public static int[][] generaArrayBiInt(int linea, int columna, int minimo, int maximo) {
        int[][] numero = new int[linea][columna];
        for (int i = 0; i < linea; i++) {
            for (int j = 0; j < columna; j++) {
                numero[i][j] = (int)(Math.random() * (maximo - minimo) + minimo);
            }
        }

        return numero;
    }

    public static int[] filaDeArrayBiInt(int[][] arrayDoble, int posicines){
        int[] array = new int[arrayDoble.length];

        for (int i = 0; i < arrayDoble.length; i++) {
            array[i] = arrayDoble[posicines][i];
        }

        return array;
    }

    public static int[] columnaDeArrayBiInt(int[][] arrayDoble, int posicines) {
        int[] array = new int[arrayDoble.length];

        for (int i = 0; i < arrayDoble.length; i++) {
            array[i] = arrayDoble[i][posicines];
        }

        return array;
    }

    public static int[] coordenadasEnArrayBiInt(int[][] arrayDoble, int posicion) {
        int[] coordenadas = {-1,-1};
        
        for (int i = 0; i < arrayDoble.length; i++) {
            for (int j = 0; j < arrayDoble.length; j++) {
                if (arrayDoble[i][j] == posicion) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }

        return coordenadas;
    }


    /*
     * Pinta por pantalla si un numero es punto de silla osea que es el minimo de la fila y el maximo de la columna
     */
    public static void esPuntoDeSilla(int[][] arrayDoble, int columna, int fila) {

        // comprobamos la fila cual es el menor
        int[] tmp = filaDeArrayBiInt(arrayDoble, fila);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] < min) {min = tmp[i];}
        }

        // comprobamos la columna cual es el mayor
        tmp = columnaDeArrayBiInt(arrayDoble, columna);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > max) {max = tmp[i];}
        }

        // Comprobamos si son los numeros indicados
        if (min == arrayDoble[fila][columna] && max == arrayDoble[fila][columna]) {
            System.out.println("Es punto de silla");
        } else {
            System.out.println("No es punto de silla");
        }
    }

    /*
     * devuelve un un array de la digagonal de un array doble ingresado
     * Se pasa: (array bidimensional, fila, columna y direccion)
     * La direccion puede ser: 
     *      nose de arriba izquiera a abajo derecha
     *      neso de arriba derecha a aabajo izquierda
     */
    public static void diagonal(int[][] arrayBi, int fila, int coumna, String direccion) {
        int[] diagonal = new int[arrayBi.long];
    }
}
