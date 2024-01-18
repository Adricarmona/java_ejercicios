public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 9");
    
    int[][] matriz = generador_num(new int[12][12]);
    }

    /*
     * Genera numeros aleatorios en el array de 0 a 100
     */
    public static int[][] generador_num(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int)(Math.random() * 101);
            }
        }

        return num;
    }

    // la i es la capa donde esta (0+i para la parte interior y 12-1 para la parte exterior)
    public static void vueltando_el_numero(int[][] matriz, int capa) {    
        /*
         * parte izquierda
         */
        int tmp = matriz[capa][0];
        for (int j = 0; j < 6; j++) {
            // parte izquierda
            for (int i = capa; i > 0; i--) {
                matriz[i-1][12 - i] = matriz[i][12 - i];
            }

            // parte arriba
            for (int i = 12 - capa; i < capa; i++) {
                matriz[12 - i][i] = matriz[12 - i][i - 1];
            }

            // parte derecha
            for (int i = 0; i < 12 - capa; i++) {
                matriz[i+1][capa] = matriz[i][capa];
            }

            // parte abajo izquierda
            for (int i = 12 - capa; i < 12 - capa; i++) {
                matriz[i][i] = matriz[i][i];
            }
        }
    }
}