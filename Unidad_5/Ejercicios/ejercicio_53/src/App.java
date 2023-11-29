public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 53");
        int num = 0;
        do {
        System.out.print("Introduzca la altura de la figura: ");
        num = Integer.parseInt(System.console().readLine());
        } while (num < 0);

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
