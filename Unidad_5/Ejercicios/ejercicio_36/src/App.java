public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_36"); // titulo y pregunta
        long num = 0; // generamos la variable del num
        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = Integer.parseInt(System.console().readLine()); // pedimos un long 
        } while (num < 0);
        boolean capicua = true; // El buleano que comprueba si es capicua al menos que cambie es verdadero
        long alreves = vuelta(num); // para hacer una variable con el numero alreves


        for (int i = 10; num/i > 0; i*=10) {
            if (num%i != alreves%i) {capicua = false;}// si no es capicua
        }

        if (capicua == true) { // escribimos si es capicua o no
            System.out.println("Es "+num+" es capicua.");
        } else {
            System.out.println("No es "+num+" es capicua.");
        }
    }

    public static long vuelta(long num) {
        long tmp = 0; // una variable temporal para darle la vuelta al numero
        for (long i = num; i > 0; i/=10) {
            tmp *= 10; // adelantamos el numero a la izquierda (si es 0 no hace nada)
            tmp = tmp + (i % 10); // metemos el dato qe queremos en la casilla
        }
        return tmp; // devolvemos el numero hecho
    }
}
