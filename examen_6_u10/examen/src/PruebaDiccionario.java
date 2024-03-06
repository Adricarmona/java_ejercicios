// Codigo por Adrian Carmona 1º DAM

public class PruebaDiccionario {
    public static void main(String[] args) throws Exception {
        Diccionario diccionario = new Diccionario();
        int opcion = 0;
        do {
            System.out.println("\n~~Diccionario~~");
            System.out.println("1º - Consultar entrada");
            System.out.println("2º - Añadir entrada");
            System.out.println("3º - Borrar una entrada completa del diccionario");
            System.out.println("4º - Borrar un significado en castellano");
            System.out.println("5º - Salir");
            System.out.print("-> ");
            try {
                opcion = Integer.parseInt(System.console().readLine());
                opciones(diccionario,opcion);
            } catch (Exception e) {
                System.out.println("\n#Se esperaba un valor numerico entero.");
            }
        } while (opcion != 5);
            System.out.println("¡¡ Adios !!");
    }

    /**
     * Segun la opcion elegida hace una cosa o otra
     * @param diccionario: el diccionario donde se hacen las cosas dado anteriormente
     * @param opcion: la opcion elegida
     */
    public static void opciones(Diccionario diccionario, int opcion) {
        String ingles = "";
        String espanol = "";
        System.out.println("");
        switch (opcion) {
            case 1:
                System.out.print("Ingles -> ");
                ingles = System.console().readLine();
                diccionario.consularEntradas(ingles);
                //System.out.println(diccionario);
                break;
            case 2:
                System.out.print("Ingles -> ");
                ingles = System.console().readLine();
                System.out.print("Español -> ");
                espanol = System.console().readLine();
                diccionario.anadirEntradas(ingles, espanol);
                break;
            case 3:
                System.out.print("Ingles -> ");
                ingles = System.console().readLine();
                diccionario.borrarEntradas(ingles);
                break;
            case 4:
                System.out.print("Ingles -> ");
                ingles = System.console().readLine();
                System.out.print("Español -> ");
                espanol = System.console().readLine();
                diccionario.borrarEntradaConcreto(ingles, espanol);
                break;    
            default:
        }
    }
}
