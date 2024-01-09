public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 16");

        int numeros[] = numeros_aleatorios(new int[20]);
        numeros_marcados(numeros, 0);
    }

    /*
     * genera numeros aleatorios desde 0 hasta 400 en todo el array y los imprime
     */
    public static int[] numeros_aleatorios(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 401);
            System.out.print(numeros[i]+" ");
        }
        return numeros;
    }

    /*
     * Calcula que multiplo es el que pide y si no es el numero
     */
    public static void numeros_marcados(int numeros[], int rescatar) {
        System.out.print("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        rescatar = Integer.parseInt(System.console().readLine());
        switch (rescatar) {
            case 1: // multiplos de 5
                resaltador(numeros, 5);
                break;
            case 2: // multiplos de 7
                resaltador(numeros, 7);
                break;
            default:
                System.out.println("Numero ingresado no valido");
                numeros_marcados(numeros ,rescatar); // recursividad por probar
        }
    }

    /*
     * Calculador de si es un multiplo o no y lo marca si es y si no no 
     */
    public static void resaltador(int numeros[], int multiplo) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % multiplo == 0) {
                System.out.print(" ["+numeros[i]+"] ");
            } else {
                System.out.print(" "+numeros[i]+" ");
            }
        }
    }
}
