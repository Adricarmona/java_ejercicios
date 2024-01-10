public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 5");

        /*
         * generamos los numeros y los metemos en el array
         */
        int numero[][] = new int[6][10];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                numero[i][j] = (int)(Math.random() * 1001);
            }
        }

        /*
         * comprobamos el minimo y el maximo
         */
        int maximo[][][] = new int[1000][6][10];
        int minimo[][][] = new int[1000][6][10];
        maximo[0][0][0] = Integer.MIN_VALUE;
        minimo[0][0][0] = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (numero[i][j] > maximo[0][0][0]){
                    maximo[0][0][0] = numero[i][j];
                    maximo[0][1][0] = i; // fila
                    maximo[0][0][1] = j; // columna
                } else if (numero[i][j] < minimo[0][0][0]) {
                    minimo[0][0][0] = numero[i][j];
                    minimo[0][1][0] = i; // fila
                    minimo[0][0][1] = j; // columna
                }
            }
        }

        /*
         * pintamos la tabla
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ",numero[i][j]);
            }
            System.out.println("");
        }

        /*
         * imprimimos el maximo y el minimo
         */
        System.out.printf("el minimo es %d esta en la fila %d y en la columna %d\n",minimo[0][0][0] ,minimo[0][1][0] ,minimo[0][0][1] );
        System.out.printf("el maximo es %d esta en la fila %d y en la columna %d\n",maximo[0][0][0] ,maximo[0][1][0] ,maximo[0][0][1] );
    }
}
