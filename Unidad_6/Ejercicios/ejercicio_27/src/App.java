public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 27");
        
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador = System.console().readLine().toLowerCase();
        int jugador_num = 0;
        Boolean erroes = false; // por si metemos un error al ingresar una palabra
        switch (jugador) {
            case "papel":
                jugador_num = 1;
                break;
            case "piedra":
                jugador_num = 2;
                break;
            case "tijera":
                jugador_num = 3;
                break;
            default:
                System.out.println("error en la ingresion del la palabra");
                erroes = true;
                break;
        }

        /*
         * Elige la eleccion de la maquina y la pinta por pantalla
         */
        int maquina = (int)(Math.random() * 3 + 1); 
        System.out.print("Turno del ordenador: ");
        switch (maquina) {
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("piedra");
                break;
            case 3:
                System.out.println("tijera");
                break;
            default:
        }

        if (!erroes) {// si no hay erroes
            if (jugador_num == maquina) { 
                // en caso de empate
                System.out.print("Empate");
            } else if ((maquina == 1 && jugador_num == 3) || (maquina == 2 && jugador_num == 1) || (maquina == 3 && jugador_num == 2)) { 
                // en todos los casos que ganemos
                System.out.print("Gana el jugador");
            } else if ((maquina == 1 && jugador_num == 2) || (maquina == 2 && jugador_num == 3) || (maquina == 3 && jugador_num == 1)) {
                // en todos los casos que perdamos
                System.out.print("Gana el ordenador");
            }
        }
    }
}
