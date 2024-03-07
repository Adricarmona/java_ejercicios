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
        try {
            String archivo = System.console().readLine();// el archivo que pide
            
            try {
                // el array list de los archivos y el archivo a leer
                ArrayList<String> archivos = new ArrayList<String>();
                BufferedReader br = new BufferedReader(new FileReader(archivo));

                // metemos los datos del archivo al array list
                String datos = br.readLine();
                archivos.add(datos);

                while (datos != null) {
                    datos = br.readLine();
                    if (datos != null) {
                        archivos.add(datos);
                    }
                }

                // con esta variable lo ordenamos
                Collections.sort(archivos);


                // donde selecciona las lineas para volver a meterlas al archivo
                String[] array = archivos.toArray(new String[archivos.size()]);
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                for (String string : array) {
                    bw.write(string+"\n");;
                };

                // cerramos los archivos de escritura y de lectura
                bw.close();
                br.close();

                // los errores
            } catch (FileNotFoundException e) {
                System.out.println("No existe el fichero");
            }        
        } catch (Exception e) {
            System.out.println("Error en el nombre introducido");
        }

    }
}
