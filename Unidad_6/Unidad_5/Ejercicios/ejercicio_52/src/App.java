public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 52");
        System.out.print("Introduzca un número: ");
        long num = Integer.parseInt(System.console().readLine());
        num = dalavuelta(num);
        int primer = 0;
        int primero = 1;

        System.out.print("El número resultado es ");
        while (num > 0) {
            if (primero == 1) {
                primer = (int)num % 10;
            } else {
                if (!(primero == 2 && num % 10 == 0)) {System.out.print(num%10);}
            }
            primero++;
            num/=10;
        }
        System.out.print(primer);
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
