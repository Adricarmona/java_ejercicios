public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 13\n");

        String[] paises = {"España", "Rusia", "Japón","Australia"};
        int[][] alturas = generador_alturas(new int[4][10]);
        alturas_paises(paises, alturas);

    }

    /*
     * pinta los paises con sus alturas
     */
    public static void alturas_paises(String[] paises, int[][] alturas) {
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-10s",paises[i]);
            calculos(alturas[i]);
        }
    }

    public static void calculos(int[] alturas) {
        int maximo = Integer.MIN_VALUE;
        int minino = Integer.MAX_VALUE;
        int media = 0;
    
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > maximo) {
                maximo = alturas[i];
            } else if (alturas[i] < minino) {
                minino = alturas[i];
            }
            media += alturas[i];
        }
    
        media = media / 10;
        System.out.println("\nEl numero mas bajo: "+minino+"\nEl numero mas alto: "+maximo+"\nLa media es: "+media+"\n");
    }

    /*
     * genera las alturas de los paises
     */
    public static int[][] generador_alturas(int[][] alturas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                alturas[i][j] = (int)(Math.random() * 71 + 140 );
            }
        }

        return alturas;
    }
}
