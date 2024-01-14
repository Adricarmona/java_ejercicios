public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 12\n");

        int array[][] = rellena_array(new int[9][9]);
        calculos(diagonales(array));
    }

    /*
     * calcula los maximos , los minimos y la media y los pinta
     */
public static void calculos(int[] numeros) {
    int maximo = Integer.MIN_VALUE;
    int minino = Integer.MAX_VALUE;
    int media = 0;

    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        } else if (numeros[i] < minino) {
            minino = numeros[i];
        }
        media += numeros[i];
    }

    media = media / 10;
    System.out.println("\nEl numero mas bajo: "+minino+"\nEl numero mas alto: "+maximo+"\nLa media es "+media);
}

    /*
     * coge los numeros diagonales
     */
    public static int[] diagonales(int[][] array) {
        int tmp[] = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j == 8) { // ocho por que cuenta el 0 osea 012345678 = 9 numeros en total
                    // posicion i = 0 y j = 8 es igual a la esquina izquierda de abajo
                    // y i = 8 & j = 0 = 8 igual derecha arriba 
                    // y j = 4 & j = 4 = 8 igual al centro
                    tmp[i] = array[i][j];
                }
            }
        }

        /* 
        /////////// prueba javi(con esto es mas eficiente para el codigo) ///////////////
        int j;
        for (int i = 0; i < 9; i++) {
            j = 8 -i;    
            tmp[i] = array[i][j];
        }
        */

        return tmp;
    }

    /*
     * Rellena el array y lo pinta
     */
    public static int[][] rellena_array(int[][] array) {
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = (int)(Math.random() * 401 + 500);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        return array;
    }
}
