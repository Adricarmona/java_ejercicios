import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1");
        BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

        for (int i = 2; i < 501; i++) {
            if (esPrimo(i)) {
                bw.write(i+"\n");
            }
        }

        bw.close();
    }

    /*
    * Comprueba si el numero es primo
    */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < (int)Math.sqrt(num); i++) {
            if ((num%i) == 0)
                primo = false;
        }
        return primo;
    }
}
