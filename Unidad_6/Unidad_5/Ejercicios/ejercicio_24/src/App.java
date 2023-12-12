public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int altura = 0;
        int columna = 1;

        // titulo y preguntas de la altura
        System.out.println("piramide de psicopata");
        System.out.println("------------------");
        System.out.print("Altura -> ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.println("------------------");

        // entramos en el bucle 
        while (altura > 0) {
            // bucle para los espacios
            for (int i = 0; i < altura - 1; i++) {
                System.out.print(" ");
            }
            // bucle para el caracter en el lado izquierdo
            for (int i = 0; i < columna; i++) {
                System.out.print(i + 1);
            }

            // bucle para el caracter en el lado derecho
            for (int i = columna; i > 1; i--) {
                System.out.print(i - 1);
            }
            // modificacion de las variables para que calcule bien los espacios y los caracteres que tiene que rellenar
            columna++;
            altura--;
            System.err.println("");
        }
    }
}
