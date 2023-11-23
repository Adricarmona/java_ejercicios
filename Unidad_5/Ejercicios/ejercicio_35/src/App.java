public class App {
    public static void main(String[] args) throws Exception {
        // titulo y pregunta
        System.out.println("ejercicio_35");
        int altura = 0;
        do {
            System.out.print("Por favor, introduzca la altura de la X: ");
            altura = Integer.parseInt(System.console().readLine()); // pedimos la altura
        } while (3 > altura);

        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < altura; j++) { // anchura
                if ((i == j) || (j == (altura-(i+2))+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(""); // salto de linea para la forma
        }
    }
}
