public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 44");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Integer.parseInt(System.console().readLine());
        num = dalavuelta(num);
        System.out.print("Introduzca la posición donde quiere insertar: ");
        long pos = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el nuevo dígito: ");
        long inser = Integer.parseInt(System.console().readLine());
        long vueltas = 1; // las vuetas que le das al bucle

        System.out.print("El número resultante es ");
        while (num > 0) {
            if (vueltas == pos) {
                System.out.print(inser);
            } else {
                System.out.print(num%10);
            }
            num /= 10;
            vueltas ++;
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
