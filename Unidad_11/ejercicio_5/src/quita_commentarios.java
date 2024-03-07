import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class quita_commentarios {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercico 5");

        try {
            comrpobadorExistencia(args[0]);
        } catch (Exception e) {
            System.out.println("Error: Se esperaban dos parametros");
        }
    }


    // funcin que comprueba la existencia del archivo
    public static void comrpobadorExistencia(String primerParametro){
        try {
            BufferedReader archivoLectura = new BufferedReader(new FileReader(primerParametro));
            eliminadorComentarios(sacaComentarios(archivoLectura)); 
            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (Exception e) {
            System.out.println("Error: Error no barajado");
        }
    }

    // saca los comentarios de los archivos
    public static ArrayList<String> sacaComentarios(BufferedReader archivo) throws IOException {
        ArrayList<String> texto = new ArrayList<String>();
        String linea = "";
        do {
            linea = archivo.readLine();
            if (linea != null) {
                texto.add(linea+"\n");                
            }
        } while (linea != null);

        return texto;
    }

    // comrpueba donde tiene los comentarios
    public static void eliminadorComentarios(ArrayList<String> lista) {
        boolean escribe = true;
        String archivo = "";
        for (String frase : lista) {
            for (int i = 0; i < frase.length(); i++) {
                if (escribe) {
                    if (frase.charAt(i) == '/' && frase.charAt(i+1) == '/') {
                        escribe = false;
                    } else {
                        archivo += frase.charAt(i);
                    }
                } else {
                    System.out.println(frase.charAt(i)+frase.charAt(i+1));
                    if (frase.charAt(i) == '\\' && frase.charAt(i+1) == 'n') {
                        escribe = true;
                        archivo += "\n";
                    }
                }
            }
        }
        System.out.println(archivo);
    }
}
