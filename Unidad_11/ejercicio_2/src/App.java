import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 2");
        BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

        String linea = br.readLine();
        String total = linea;

        while (linea != null) {
            linea = br.readLine();
            if (linea != null) {
                total += " ,"+linea;
            }
        }

        System.out.println(total);

        br.close();
    }
}
