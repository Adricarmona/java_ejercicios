import funciones.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre = converteEnPalotes(996622);
        System.out.println(nombre);
    }

    public static String converteEnPalotes(int n) {
        n = generales.voltea(n);
        String palabra = "";
        while (n > 0) {
            int numTrasformar = n%10; // coge el numero ultimo
            n = n/10; // quita el ultimo numero

            // pone la cantidad de palotes en la palabra
            for (int i = 0; i < numTrasformar; i++) {palabra = palabra + "|";} 

            if (n > 0) {palabra = palabra + "-";}// detecta para poner espacios
        }
        
        return palabra;
    }
}
