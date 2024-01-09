/*
 *  @Autor: Adrian Carmona
 *  @nick_github: Adricarmona
 *  
 *  Variables
 *  ---------
 *  mesas = las mesas y la cantidad de clientes que hay dentro
 *  clientes = son los clientes pedidos en cada caso
 *  posicion = es la posicion de mesas donde se va a meter el cliente indicado
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 15");
        
        /*
         * generamos el array de mesas y le metemos el valor generado en la funcion mesas aleatorio
         * metiendole a la funcion un integer de 10 de longuitud
         */
        int mesas[] = mesas_aleatorio(new int[10]);
        int clientes = 0;
        int posicion = 0;
        do {
            clientes = asignando_mesas(mesas);
            posicion = cambiar_posiciones(clientes, mesas);
            if (clientes != -1 && posicion != -1) {mesas[posicion] += clientes;} // si no es -1 clientes y posiciones suma los clientes a la posicion 
        } while (clientes != -1);
    }

    public static int cambiar_posiciones(int clientes ,int[] mesas) {
        // comprobamos si hay un 0 y devolvemos la posicion
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                return i;
            }
        }

        // comprobamos si hay un 1 y devolvemos la posicion
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 1 && clientes < 4) {
                return i;
            }
        }
        
        // comprobamos si hay un 2 y devolvemos la posicion
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 2 && clientes < 3) {
                return i;
            }
        }

        // comprobamos si hay un 3 y devolvemos la posicion
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 3 && clientes < 2) {
                return i;
            }
        } 
        System.out.println("Lo siento, en estos momentos no queda sitio.\n");
        return -1;
        // ponemos -1 para que no entre en el caso de que cierre el programa o que añada clientes a una mesa
    }

    public static int[] mesas_aleatorio(int [] mesas) {
        /*
         * genera numeros aleatorios del 0 al 4 en las 10 posiciones del array
         */
        for (int i = 0; i < 10; i++) {
            mesas[i] = (int)(Math.random()*5);
        }
        return mesas;
    }

    public static int asignando_mesas(int[] mesas) {
        imprimir_mesas(mesas);
        System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int clientes = Integer.parseInt(System.console().readLine());

        // nos salimos del programa en esta opcion
        if (clientes == -1) {
            System.out.println("Gracias. Hasta pronto.");
            return clientes;
        }

        // si son mas de 4 y no caben en ninguna mesa
        if (clientes > 4) {
            System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
        }

        // si ingresan 0 personas
        if (clientes == 0) {
            System.out.println("No se puede sentar nadie en la mesa");
        }

        // si son el numero que puedan entrar en una mesa
        return clientes;
    }


    public static void imprimir_mesas(int[] mesas) {
        /*
         * Imprimimos la parte de arriba
         */
            //Linea de arriba
        System.out.printf("┌─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┬────");}
        System.out.printf("┐\n");

            //Linea del medio
        System.out.printf("│ Mesa nº ");
        for (int i = 0; i < 10; i++) {System.out.printf("│ %2d ", (i+1));}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("├─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┼────");}
        System.out.printf("┤\n");

        /*
         * Imprimimos la parte de abajo
         */
            //Linea de arriba
        System.out.printf("│Ocupación");
        for (int i = 0; i < 10; i++) {System.out.printf("│ %2d ", mesas[i]);}
        System.out.printf("│\n");

            //Linea de abajo
        System.out.printf("└─────────");
        for (int i = 0; i < 10; i++) {System.out.printf("┴────");}
        System.out.printf("┘\n");
    }
}
