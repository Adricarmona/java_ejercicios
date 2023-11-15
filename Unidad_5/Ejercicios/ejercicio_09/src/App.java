public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0;
        int longitud = 0;

        // primer texto y el lector de linea
        System.out.println("Introduzca un numero por teclado");
        System.out.print("-->");
        num = Integer.parseInt(System.console().readLine());

        // entra en el bucle
        while (num > 0) {
            longitud++;
            num = num / 10;
        }

        // imprime la longitud
        System.out.println("La longitud es "+longitud);
    }
}
