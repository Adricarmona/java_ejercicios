import matematicas.calculo;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1;
        do {
            numero = calculo.siguientePrimo(numero);
            if (numero < 1000) {
                System.out.print(numero+" ");
                numero++;
            }
        } while (numero < 1000);
        System.out.println();
    }
}
