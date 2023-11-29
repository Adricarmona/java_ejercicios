public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 59");
        int altura = 0;
        do {
            System.out.print("Por favor, introduzca la altura del árbol: ");
            altura = Integer.parseInt(System.console().readLine());
        } while (altura < 4);

        // calculamos el grosor que es 2 * (altura - 2) - 1
        int grosor = (2 *(altura - 2)) - 1;

        // pintamos los espacios y  la estrella
        for (int i = 1; i < altura - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // el triangulo
        int lado_iz = altura - 2;
        int lado_de = -1;
        for (int i = 1; i < altura - 2; i++) {
            for (int j = 1; j < lado_iz; j++) { // primeros espacios
                System.out.print(" ");
            }
            System.out.print("^");
            lado_iz--; // le quitamos espacios de la izquierda
            for (int j = 0; j < lado_de; j++) {
                System.out.print(" ");
            }
            lado_de = lado_de + 2; // le añadimos espacios a el centro
            if (i != 1) {
                System.out.print("^");
            }
            System.out.println("");
        }
        
        // pinta la ultima lineas
        System.out.print("");
        for (int i = 0; i < grosor; i++) {
            System.out.print("^");
        }
        System.out.println("");

        // pintamos el tronco
        for (int i = 1; i < altura - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");
    }
}
