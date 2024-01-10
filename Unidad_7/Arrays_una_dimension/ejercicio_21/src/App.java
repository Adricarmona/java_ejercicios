public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 21");

        int[] array = numeros_aleatorios(new int[15]);
        circuncidados(array);
    }

    /*
     * genera numeros aleatorios desde 0 hasta 500 en todo el array y los imprime
     */
    public static int[] numeros_aleatorios(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 501);
        }
        System.out.println("Array original:");
        imprimir_array(numeros);
        return numeros;
    }

    /*
     * imprime el array
     */
    public static void imprimir_array(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }

    /*
     * los circuncida
     */
    public static void circuncidados(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            while (numeros[i] % 5 != 0) {
                numeros[i] += 1;
            }
        }
        System.out.println("\nArray cincuerizado: ");
        imprimir_array(numeros);
    }
}
