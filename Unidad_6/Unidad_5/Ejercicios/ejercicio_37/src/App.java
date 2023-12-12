public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_37");
        int num = 0; // empezamos la variable
        do {
        System.out.println("Por favor, introduzca un número entero positivo: ");
        num = Integer.parseInt(System.console().readLine()); // ingresamos el numero
        } while (num < 0);
        System.out.println("El "+num+" en decimal es el ");
        num = vuelta(num); // le damos la vuelta al numero para trabajar con el

        for (int i = num; i > 0; i/=10) { // vamos comprobando cada numero
            for (int j = i%10; j > 0; j--) { // cambiamos los numeros por barras
                System.out.print(" | ");
            }
            if (0 != (i/10)%10) {System.out.print(" - ");} // si es la ultima no imprime guion
        }
    }

    public static int vuelta(int num) {
        int tmp = 0; // una variable temporal para darle la vuelta al numero
        for (int i = num; i > 0; i/=10) {
            tmp *= 10; // adelantamos el numero a la izquierda (si es 0 no hace nada)
            tmp = tmp + (i % 10); // metemos el dato qe queremos en la casilla
        }
        return tmp; // devolvemos el numero hecho
    }
}
