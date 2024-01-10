public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 9");
        /*
         * pidiendo los numeros
         */
        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 + "-> ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        /*
         * Comprobamos cuales son pares y cuales no
         */
        int[] pares = new int[8];
        int[] inpares = new int[8];
        int j = 0;
        int y = 0;
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                pares[j] = numeros[i];
                j++;
            } else {
                inpares[y] = numeros[i];
                y++;
            }
        }

        /*
         * imprimimos los pares y los inpares
         */
        System.out.print("Pares: ");
        for (int i = 0; pares[i] != 0; i++) {
            System.out.print(pares[i]+" ");
        }

        System.out.print("Inpares: ");
        for (int i = 0; inpares[i] != 0; i++) {
            System.out.print(inpares[i]+" ");
        }
        System.out.println(""); // salto de linea
    }
}
