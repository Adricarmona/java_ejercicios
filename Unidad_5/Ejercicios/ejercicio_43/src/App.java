public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_43");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        num = dalavuelta(num);
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int pos = Integer.parseInt(System.console().readLine());

        System.out.print("Los números partidos son el ");
        for (int i = 0; i < pos - 1 ; i++) {
            System.out.print(num%10);
            num /= 10;
        }
        System.out.print(" y el ");
        while (num > 0) {
            System.out.print(num%10);
            num /= 10;
        }
    }

    public static int dalavuelta(int num) {
        int tmp = 0;
        while (num > 0) {
            tmp += num % 10;
            tmp *= 10;
            num /= 10;
        }
        return tmp/=10;
    }
}
