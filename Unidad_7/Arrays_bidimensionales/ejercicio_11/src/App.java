public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 11\n");

        int array[][] = rellena_array(new int[10][10]);
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
        int tmp[] = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    tmp[i] = array[i][j];
                }
            }
        }

        return tmp;
    }

    /*
     * Rellena el array y lo pinta
     */
    public static int[][] rellena_array(int[][] array) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int)(Math.random() * 101 + 200);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        return array;
    }
}
