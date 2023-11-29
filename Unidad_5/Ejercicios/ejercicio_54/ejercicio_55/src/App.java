public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio 55");
        System.out.print("Introduzca un número: ");
        long num = Integer.parseInt(System.console().readLine());
        
        int primer = 0;
        int primero = 1;

        System.out.print("El número resultado es ");
        System.out.print(num % 10);
        num /= 10;
        num = dalavuelta(num);
        while (num > 0) {
            System.out.print(num%10);
            num/=10;
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