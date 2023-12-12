public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 56");
        int num = 0;
        do {
        System.out.print("Introduzca la altura de la figura: ");
        num = Integer.parseInt(System.console().readLine());
        } while (num < 0);
        int espacios = 0;
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            espacios++;
            System.out.println("");
        }
    }
}
