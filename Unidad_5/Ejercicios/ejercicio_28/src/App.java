public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int num = 0; // el numero introducido
        int total = 1; //el total del factorial

        // titulo y pregunta el numero
        System.out.println(" ejercicio 28");
        System.out.println("--------------");
        System.out.print("Por favor, introduzca un número entero: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print(num+"! = "); // imprimimos el primer numero para reutilizar una variable
        
        //calculamos la factorial
        for (int i = 1; i < num + 1; i++) {
            total = total * i;
        }
        System.out.println(total);
    }
}
