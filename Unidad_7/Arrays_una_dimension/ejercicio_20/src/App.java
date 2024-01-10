public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 20\n");

        pidiendo_reyes();
    }

    /*
     * Pide el numero de reyes y luego rellenas el array con los nombres y 
     * devuelve el array con los reyes
     */
    public static String[] pidiendo_reyes() {
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int cantidad_reyes = Integer.parseInt(System.console().readLine()); 
        String reyes[] = new String[cantidad_reyes];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for (int i = 0; i < reyes.length; i++) {
            reyes[i] = System.console().readLine();
        }
        asignando_reyes(reyes,cantidad_reyes);
        return reyes;
    }

    /*
     * recibe los reyes y la cantidad, va dandole vueltas a los nombres y metiendose en la funcion 
     * "cuantos_reyes" para contar cual numero son
     */
    public static void asignando_reyes(String[] reyes, int caltidad_reyes) {
        String[] reyes_cogidos = new String[caltidad_reyes];
        System.out.println("\nLos reyes introducidos son: ");
        for (int i = 0; i < reyes.length; i++) {
            System.out.println(reyes[i]+" "+cuantos_reyes(reyes, i)+"º");
        }
    }

    /*
     *  Cuenta cuantos reyes con el mismo nombre hay detras del mencionado
     *  si es el primero como no hay detras dice 1º y si hay 2 dice que es el 3º.
     */
    public static int cuantos_reyes(String[] reyes, int posicion) {
        int cuantos_hay = 0;
        for (int i = 0; i <= posicion; i++) {
            if (reyes[i].equals(reyes[posicion])) {
                cuantos_hay++;
            }
        }
        return cuantos_hay;
    }
}
