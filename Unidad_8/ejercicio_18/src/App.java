import matematicas.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 18");

        /*
         * preguntamos el decimal y asignamos logitud y binario para ir dadole iteraciones y datos
         * en ese orden
         */
        System.out.print("\nIndica el numero decimal que quieras meterlo a binario: ");
        int decimal = Integer.parseInt(System.console().readLine());
        int binario = 0;
        int longitud = 0;

        /*
         * pasamos el numero a binario y medimos su longitud
         */
        do {
            binario *= 10; 
            binario += decimal % 2;
            decimal /= 2;
            longitud++;         
        } while (decimal > 0);

        /*
         * añadimos 0 al final del numero segun la longitud del mismo
         */
        while (longitud != calculo.longitudNumero(binario) ) {
            binario = calculo.pegaPorDetras(0, binario);
        }

        // imprimimos el dato
        System.out.print("El numero en binario es: "+binario);
    }
}
