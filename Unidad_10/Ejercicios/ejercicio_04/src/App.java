import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca palabras");
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+"->");
            palabras.add(System.console().readLine());
        }

        for (String palabra : palabras) {
            System.out.print(palabra+" ");
        }
    }
}