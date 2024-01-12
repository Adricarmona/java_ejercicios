public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 10\n");

        char[][] tablero = {{'#','#','#'},{'#','#','#'},{'#','#','#'}};
        boolean ganado = false;
        int veces_jugadas = 0;
        pintar_tablero(tablero);
        do {
            ganado = jugada(tablero, true);
            pintar_tablero(tablero);
            if (ganado) {
                System.out.println("/////////////// Felcididades, Ganaste!!! ///////////////");
            } else {
                if (veces_jugadas < 9) { 
                    ganado = jugada(tablero, false);
                }
                pintar_tablero(tablero);
                if (ganado) {
                    System.out.println("/////////////// Lo siento, Gano la maquina ///////////////");
                }
            }
            veces_jugadas=+ 2; // cada vez se juege la maquina y el usuario suma +
        } while (!ganado && veces_jugadas < 9);
    }

    public static boolean jugada(char[][] tablero, boolean jugador) {
        int linea_o_columna[] = new int[2];
        /*
         * pide la jugada y comprueba que sea correcta
         */
        if (jugador) { // es jugador
            System.out.println("¿Que posicion quiere jugar?(del 1 al 3)\n(si no sirve vuelve a preguntar)");
            do {
                System.out.print("columna:");
                linea_o_columna[0] = Integer.parseInt(System.console().readLine()) - 1;
                System.out.print("linea:");
                linea_o_columna[1] = Integer.parseInt(System.console().readLine()) - 1;
            } while (tablero[linea_o_columna[1]][linea_o_columna[0]] != '#');
        } else { // es la maquina
            do { // saca un numero aleatorio valido para el tablero
                linea_o_columna[0] = (int)(Math.random() * 3);
                linea_o_columna[1] = (int)(Math.random() * 3);
            } while (tablero[linea_o_columna[1]][linea_o_columna[0]] != '#');
        }

        /*
         * guarda la jugada
         */
        if (jugador == true) { // es el jugador
            tablero[linea_o_columna[1]][linea_o_columna[0]] = 'O';
        } else { // es la maquina
            tablero[linea_o_columna[1]][linea_o_columna[0]] = 'X';
        }

        if (jugador) {
            return ganador(tablero, 'O'); // gana el jugador    
        }
        return ganador(tablero, 'X'); // gana la maquina
    }

    /*
     * Funcion para comprobar si ya se ha ganado
     */
    public static boolean ganador(char[][] tablero, char jugador) {
        /*
         *  comprueba si es ganadora la jugada
         */
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) || (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) || (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) ) {
            return true;
        }
        /*  
         *  0## 000 0##
         *  #0# ### 0##
         *  ##0 ### 0##
         */ 
        if ((tablero[2][0] == jugador && tablero[1][1] == jugador && tablero[0][2] == jugador) || (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) || (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) ) {
            return true;
        }
        /*  
         *  ##0 ### #0#
         *  #0# 000 #0#
         *  0#0 ### #0#
         */
        if ((tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) || (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) ) {
            return true;
        }
        /*  
         *  ### ##0
         *  ### ##0
         *  000 ##0
         */ 
        return false;
    }

    /*
     * pinta el tablero del 3 en ralla
     */
    public static void pintar_tablero(char[][] tablero) {
        System.out.println(" ---");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("|");
        }
        System.out.println(" --- ");
    }
}
