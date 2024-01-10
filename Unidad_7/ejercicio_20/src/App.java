public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 20\n");

        pidiendo_reyes();
    }

    /*
     * Pide el numero de reyes y luego rellenas el array con los nombres y devuelve el array con los reyes
     */
    public static String[] pidiendo_reyes() {
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int cantidadad_reyes = Integer.parseInt(System.console().readLine()); 
        String reyes[] = new String[cantidadad_reyes];
        System.out.print("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for (int i = 0; i < reyes.length; i++) {
            reyes[i] = System.console().readLine();
        }

        return reyes;
    }
}
