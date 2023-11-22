public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int altura = 0; // la altura que pide de la piramide


        // titulo y pregunta de la altura
        System.out.println("Ejercicio_31");
        do {    
        System.out.print("Introduzca la altura de la L: ");
        altura = Integer.parseInt(System.console().readLine());
        if (altura < 0) {System.out.println("La altura tiene que ser positiva");}
        } while (altura < 0); // entramos en un bucle si no pones un numero positivo

        // hacemos la L
        for (int i = 0; i < altura; i++) { // para calcular la altura
            System.out.print("*");
            if (altura - 1 == i) { // si estamos al final de la L entramos
                for (int j = 0; j < (altura / 2); j++) {System.out.print("*");} // pintamos la altura
            }
            System.out.println(""); // el salto de linea para la forma
        }

    }
}
