public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 32");

        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitud = Integer.parseInt(System.console().readLine());
        int espacios = 3;
        int lado = 0;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            camino();
            lado = (int)(Math.random() * 3);
            if (lado == 1) {
                espacios++;
            } else if (lado == 2) {
                espacios--;
            }
        }
        
    }

    public static void camino() {
        int obstaculo = (int)(Math.random() * 3);
        int pos = (int)(Math.random() * 4);
        System.out.print("|");
        for (int i = 0; i < 4; i++) {
            if (pos == i) {
                if (obstaculo == 0) {
                    System.out.print("O");
                } else if (obstaculo == 1) {
                    System.out.print("*");
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("|");
    }
}