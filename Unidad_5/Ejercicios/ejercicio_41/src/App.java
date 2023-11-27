public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_41");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Integer.parseInt(System.console().readLine());
        System.out.print("El "+num+" contiene ");
        long pares = 0;
        long impares = 0;
        for (long i = num; i > 0; i/=10) {
            if ((i % 10) % 2 == 0 ) {// pares
                pares = pares + i % 10;
                pares *= 10;
            } 
            if ((i % 10) % 2 != 0 ) {// impares
                impares =impares + i % 10;
                impares *= 10;
            } 
        }
        pares /= 10; // le quitamos el 0 final que se genera
        impares /= 10;
        System.out.println(longitud(pares)+" digitos pares y "+longitud(impares)+" digitos impares");
    }

    public static long longitud(long num) {
        long tmp = 0;
        for (long i = num; i > 0; i/=10) {
            tmp++;
        }
        return tmp;
    }
}
