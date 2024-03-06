import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 3");
        System.out.print("1º archivo a coger ->");
        String archivo1 = System.console().readLine();
        System.out.print("2º archivo a coger ->");
        String archivo2 = System.console().readLine();
        System.out.print("archivo donde meter ->");
        String archivo3 = System.console().readLine();

        BufferedReader br1 = new BufferedReader(new FileReader(archivo1));
        BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo3));

        String linea1 = "";
        String linea2 = "";
        while (linea1 != null && linea2 != null) {
            linea1 = br1.readLine();
            if (linea1 != null) {
                bw.write(linea1+"\n");
            }
            linea2 = br2.readLine();
            if (linea2 != null) {
                bw.write(linea2+"\n");
            }
        }

        br1.close();
        br2.close();
        bw.close();
    }
}
