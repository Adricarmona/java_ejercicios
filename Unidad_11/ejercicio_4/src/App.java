import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 4");
        System.out.print("Archivo a ordenar: ");
        String archivo = System.console().readLine();
        try {
            ArrayList<String> archivos = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String datos = br.readLine();
            archivos.add(datos);
            while (datos != null) {
                datos = br.readLine();
                if (datos != null) {
                    archivos.add(datos);
                }
            }
            System.out.println(archivos);
            Collections.sort(archivos);
            System.out.println(archivos);
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivos));
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero"+e);
        }
    }
}
