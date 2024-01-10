public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 19");
        
        int[] array = numeros_aleatorios(new int[11]);
        array_resultado(array);
    }

    /*
     * genera numeros aleatorios desde 0 hasta 200 en todo el array y los imprime
     */
    public static int[] numeros_aleatorios(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 201);
        }
        System.out.println("Array original:");
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
        for (int i = 0; i < 11; i++) {System.out.printf("┬─────");}
        System.out.printf("┐\n");

            //Linea del medio
        System.out.printf("│ Indice  ");
        for (int i = 0; i < 11; i++) {System.out.printf("│ %3d ", (i));}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("├─────────");
        for (int i = 0; i < 11; i++) {System.out.printf("┼─────");}
        System.out.printf("┤\n");

        /*
         * Imprimimos la parte de abajo
         */
            //Linea de arriba
        System.out.printf("│ Valor   ");
        for (int i = 0; i < 11; i++) {System.out.printf("│ %3d ", array[i]);}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("└─────────");
        for (int i = 0; i < 11; i++) {System.out.printf("┴─────");}
        System.out.printf("┘\n");
    }

    public static void array_resultado(int[] array) {
        /*
         * pedimos los numeros y comprobamos que sean correctos
         */
        System.out.print("Introduzca el número que quiere insertar: ");
        int num_insertar = Integer.parseInt(System.console().readLine());
        int num_posicion = 0;
        do {
            System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
            num_posicion = Integer.parseInt(System.console().readLine());
            if (num_posicion > 11 && num_posicion < 0 ) {System.out.print("Numero no valido.\n");}
        } while (num_posicion > 11 && num_posicion < 0);
        
        /*
         * ponemos los datos en el array
         */
        int tmp[] = new int[11];
        // rellenamos el tmp con el contenido del array hasta el numero indicado con num_posicion
        for (int i = 0; i < num_posicion; i++) {
            tmp[i] = array[i];
        }

        // metemos el numero metido al tmp en la posicion que toca
        tmp[num_posicion] = num_insertar;

        // metemos los restantes
        for (int i = num_posicion + 1; i < tmp.length; i++) {
            tmp[i] = array[i - 1];
        }

        System.out.println("\nArray resultado:");
        imprimir_array(tmp);
    }
}
