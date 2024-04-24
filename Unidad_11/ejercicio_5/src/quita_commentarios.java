import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class quita_commentarios {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercico 5\n");

        try {
            comprobadorExistencia(args[0], args[1]);
        } catch (Exception e) {
            System.out.println("Error: Se esperaban dos parametros");
        }

    }


    // funcin que comprueba la existencia del archivo
    public static void comprobadorExistencia(String primerParametro, String segundoParametro){
        try {
            BufferedReader archivoLectura = new BufferedReader(new FileReader(primerParametro));
            escibidor(eliminadorComentarios(sacaComentarios(archivoLectura)), segundoParametro);
            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (Exception e) {
            System.out.println("Error: Error no barajado\n\n"+e);
        }
    }

    // saca los comentarios de los archivos
    public static String sacaComentarios(BufferedReader archivo) throws IOException {
        String texto = "";
        String linea = "";

        do {
            linea = archivo.readLine();
            if (linea != null) {texto += linea+"\n";}
        } while (linea != null);

        return texto;
    }

    // comrpueba donde tiene los comentarios
    public static String eliminadorComentarios(String lista) {
        boolean escribe = true;
        boolean escribeSinSalto = true;
        boolean variasLineas = false;
        String archivo = "";

        int posicion = 0;
        while (posicion < lista.length()) {
            if (escribe && escribeSinSalto) {
                if (lista.charAt(posicion) == '/' && lista.charAt(posicion + 1) == '/') {
                    escribe = false;
                } else if (lista.charAt(posicion) == '/' && lista.charAt(posicion + 1) == '*') {
                    escribeSinSalto = false;
                } else {
                    archivo += lista.charAt(posicion);
                }
            } else {
                if (lista.charAt(posicion) == '\n') {
                    escribe = true;
                    if (!escribeSinSalto && !variasLineas) {
                        archivo += '\n';
                        variasLineas = true;
                    }
                } else if (lista.charAt(posicion) == '*' && lista.charAt(posicion + 1) == '/') {
                    escribeSinSalto = true;
                    variasLineas = false;
                    posicion++;
                }
            }
            posicion++;
        }

        return archivo;
    }

    // Escribe en el archivo indicado
    public static void escibidor(String primerArchivo, String segundoArchivo) throws IOException {
        BufferedWriter archivoAEscribir = new BufferedWriter(new FileWriter(segundoArchivo));
        archivoAEscribir.write(primerArchivo);
        archivoAEscribir.close();
    }
}