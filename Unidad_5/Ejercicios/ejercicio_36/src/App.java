public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_36"); // titulo y pregunta
        long num = 0; // generamos la variable del num
        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = Integer.parseInt(System.console().readLine()); // pedimos un long 
        } while (num < 0);

        int logitud_num = 0;
        for (int i = 0; i < num ; i++) {logitud_num++;}//longitud total numero
    }
}
