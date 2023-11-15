public class App {
    public static void main(String[] args) throws Exception {
        boolean primo = false;
        System.out.println("Ejercicio_22 -> numeros primos");
        for (int i = 2; i <= 100; i++) { // bucle donde comprobamos todos los numeros del 2 al 100
            primo = EsPrimo(i); // nos metemos en la funcion de EsPrimo para comprobarlo
            if (primo == true) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean EsPrimo (int num) {
        boolean primo = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if ((num%i) == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
