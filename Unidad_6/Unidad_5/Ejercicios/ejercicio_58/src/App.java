public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicios 58");
        long num = 0;
        do {
            System.out.print("Introduzca un número: ");
            num = Integer.parseInt(System.console().readLine()); 
        } while (num < 0);

        double media = 0;
        int vueltas = 0;
        while (num > 0) {
            media += num % 10;
            vueltas++;
            num /= 10;
        }

        System.out.println("La media de sus dígitos es "+ media/vueltas);
    }
}
