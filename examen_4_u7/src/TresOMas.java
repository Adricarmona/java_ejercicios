/*
 *  @Autor: Adrian Carmona Galvez
 *  @Curso: 1º Dam
 *  @Modulo: Programacion 
 *  
 *  Aplicacion "Tres o mas" un juego sobre tirar dados y quien consiga mas puntos gana (o empata si es el caso).
 * 
 */
public class TresOMas {
    
    /* (esto lo he hecho para entender como va)
     * 5 dados de 6 caras en cada jugada
     * si sacas 3 dados iguales ganas 3 puntos,
     *  4 dados iguales son 6 puntos,
     *  5 son 12 puntos
     * Y si salen 2 iguales no ganamos pero tiramos otra vez
     * 
     * El que gana a 10 rondas
     */

    /*
     * El main del programa donde imprime el titulo del juego y entra en las 10 rondas que se juegan
     */
    public static void main(String[] args) throws Exception {
        System.out.println("TRES O MÁS");

        // entra en el bucle for que son el total de las rondas
        int[] puntosTotales = {0,0};
        for (int i = 1; i <= 10; i++) {
            puntosTotales = partida(i,puntosTotales);
            if (i != 10) {
                System.out.println("Pulse INTRO para la siguiente ronda");
                System.console().readLine();
            }
        }

        // cuando termina el bucle es que termina las rondas argo entran aqui
        System.out.println("\nFin de la partida");
                if (puntosTotales[0] > puntosTotales[1]) {
                    System.out.println("¡Gana el jugador 1 con "+puntosTotales[0]+" puntos!");
                } else  if (puntosTotales[0] < puntosTotales[1]) {
                    System.out.println("¡Gana el jugador 2 con "+puntosTotales[1]+" puntos!");
                } else {
                    System.out.println("¡Empate con "+puntosTotales[0]+" puntos!");
                }
    }

    /*
     * prepara cada ronda para lanzarla y devolviendo el puntage total de los dos jugadores
     *  puntosTotales[0] es el jugador 1,
     *  puntosTotales[1] es el jugador 2,
     */
    public static int[] partida(int tiradas, int[] puntosTotales) {
        int jugadorUno = 0;
        int jugadorDos = 0;
        while (jugadorUno < 3 && jugadorDos < 3) {
            jugadorUno = 0;
            jugadorDos = 0;
            do { 
                // jugador 1
                jugadorUno = tiradas(tiradas, 1);
            } while (jugadorUno == 1); // si es 1 vuelve a dar una vuelta
            if (jugadorUno < 3) {
                do {
                    // jugador 2
                    jugadorDos = tiradas(tiradas, 2);
                } while (jugadorDos == 1);
            }
        }

        // comprueba que quien ha ganado y le da los puntos
        if (jugadorUno > 2 && jugadorDos < 2) {
            puntosTotales[0] += jugadorUno;
        } else {
            puntosTotales[1] += jugadorDos;
        }
        System.out.println("Fin de ronda "+tiradas+" ; Jugador 1 - "+puntosTotales[0]+" puntos ; Jugador 2 - "+puntosTotales[1]+" puntos");

        return puntosTotales;
    }

    /*
     * Funcion que pinta y prepara las tiradas, comrpobando el puntaje y devolviendolo 
     */
    public static int tiradas(int tiradas, int jugador) {
        int[] numerosSacados = new int[6];
        System.out.print("Tirada "+tiradas+" del jugador "+jugador+": ");
        int[] dados = dados();
        /* Pintamos por pantalla los dados y guardamos la cantidad de cada numero en el array numerosSacados */
        for (int i = 0; i < 5; i++) {
            System.out.print(dados[i]);
            numerosSacados[dados[i] - 1]++;
            if (i < 4) {System.out.print("-");} // para poner los guiones en los dados ( si no es el ultimo lo pone )
        }

        // aqui comprueba los puntos ganados y si es una tirada extra imprimiendolo por pantalla
        int puntos = comprobadorSacados(numerosSacados);
        if (puntos == 1) {System.out.print("; Tirada Extra");} // si es 1 es la tirada extra ya que ese puntaje no se usa
        System.out.println();

        return puntos;
    }

    /*
     * Una funcion que comprueba cual es el resultado de las tiradas
     */
    public static int comprobadorSacados(int[] sacados) {
        int puntos = 0;
        for (int i = 0; i < 5; i++) {
            if (sacados[i] == 2) {puntos = 1;} // un punto implica "Tirada extra"
            if (sacados[i] == 3) {puntos = 3;} // 3 puntos si son 3
            if (sacados[i] == 4) {puntos = 6;} // 6 puntos si son 4
            if (sacados[i] == 5) {puntos = 12;} // 12 puntos si son 5 
        }
        return puntos; // si devuelve 0 nada
    }
    
    /*
     * Genera 5 numeros entre el 1 al 6
     */
    public static int[] dados() {
        int[] dados = {0,0,0,0,0,0};
        for (int i = 0; i < 6; i++) {
            dados[i] = (int)(Math.random() * 6 + 1);
        }
        return dados;
    }
}
