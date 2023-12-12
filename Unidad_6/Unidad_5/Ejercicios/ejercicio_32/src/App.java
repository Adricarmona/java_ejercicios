public class App {
    public static void main(String[] args) throws Exception {
        // variables
        long num = 0; // long del numero preguntado
        long num_alreves = 0; // long del numero pero para luego darle la vuelta
        long total = 0; // el numero total de las sumas de los pares

        // pregunta del numero y titulo
        do {
            System.out.println("Ejercicio_32");
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = Integer.parseInt(System.console().readLine()); 
        } while (num < 0);

        // le damos la vuelta al numero
        for (long i = num; i > 0; i/=10) {
            num_alreves += (i % 10);
            num_alreves *= 10;
        }
        num_alreves /= 10; // ponemos este calculo para quitarle el numero al numero dado la vuelta

        // calculamos los digitos pares
        System.out.print("Dígitos pares: ");
        for (long i = num_alreves; i > 0; i/= 10) {
            System.out.print(i%10+" ");
            total = (i%10) + total;
        }
        System.out.println(""); // salto de linea

        // el total de los numeros 
        System.out.println("Suma de los digitos pares: "+total);
    }
}
