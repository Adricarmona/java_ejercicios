public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 20");
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int litros = Integer.parseInt(System.console().readLine());
        int litros_llenos = (int)(Math.random() * (litros + 1));

        // pintamos el cubo con el agua
        for (int i = 0; i < litros + 1; i++) { // altura
            for (int j = 0; j < 6; j++) { // anchura
                if (j == 0 || j == 5 || i == litros) {
                    System.out.print("*");
                } else if (i < litros - litros_llenos) {
                    /*
                     * Calculamos la cantidad de espacios restando los litros
                     * con la cantidad de liquido que tendria el cubo
                     */
                    System.out.print(" ");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println("");// salto de linea
        }
        System.out.println("La cuba tiene una capacidad de "+litros+" litros y contiene "+litros_llenos+" litros de agua.");
    }
}
