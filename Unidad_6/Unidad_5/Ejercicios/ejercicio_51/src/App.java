public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 51");
        System.out.print("Introduzca un número entero (mayor que cero): ");
        long num = Integer.parseInt(System.console().readLine());
        long tmp = 0;
        boolean modificado = false;
        num = dalavuelta(num);
        System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
        while (num > 0) {
            if (num % 10 != 0 && num % 10 != 8) {
                tmp += num % 10;
                tmp *= 10;
            }
            if (num % 10 == 0 || num % 10 == 8) {
                modificado = true;
            }
            num /= 10;
        }

        if (modificado) {
            System.out.println(tmp/=10);
        } else {
            System.out.print(".");
        }
    }

    public static long dalavuelta(long num) {
        long tmp = 0;
        tmp += num % 10;
        while (num > 0) {
            tmp *= 10;
            num /= 10;
            tmp += num % 10;
        }
        return tmp/= 10;
    }
}
