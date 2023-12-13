public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 17");
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());

        // la altura y la anchura del pez ahora
        int altura_pez = (int)(Math.random() * (altura - 1) + 1 );
        int anchura_pez = (int)(Math.random() * (anchura - 1) + 1 );

        // empezamos a pintar
        for (int i = 0; i < altura; i++) { // altura
            for (int j = 0; j < anchura; j++) { // anchura
                if (j == 0 || i == 0 || j == anchura - 1 || i == altura - 1) {
                    System.out.print("*");
                } else if (j == anchura_pez && i == altura_pez) {
                    System.out.print("&");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
