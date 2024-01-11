public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 8");

        posicion_alfil();
    }

    /*
     * funcion para rellenar el int de numeros en orden
     */
    public static int[] rellenador(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i;
        }
        return numero;
    }

    /*
     * calcula la posicion del alfil
     */
    public static void posicion_alfil() {
        /*
         * prepara los numeros pedidos y la altura del tablero
         */
        int altura[] = rellenador(new int[8]);
        int anchura[] = rellenador(new int[8]);
        System.out.print("Introduzca la posición del alfil: ");
        String posicion = (System.console().readLine().toLowerCase());
        int columnaAlfil = (int)(posicion.charAt(0)) - 96;
        int filaAlfil = (int)(posicion.charAt(1)) - 48;

        /*
         * calculamos los 4 lados de el alfil
         */
        System.out.println("El álfil puede moverse a las siguientes posiciones:");
        // arriba izquierda

    }

    /*
     * Cambia de numero a letra
     */
    public static String numero_a_letra(int numero) {
        switch (numero) {
            case 1:
                return "a";
            case 2:
                return "b";
            case 3:
                return "c";
            case 4:
                return "d";
            case 5:
                return "e";
            case 6:
                return "f";
            case 7:
                return "g";
            case 8:
                return "h";
            default:
            return " ";
        }
    }

    /*
     * Cambia de letra a numero
     */
    public static int letra_a_numero(String numero) {
        switch (numero) {
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            case "d":
                return 4;
            case "e":
                return 5;
            case "f":
                return 6;
            case "g":
                return 7;
            case "h":
                return 8;
            default:
            return 0;
        }
    }
}
