public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 18");

        int[] array = numeros_aleatorios(new int[10]);
        ordenador(array);
    }

    /*
     * genera numeros aleatorios desde 0 hasta 200 en todo el array y los imprime
     */
    public static int[] numeros_aleatorios(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 201);
        }
        imprimir_array(numeros);
        return numeros;
    }

    /*
     * pinta el array con indice y valor
     */
    public static void imprimir_array(int[] array) {
        /*
         * Imprimimos la parte de arriba
         */
            //Linea de arriba
        System.out.printf("┌─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┬─────");}
        System.out.printf("┐\n");

            //Linea del medio
        System.out.printf("│ Indice  ");
        for (int i = 0; i < 10; i++) {System.out.printf("│ %3d ", (i+1));}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("├─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┼─────");}
        System.out.printf("┤\n");

        /*
         * Imprimimos la parte de abajo
         */
            //Linea de arriba
        System.out.printf("│ Valor   ");
        for (int i = 0; i < 10; i++) {System.out.printf("│ %3d ", array[i]);}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("└─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┴─────");}
        System.out.printf("┘\n");
    }

    public static void ordenador(int[] array) {
        /*
         * cogemos los mayores de 100 y los menores de 100 y los metemos en arrays independientes
         */
        int[] mayores_100 = new int[10];
        int[] menores_100 = new int[10];
        int j = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 99) {
                mayores_100[j++] = array[i];
            } else {
                menores_100[k++] = array[i];
            }
        }

        /*
         * los metemos en tmp
         */
        int[] tmp = new int[10];
        int mayores_colocados = 0;
        int menores_colocados = 0;

        /*
         *  damos una vuelta al bucle comprobando primero los pequeños y luego los grandes
         */
        int iteraciones = 0;
        while (iteraciones < 10) {
            if (menores_colocados < k) {
                tmp[iteraciones] = menores_100[menores_colocados];
                menores_colocados++;
                iteraciones++;
            }

            if (mayores_colocados < j) {
                tmp[iteraciones] = mayores_100[mayores_colocados];
                mayores_colocados++;
                iteraciones++;
            }
        }

        imprimir_array(tmp);
    }
}
