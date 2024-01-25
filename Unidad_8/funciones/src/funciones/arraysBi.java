package funciones;

public class arraysBi {

    /*
     *  Una funion que genera arrays dobles con los datos proporcionados
     */
    public static int[][] generaArrayBiInt(int linea, int columna, int minimo, int maximo) {
        int[][] numero = new int[linea][columna];
        for (int i = 0; i < linea; i++) {
            for (int j = 0; j < columna; j++) {
                numero[i][j] = (int)(Math.random() * (maximo - minimo) + minimo);
            }
        }

        return numero;
    }

    /*
     *  Una funcion que coge una fila indicada de un array doble y lo devuelve
     */
    public static int[] filaDeArrayBiInt(int[][] arrayDoble, int posicines){
        int[] array = new int[arrayDoble[posicines].length];

        for (int i = 0; i < arrayDoble[posicines].length; i++) {
            array[i] = arrayDoble[posicines][i];
        }

        return array;
    }

    /*
     *  Una funcion que coge una columna de un arrray doble ingresado 
     *  con el mimso array y la devueve en un array solo
     */
    public static int[] columnaDeArrayBiInt(int[][] arrayDoble, int posicines) {
        int[] array = new int[arrayDoble.length];

        for (int i = 0; i < arrayDoble.length; i++) {
            array[i] = arrayDoble[i][posicines];
        }

        return array;
    }

    /*
     * dice en que coordenadas esta el numero ingresado en el array ingresado
     */
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
    public static int[] diagonal(int[][] arrayBi, int fila, int columna, String direccion) {
        int diagonalTamano = filaDeArrayBiInt(arrayBi,0).length; // cogemos la primera columna y sacamos la altura
        int diagonal[] = new int[diagonalTamano]; // y hacemos un array de la longitud de la fila
    
        
        int conjunto = 0;
        switch (direccion) {
            case "nose": // de izquierda a derecha

                conjunto = fila - columna;

                while (fila > 0 && columna > 0) {
                    fila--;
                    columna--;
                }
            
                for (int i = fila; i < diagonalTamano; i++) {
                    for (int j = columna; j < diagonal.length; j++) {
                        if (i - j == conjunto) {
                            diagonal[i] = arrayBi[i][j];
                        }
                    }
                }

                
                break;
            case "neso":
                
                conjunto = fila + columna;

                while (fila > 0 && columna < diagonal.length) {
                    fila--;
                    columna++;
                }

                for (int i = fila; i < diagonalTamano; i++) {
                    for (int j = columna; j >= 0; j--) {
                        if (i + j == conjunto) {
                            diagonal[i] = arrayBi[i][j];
                        }
                    }
                }
                
            break;
        
            default:
                break;
        }
        return diagonal;
    }
}
