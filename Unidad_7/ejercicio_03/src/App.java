public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 3");
        int[] num = new int[11];
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d numero: ", i);
            num[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d - ", num[i]);
        }
    }
}
