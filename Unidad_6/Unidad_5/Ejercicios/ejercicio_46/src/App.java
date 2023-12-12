public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 46");
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int altura = Integer.parseInt(System.console().readLine());

        if (anchura >= 2 && altura >= 2) { //el if para ver si la altura indicada sirve
            
            for (int i = 1; i <= altura; i++) { //altura
                for (int j = 1; j <= anchura; j++) {
                    if (j == 1 || i == 1 || i == altura || j == anchura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(""); // salto de linea
            }

        } else {
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }
    }
}
