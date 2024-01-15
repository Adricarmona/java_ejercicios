public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 8");

        posicion_alfil();
    }

    /*
     * calcula la posicion del alfil
     */
    public static void posicion_alfil() {
        /*
         * prepara los numeros pedidos
         */
        System.out.print("Introduzca la posición del alfil: ");
        String posicion = (System.console().readLine().toLowerCase());
        int columnaAlfil = (int)(posicion.charAt(0)) - 96;
        int filaAlfil = (int)(posicion.charAt(1)) - 48;

        /*
         * calculamos los 4 lados de el alfil
         */
        int altura = filaAlfil;
        int anchura = columnaAlfil;
        System.out.println("El álfil puede moverse a las siguientes posiciones: ");
        // arriba izquierda
        while (anchura < 8 && altura > 0) {
            anchura++;
            altura--;
            System.out.print(numero_a_letra(anchura)+altura+" ");
        }

        // arriba derecha
        altura = filaAlfil;
        anchura = columnaAlfil;
        while (anchura < 8 && altura < 8) {
            anchura++;
            altura++;
            System.out.print(numero_a_letra(anchura)+altura+" ");
        }

        // abajo izquierda
        altura = filaAlfil;
        anchura = columnaAlfil;
        while (anchura > 0 && altura > 0) {
            anchura--;
            altura--;
            System.out.print(numero_a_letra(anchura)+altura+" ");
        }

        // abajo derecha
        altura = filaAlfil;
        anchura = columnaAlfil;
        while (anchura > 0 && altura < 8) {
            anchura--;
            altura++;
            System.out.print(numero_a_letra(anchura)+altura+" ");
        }

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
}
