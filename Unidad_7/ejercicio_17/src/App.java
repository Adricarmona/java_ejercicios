public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 17");

        int numeros[] = numeros_aleatorios(new int[10]);
        numeros_a_comprobar(numeros, 0);
    }

    /*
     * genera numeros aleatorios desde 0 hasta 100 en todo el array y los imprime
     */
    public static int[] numeros_aleatorios(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 101);
            System.out.print(numeros[i]+" ");
        }
        return numeros;
    }

    /*
     * pide los numeros y los comprueba si estan en el array
     */
    public static void numeros_a_comprobar(int numeros[], int num_pedido) {
        System.out.print("\nIndica el numero que quiera encontrar: ");
        num_pedido = Integer.parseInt(System.console().readLine());
        boolean numero_presente = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num_pedido){
                numero_presente = true;
            } 
        }
        if (numero_presente == false) {
            System.out.print("Numero no presente en el array");
            numeros_a_comprobar(numeros, num_pedido);
        } else {
            imprimir_numeros(posicion_de_el_numero(numeros, num_pedido));
        }
    }

    /*
     * programa que pone el parametro pedido el 1º en el array y el resto detras
     */
    public static int[] posicion_de_el_numero(int numeros[], int num_pedido) {
        int tmp[] = new int[10];
        /*
         * Calcula la posicion del numero
         */
        int pos_num_pedido = 0;
        while (numeros[pos_num_pedido] != num_pedido) {
            pos_num_pedido++;
        }

        /*
         * ponemos en el 0 de tmp el numero , ponemos hasta la posicion del numero y luego lo faltante
         */
        tmp[0] = numeros[pos_num_pedido];
        for (int i = 0; i < pos_num_pedido; i++) {
            tmp[i+1] = numeros[i];
        }
        for (int i = pos_num_pedido + 1; i < tmp.length; i++) {
            tmp[i] = numeros[i];
        }
        return tmp;
    }

    /*
     * Imprime los numeros
     */
    public static void imprimir_numeros(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
