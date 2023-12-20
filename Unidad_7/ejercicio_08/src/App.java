public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 8");
        /*
         * convertimos temperaturas en un array de 12 de logitud por los meses del año
         * y le vamos preguntando la temperatura
         */
        int[] temperaturas = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.printf("%2d ->", (i+1));
            temperaturas[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("*************************************************************");
        System.out.println("*  1 *  2 *  3 *  4 *  5 *  6 *  7 *  8 *  9 * 10 * 11 * 12 *");
        System.out.println("*************************************************************");
        System.out.printf("* %2d * %2d * ", temperaturas[0], temperaturas[1]);
        System.out.printf("%2d * %2d * ", temperaturas[2], temperaturas[3]);
        System.out.printf("%2d * %2d * ", temperaturas[4], temperaturas[5]);
        System.out.printf("%2d * %2d * ", temperaturas[6], temperaturas[7]);
        System.out.printf("%2d * %2d * ", temperaturas[8], temperaturas[9]);
        System.out.printf("%2d * %2d *\n", temperaturas[10], temperaturas[11]);
        System.out.println("*************************************************************");
    }
}
