public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 24");
        
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        int elegido = (int)(Math.random() * longi(num)); // la posicion del numero elegido
        
        for (int i = 0; i < elegido; i++) {
            num /= 10; // acortamos el numero hasta el elegido
        }

        System.out.println(num % 10); // imprimimos el elegido
    }

    public static int longi(int num) { //mide la longitud de un numero
        int tmp = 0;
        for (int i = num; i > 0; i/=10) {
            tmp += 1;
        }
        return tmp;
    }
}
