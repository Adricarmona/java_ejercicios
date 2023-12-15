public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 30");
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());

        // la altura y la anchura del pez 1
        int altura_pez1 = (int)(Math.random() * (altura - 2) + 1 );
        int anchura_pez1 = (int)(Math.random() * (anchura - 2) + 1 );

        // la altura y la anchura del pez 2
        int altura_pez2 = (int)(Math.random() * (altura - 2) + 1 );
        int anchura_pez2 = (int)(Math.random() * (anchura - 2) + 1 );

        // si las posiciones son iguales del pez 2 y el 1
        while (anchura_pez1 == anchura_pez2 && altura_pez1 == altura_pez2) {
            altura_pez2 = (int)(Math.random() * (altura - 2) + 1 );
            anchura_pez2 = (int)(Math.random() * (anchura - 2) + 1 );
        }

        // la altura y la anchura del pez 3
        int altura_pez3 = (int)(Math.random() * (altura - 2) + 1 );
        int anchura_pez3 = (int)(Math.random() * (anchura - 2) + 1 );

        // si las posiciones son iguales del pez 3
        while ((anchura_pez1 == anchura_pez3 && altura_pez1 == altura_pez3) && (anchura_pez2 == anchura_pez3 && altura_pez2 == altura_pez3)) {
            altura_pez3 = (int)(Math.random() * (altura - 2) + 1 );
            anchura_pez3 = (int)(Math.random() * (anchura - 2) + 1 );
        }

        // empezamos a pintar
        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < anchura; j++) { // anchura
                if (j == 0 || i == 0 || j == anchura - 1 || i == altura - 1) {
                    System.out.print("*");
                } else if (j == anchura_pez1 && i == altura_pez1) {
                    System.out.print("&");
                } else if (j == anchura_pez2 && i == altura_pez2) {
                    System.out.print("$");
                } else if (j == anchura_pez3 && i == altura_pez3) {
                    System.out.print("@");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}