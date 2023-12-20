public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 10");

        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int)(Math.random() * 101);
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
         * poniendo dentro de numeros los pares y luego los inpares
         */
        int pos_final = 0;
        for (int i = 0; pares[i] != 0; i++) {
            numeros[pos_final] = pares[i];
            pos_final++;
        }

        for (int i = 0; inpares[i] != 0; i++) {
            numeros[pos_final] = inpares[i];
            pos_final++;
        }
        /*
         * imprimimos el resultado
         */
        for (int i = 0; numeros[i] != 0; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
