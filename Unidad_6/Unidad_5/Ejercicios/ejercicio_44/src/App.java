public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 44");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        num = dalavuelta(num);
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int pos = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int inser = Integer.parseInt(System.console().readLine());
        int vueltas = 1; // las vuetas que le das al bucle

        System.out.print("El número resultante es ");
        while (num > 0) {
            if (vueltas == pos) {System.out.print(inser);}
                System.out.print(num%10);
            num /= 10;
            vueltas ++;
        }
    }

    public static int dalavuelta(int num) {
        int tmp = 0;
        tmp += num % 10;
        while (num > 0) {
            tmp *= 10;
            num /= 10;
            tmp += num % 10;
        }
        return tmp/= 10;
    }
}
