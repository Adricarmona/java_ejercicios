public class App {
    public static void main(String[] args) throws Exception {
        // titulo y preguntando la altura
        System.out.println("ejercicio_33");
        System.out.print("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(System.console().readLine());
        int anchura = altura; // metemos la altura e anchura ya que la U es 

        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < anchura; j++) {
                if (i == altura - 1) { // si es el final de la U
                    if (j == 0 || j == anchura - 1) {
                        System.out.print("-"); // imprimimos espacios
                    } else {
                        System.out.print("*"); // imprimimos asteriscos
                    }
                } else { // para hacer el resto de la U
                    if (j == 0 || j == anchura - 1) {
                        System.out.print("*"); // imprimimos asteriscos
                    } else {
                        System.out.print("-"); // imprimimos espacios
                    }
                }
            }
            System.out.println("");
        }
    }
}