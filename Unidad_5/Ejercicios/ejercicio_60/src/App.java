public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 60");
        int num = 0; // la altura del calcetin
        do {
            System.out.print("Introduzca la altura de los calcetines: ");
            num = Integer.parseInt(System.console().readLine());
        } while (num < 4);

        for (int i = 0; i < num - 2; i++) {
            System.out.println("***    ***");
        }

        for (int i = 0; i < 2; i++) {
        System.out.println("****** ******");
        }
    }
}