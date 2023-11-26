public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 36");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());

        int tmp = 1; // para calcular el factorial de cada numero
        // entramos en el for para hacer la factorizacion
        for (int i = 1; i <= num; i++) { // la comprobacion de todas la factorizaciones que tenemos que hacer
            System.out.print(i+"! = ");
            for (int j = 1; j <= i; j++) { // para calcular el factorial
                tmp = tmp * j; // vamos multiplicando los numeros hasta lleagar al indicado
            }
            System.out.println(tmp);
            tmp = 1; // vaciamos tmp para que pueda segir calculandolo 
        }
    }
}
