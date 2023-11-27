public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ejercicio_41");
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = Integer.parseInt(System.console().readLine());
        System.out.print("El "+num+" contiene ");
        long pares = 0;
        long impares = 0;
        for (long i = num; i > 0; i/=10) {
            if ((i % 10) % 2 == 0 ) {pares++;} // pares
            if ((i % 10) % 2 != 0 ) {impares++;} // impares
        }
        System.out.println(pares+" digitos pares y "+impares+" digitos impares");
    }
}
