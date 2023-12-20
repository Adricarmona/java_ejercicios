public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 5");
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d num: ", i );
            num[i] = Integer.parseInt(System.console().readLine());
        }
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if (num[i] > maximo) {
                maximo = num[i];
            } else if (num[i] < minimo) {
                minimo = num[i];
            }
        }
        System.out.println("-----------");
        System.out.printf("Maximo = %d\nMinimo = %d\n", maximo, minimo);
    }
}
