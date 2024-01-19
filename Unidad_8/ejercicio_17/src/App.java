import matematicas.calculo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 17");

        System.out.print("\nIndica el numero binario que quieras pasar a decimal:");
        int binario = Integer.parseInt(System.console().readLine());
    
        int posicion = 0;
        int total = 0;
        while (binario > 0) {
            if (binario%10 == 1) {
                total += calculo.potencia(2, posicion);
            }
            binario /= 10;
            posicion++;
        }

        System.out.println("Es "+total+" en decimal");
    }
}
